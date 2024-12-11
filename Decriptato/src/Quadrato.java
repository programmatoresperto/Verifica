public class Quadrato {
    private static double lato;

    public Quadrato(double lato) {
        this.lato = lato;
    } //costruttore per il lato del quadrato che si aspetterà il lato

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    public static double calcolaArea() {
        return lato * lato;
    }

    public void getInformazioni() { //metodo per stampare tutte le informazioni relative a questo poligono
        System.out.println("Quadrato: il lato è " + lato + "L'area è  " + lato * lato);
    }

    public int compareTo(double altro) {
        double areaQuesto = this.calcolaArea();
        return Double.compare(areaQuesto, altro);
    }
}
