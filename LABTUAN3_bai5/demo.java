import java.util.Scanner;
public class demo{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

    System.out.print("nhap canh thu nhat: ");
        double a = kb.nextDouble();
    System.out.print("nhap canh thu hai: ");
        double b = kb.nextDouble();
    System.out.print("nhap canh thu ba: ");
        double c = kb.nextDouble();

        tamgiac tg1 = new tamgiac(a, b, c);
    tg1.xuatthongtin();
        tamgiac tg2 = new tamgiac(3, 4, 5);
        tamgiac tg3 = new tamgiac(6, 6, 6); 
    tg2.xuatthongtin();
    tg3.xuatthongtin();

    kb.close();
  
    }

}
