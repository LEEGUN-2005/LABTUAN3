import java.util.Scanner;

public class hocsinh {
    private String maso;
    private String hoten;
    private double dtb;

    public String getmaso() {
        return maso;
    }
    public void setmaso(String maso) {
        this.maso = maso;
    }
    public String gethoten() {
        return hoten;
    }

public void sethoten(String hoten) {
        this.hoten = hoten;
    }

    public double getdtb() {
        return dtb;
    }
    public void setdtb(double dtb) {
        this.dtb = dtb;
    }


    public hocsinh() {
        this.maso = "";
        this.hoten = "";
        this.dtb = 0.0;
    }
    public hocsinh(String maso, String hoten, double dtb) {
        this.maso = maso;
        this.hoten = hoten;
        this.dtb =dtb;
    }
    public hocsinh(hocsinh tmp){
        this.maso=tmp.maso;
        this.hoten=tmp.hoten;
this.dtb=tmp.dtb;
    }


    public void nhap() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap ma so: ");
        maso = kb.nextLine();
        System.out.print("Nhap ho ten: ");
        hoten =kb.nextLine();
        System.out.print("Nhap diem tb: ");
        dtb =kb.nextDouble();
    }

    
    public void xuat() {
        System.out.println("Ma so: " + maso);
        System.out.println("Ho ten: " + hoten);
        System.out.println("diem trung binh: " + dtb);
    }
    
                    
                
            
        
    
}





