public class Punto {
    private static double x;
    private static double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public static double Distanza(double x2, double y2){
        double distanza = (x2 -x) *2 + (y2 - y)*2;
        return distanza;

    }
}
