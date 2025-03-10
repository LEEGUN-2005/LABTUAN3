public class demo1 {
    public static void main(String[] args) {

        hocsinh hs1 = new hocsinh();
        hs1.nhap();
        hs1.xuat();

        hocsinh hs2 = new hocsinh("123", "Nguyen Ngoc Lan", 8.5);
        hs2.xuat();

        hocsinh hs3 = new hocsinh(hs2);
        hs3.xuat();

        hs3.sethoten("Phan Chau Tuan");
        hs3.xuat();

        double max = hs1.getdtb();
        String ht = hs1.gethoten();

        if (max < hs2.getdtb()) {
            max = hs2.getdtb();
            ht = hs2.gethoten();
        }
        if (max < hs3.getdtb()) {
            max = hs3.getdtb();
            ht = hs3.gethoten();
        }

        System.out.println("hoc sinh " + ht + " co diem tb cao nhat la: " + max);
    }
}
