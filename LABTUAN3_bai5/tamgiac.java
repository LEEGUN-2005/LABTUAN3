class tamgiac {
    private double a, b, c;

    public tamgiac(double a, double b, double c) {
        if (kiemtratamgiac(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            System.out.println("ba canh khong tao thanh tam giac! dat ve mac dinh 1, 1, 1.");
            this.a = 1;
            this.b = 1;
            this.c = 1;
        }
    }

private boolean kiemtratamgiac(double a, double b, double c) {
    return (a + b > c) && (a + c > b) && (b + c > a);
    }


public double tinhchuvi() {
    return a + b + c;
    }

public double tinhdientich() {
        double p = tinhchuvi() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }


    public String loaitamgiac() {
        if (a == b && b == c) {
        return "tam giac deu";
        } else if (a == b || a == c || b == c) {
         return "tam giac can";
        } else if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
        return "tam giac vuong";
        } else {
        return "tam giac thuong";
        }
    }

    public void xuatthongtin() {
        System.out.println("Ba canh: " + a + ", " + b + ", " + c);
        System.out.println("Chu vi: " + tinhchuvi());
        System.out.println("Dien tich: " + tinhdientich());
        System.out.println("Loai: " + loaitamgiac());
    }
}
