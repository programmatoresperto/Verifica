public class Poligono {
    private int numeroLati;
    private double lunghezzaLato;

    public Poligono(int numeroLati) { //costruttore di numeroLati
        this.numeroLati = numeroLati;
    }

    public Poligono(double lunghezzaLato) { //costruttore di lunghezzaLato
        this.lunghezzaLato = lunghezzaLato;
    }

    public int getNumeroLati() { //metodo get per numeroLati
        return numeroLati;
    }

    public void setNumeroLati(int numeroLati) { //metodo set per numeroLati
        this.numeroLati = numeroLati;
    }

    public double getLunghezzaLato() { //metodo get per lunghezzaLato
        return lunghezzaLato;
    }

    public void setLunghezzaLato(double lunghezzaLato) { //metodo set per lunghezzaLato
        this.lunghezzaLato = lunghezzaLato;
    }

    public double calcolaPerimetro(){ //metodo per calcolare il perimetro del poligono
        return numeroLati * lunghezzaLato;
    }

    @Override
    public String toString() { //metodo toString per stampare i dati del poligono
        return "Poligono{" +
                "numeroLati = " + numeroLati +
                " lunghezzaLato = " + lunghezzaLato +
                " perimetro = "+ numeroLati * lunghezzaLato + '}';
    }
}
