import java.util.Scanner;
import java.util.Arrays;
public class dshocsinh{
    private hocsinh[] ds;
    private int soluong;
    private Scanner kb= new Scanner(System.in);
    private double dtb;

    public dshocsinh(){
        ds =new hocsinh[10];
        soluong=0;
    }
    public void nhapds(){
        System.out.println("nhap so luong hoc sinh:");
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.nextLine();

    ds = new hocsinh[n];
    for (int i = 0; i < n; i++) {
        System.out.println("nhap thong tin hoc sinh thu" + (i + 1) + ":");
        ds[i] = new hocsinh();
        ds[i].nhap();
    }
    soluong=n;
    }
    public void inds() {
        System.out.println("danh sach hoc sinh:");
        for (int i = 0; i < soluong; i++) {
            ds[i].xuat();
            System.out.println("--------------------");
}
    }
    public void sapxep() {
        Arrays.sort(ds, (a, b) -> Double.compare(b.getdtb(), a.getdtb()));
}

}
    
