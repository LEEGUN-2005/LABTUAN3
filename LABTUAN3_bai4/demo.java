import java.util.Scanner;
class demonhanvien {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        nhanvien nv1 = new nhanvien();
        nhanvien nv2 = new nhanvien("123", "nguyen van a", 5000000, 2.5);
        nhanvien nv3 = new nhanvien(nv2);

        System.out.println("Nhap thong tin nhan vien 1:");
        nv1.nhapnv();
        
        System.out.println("\nThong tin nhan vien 1:");
        nv1.xuatnv();
        System.out.println("\nThong tin nhan vien 2:");
        nv2.xuatnv();
        System.out.println("\nThong tin nhan vien 3:");
        nv3.xuatnv();

        System.out.print("\nNhap ho ten moi cho nhan vien 1: ");
        nv1.sethoten(kb.nextLine());
        System.out.println("Thong tin moi cua nhan vien 1:");
        nv1.xuatnv();

        nhanvien maxhslnv = nv1;
        if (nv2.gethesoluong() > maxhslnv.gethesoluong()) {
            maxhslnv = nv2;
        }
        if (nv3.gethesoluong() > maxhslnv.gethesoluong()) {
            maxhslnv = nv3;
        }
        System.out.println("\nNhan vien co he so luong cao nhat:");
        maxhslnv.xuatnv();

        dsnv dsnv = new dsnv();
        dsnv.nhapdanhsach();
        dsnv.xuatdanhsach();

        dsnv.insoluongnhanvien();

    }


}

