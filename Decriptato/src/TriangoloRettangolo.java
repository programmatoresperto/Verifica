public class TriangoloRettangolo {
    private static double base;
    private static double altezza;

    public TriangoloRettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public static double calcolaArea() {
        return (base * altezza) / 2;
    }

    public int compareTo(double altro) {
        double areaQuesto = this.calcolaArea();
        return Double.compare(areaQuesto, altro);
    }

    public static void getInformazioni() { //metodo per stampare tutte le informazioni relative a questo poligono
        System.out.println("Triangolo rettangolo: La base è " + base + "l'altezza è " + altezza + "L'area è  " + (base * altezza)/2);
    }
}
