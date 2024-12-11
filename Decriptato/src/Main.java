/*

DOMANDA 1 ✔
 Scrivi il metodo compareTo() per le seguenti classi:

Quadrato
TriangoloRettangolo
Circonferenza
Il metodo deve confrontare l'area dell'oggetto attuale con quella di un altro oggetto della stessa classe e restituire:

1 se l'area dell'oggetto attuale è maggiore.
0 se le aree sono uguali.
-1 se l'area dell'oggetto attuale è minore.


DOMANDA 2

Scrivi una classe chiamata Punto con i seguenti attributi e metodi:

Due attributi privati x e y di tipo double, che rappresentano le coordinate del punto.
Un costruttore che accetta come parametri i valori di x e y.
Metodi getter e setter per gli attributi.
Un metodo double distanza(Punto altro) che calcola e restituisce la distanza tra il punto corrente e un altro punto passato come parametro.

DOMANDA 3 ✔

Modifica la classe Rettangolo aggiungendo un metodo chiamato calcolaPerimetro() che restituisce il perimetro del rettangolo. Scrivi il codice per il metodo e spiega il motivo per cui è utile avere metodi di calcolo in una classe. ✔


DOMANDA 4 ✔

Scrivi una classe chiamata Poligono con i seguenti requisiti:

Un attributo privato numeroLati (di tipo int) che rappresenta il numero di lati del poligono. ✔
Un attributo privato lunghezzaLato (di tipo double) che rappresenta la lunghezza di ciascun lato. ✔
Un costruttore che accetta numeroLati e lunghezzaLato come parametri. ✔
Un metodo double calcolaPerimetro() che restituisce il perimetro del poligono. ✔
Scrivi anche un metodo toString() che restituisca una descrizione testuale del poligono, ad esempio: ✔
"Poligono con 5 lati di lunghezza 3.0, perimetro: 15.0" ✔


Tutto il codice che scriverete deve essere adeguatamente commentato, specialmente per le parti non banali. In particolare:

Costruttori: spiegate il loro scopo e quali parametri si aspettano.
Metodi di calcolo (ad esempio, calcolaArea o calcolaPerimetro): descrivete brevemente il ragionamento dietro le formule utilizzate.
Metodi complessi (ad esempio, compareTo o distanza): spiegate cosa fanno e perché sono utili.
Evitate commenti superflui per il codice ovvio, come // Imposta la base per un setter, ma concentratevi sul rendere chiaro il funzionamento delle logiche più articolate.
Un codice ben commentato non solo aiuta voi a riprenderlo in futuro, ma permette anche a chi lo legge di comprenderne facilmente il funzionamento!

*/


/* Just another creepy main */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rettangolo rettangolo = new Rettangolo(15, 18);
        Quadrato quadrato = new Quadrato(6);
        TriangoloRettangolo triangolo = new TriangoloRettangolo(3, 4);
        TriangoloRettangolo triangolo2 = new TriangoloRettangolo(2, 5);
        rettangolo.getInformazioni();
        quadrato.getInformazioni();
        TriangoloRettangolo.getInformazioni();
        Circonferenza.getInformazioni();
        if (rettangolo.compareTo(Quadrato.calcolaArea()) > 0) {
            System.out.println("Il rettangolo ha un'area minore del quadrato.");
        } else {
            System.out.println("Il quadrato ha un'area minore o uguale a quella del rettangolo.");
        }

        //Punto
        double x2, y2;
        System.out.println("Inserire le coordinate del punto prima x e poi y");

        x2 = input.nextDouble();
        y2 = input.nextDouble();

        Punto.Distanza(x2, y2);

        //Poligono
        Poligono poligono = new Poligono(3);
        poligono.toString();

    }
}


/*
Che devi fare?
Correggi il main, se occorre:
Controlla bene il  metodo getInformazioni() e vedi come risolvere il problema dello stampare info e fare andare bene il compareTo.
 */