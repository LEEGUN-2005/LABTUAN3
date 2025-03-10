public class point2d {
    private float x;
    private float y;

    public point2d() {
        this.x = 0.0f;
        this.y = 0.0f;
    }
 public point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }
public float getX() {
        return x;
    }

 public float getY() {
        return y;
    }
 public point2d cong(point2d p) {
        return new point2d(this.x + p.x, this.y + p.y);
    }
    public point2d doixunghoanh() {
        return new point2d(this.x, -this.y);
    }
    public void hienthi() {
        System.out.println("(" + x + ", " + y + ")");
    }

    
}
