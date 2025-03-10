public class demo{
    public static void main(String[] args) {
        phanso p1 = new phanso();
        System.out.print("Phan so p1 (mac dinh): ");
        p1.xuatps();
        p1.nhapps();
        System.out.print("Phan so p1 sau khi nhap: ");
        p1.xuatps();
        phanso p2 = new phanso(4, 16);
        System.out.print("Phan so p2: ");
        p2.xuatps();
        phanso p3 = new phanso();
        p3.nhapps();
        System.out.print("Phan so p3: ");
        p3.xuatps();
        phanso p4 = p1.cong(p3);
        System.out.print("Ket qua p1 + p3: ");
        p4.xuatps();
        phanso p5 = p4.nhan(p2);
        System.out.print("Ket qua p4 * p2: ");
        p5.xuatps();
    }
}
