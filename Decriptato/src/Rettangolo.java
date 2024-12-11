public class Rettangolo {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) { //costruttore per la base e l'altezza del rettangolo che si aspetterà la base e l'altezza
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

    public double calcolaArea() {
        return base * altezza;
    }

    public double calcolaPerimetro(){return base*2 + altezza*2;}
    // è utile aver metodi di calcolo in ogni classe perchè ogni figura ha più misure e quindi necessità di più variabili

    public int compareTo(double altro) {
        double areaQuesto = this.calcolaArea();
        return Double.compare(areaQuesto, altro);
    }

    public void getInformazioni() { //metodo per stampare tutte le informazioni relative a questo poligono
        System.out.println("Rettangolo: La base è " + base + "l'altezza è " + altezza + "il perimetro è " + base*2 + altezza*2 +"L'area è  " + base * altezza);
    }
}
