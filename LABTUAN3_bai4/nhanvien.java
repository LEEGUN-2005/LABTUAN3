import java.util.Scanner;
class nhanvien {
    private String maso;
    private String hoten;
    private double luongcoban;
    private double hesoluong;
    
    public nhanvien() {
        this.maso = "";
        this.hoten = "";
        this.luongcoban = 0.0;
        this.hesoluong= 0.0;
    }

    public nhanvien(String maSo, String hoTen, double luongCoBan, double heSoLuong) {
        this.maso = maso;
        this.hoten = hoten;
        this.luongcoban= luongcoban;
        this.hesoluong= heSoLuong;
    }
public nhanvien(nhanvien nv) {
        this.maso = nv.maso;
        this.hoten= nv.hoten;
        this.luongcoban= nv.luongcoban;
        this.hesoluong= nv.hesoluong;
    }

public String getmaso() {
return maso;
    }
public void setmaso(String maso) {
this.maso= maso;
    }
    public String gethoten() {
        return hoten;
    }
    public void sethoten(String hoten) {
        this.hoten= hoten;
    }
    public double gethesoluong() {
        return hesoluong;
    }
    public void sethesoluong(double hesoluong) {
        this.hesoluong= hesoluong;
    }
public void nhapnv() {
        Scanner kb = new Scanner(System.in);
        System.out.print("nhap ma so: ");
        maso = kb.nextLine();
        System.out.print("nhap ho ten: ");
        hoten= kb.nextLine();
        System.out.print("nhap luong: ");
        luongcoban= kb.nextDouble();
        System.out.print("nhap he so luong: ");
        hesoluong=kb.nextDouble();
    }

    public double tinhluong() {
        return luongcoban* hesoluong;
    }
    public void xuatnv() {
        System.out.println("ma so: " +maso);
        System.out.println("ho ten: " + hoten);
        System.out.println("luong co ban: " + luongcoban);
        System.out.println("he so luong: " + hesoluong);
        System.out.println("luong nhan: " + tinhluong());
    }
}
