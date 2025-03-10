import java.util.Scanner;
public class phanso {
    private int tu;
    private int mau;

    public phanso () {
        this.tu = 0;
        this.mau = 1;
    }
    public phanso (int tu, int mau) {
        this.tu = tu;
        this.mau = (mau != 0) ? mau : 1; 
        rutGon();
    }
    public phanso (phanso  p) {
        this.tu = p.tu;
        this.mau = p.mau;
    }
public void nhapps (){ 
        Scanner kb = new Scanner(System.in);
        System.out.print("nhap tu so: ");
        this.tu = kb.nextInt();
        do {
        System.out.print("nhap mau so khac 0: ");
            this.mau = kb.nextInt();
        if  (this.mau == 0){
            System.out.println("nhap lai! khac 0");
        }
 }while(this.mau == 0);
rutGon();
}

public void xuatps() {
    System.out.println(this.tu+"/" + this.mau);
    }
    private int USCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    private void rutGon() {
     int uscln = USCLN(this.tu, this.mau);
        this.tu /= uscln;
        this.mau/= uscln;
    }

    public phanso  cong(phanso  p) {
        int tuMoi = this.tu * p.mau + p.tu * this.mau;
        int mauMoi = this.mau * p.mau;
        return new phanso (tuMoi, mauMoi);
    }

public phanso  tru(phanso  p) {
        int tumoi = this.tu * p.mau - p.tu * this.mau;
        int maumoi = this.mau * p.mau;
        return new phanso (tumoi, maumoi);
    }
public phanso  nhan(phanso  p) {
        int tumoi = this.tu * p.tu;
        int maumoi = this.mau * p.mau;
        return new phanso (tumoi, maumoi);
    }
public phanso chia(phanso p) {
        int tumoi = this.tu * p.mau;
        int maumoi = this.mau* p.tu;
        return new phanso(tumoi, maumoi);
    }


}
