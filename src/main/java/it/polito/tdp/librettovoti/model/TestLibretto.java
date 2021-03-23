package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

//crea 10 voti e li aggiunge
public class TestLibretto {

	public static void main(String[] args) {

		// creo un nuovo libretto dove mettere i voti
		Libretto libretto = new Libretto();

		// creo un voto
		Voto voto1 = new Voto("Analisi 1", 30, LocalDate.of(2019, 2, 15));

		// aggiungo il voto al libretto
		libretto.add(voto1);
		libretto.add(new Voto("Fisica 1", 28, LocalDate.of(2019, 7, 15)));
		libretto.add(new Voto("Informatica", 24, LocalDate.of(2019, 9, 15)));
		
		//Stampa l'indirizzo dell'oggetto libretto
		System.out.println(libretto);

	}

}
