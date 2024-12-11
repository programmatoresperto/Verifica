public class Circonferenza {
    private static double raggio;

    public Circonferenza(double raggio) {
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    public static double calcolaArea() {
        return Math.PI * raggio * raggio;
    }

    public int compareTo(double altro) {
        double areaQuesto = this.calcolaArea();
        return Double.compare(areaQuesto, altro);
    }
    public static void getInformazioni() { //metodo per stampare tutte le informazioni relative a questo poligono
        System.out.println("Circonferenza: il raggio  è " + raggio + "L'area è  " + Math.PI * raggio * raggio);
    }
}
