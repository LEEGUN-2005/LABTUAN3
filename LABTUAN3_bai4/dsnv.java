import java.util.ArrayList;
import java.util.Scanner;
class dsnv {
    private ArrayList<nhanvien> danhsach;
public dsnv() {
        danhsach = new ArrayList<>();
    }
public void nhapdanhsach() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        int n = kb.nextInt();
        kb.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin nhan vien thu " + (i + 1) + ":");
            nhanvien nv = new nhanvien();
            nv.nhapnv();
        danhsach.add(nv);
        }
    }
public void xuatdanhsach() {
        System.out.println("\nDanh sach nhan vien:");
    for (nhanvien nv : danhsach) {
    nv.xuatnv();
            System.out.println("----------------------");
                  }
    }

    public void insoluongnhanvien() {
        System.out.println("So luong nhan vien trong danh sach: " + danhsach.size());
              }


    }
