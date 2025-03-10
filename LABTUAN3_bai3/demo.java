import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

       point2d p1 = new point2d();
        System.out.print("toa do p1 k tham so: ");
        p1.hienthi();

        System.out.print("nhap x cua p2: ");
        float x = kb.nextFloat();
        System.out.print("nhap y cua p2: ");
        float y = kb.nextFloat();
        point2d p2 = new point2d(x, y);
        System.out.print("toa do p2 sau khi nhap: ");
        p2.hienthi();

        point2d p3 = p1.cong(p2);
        System.out.print("toa do p3=p1+p2: ");
        p3.hienthi();

        point2d p4 = p2.doixunghoanh();
        System.out.print("toa do doi xung cua p2 qua truc hoanh: ");
        p4.hienthi();

        kb.close();
    }
}

