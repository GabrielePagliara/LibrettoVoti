package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	//definisco la variabile di tipo lista che non punta a nulla
	private List<Voto> voti ;
	
	public Libretto() {
		
		//inizializzo questa variabile con un nuovo oggetto, 
		//fin quando non faccio new non c'è nessuno oggetto legato a questa variabile
		//metto this. per ricordarmi che voti è una variabile dichiarata a livello istanza e non del metodo
		this.voti = new ArrayList<>();
	}

	public void add(Voto v) {
		this.voti.add(v);
	}
	
	
	public List<Voto> listaVotiUguali(int punteggio){
		// restituisce lista solo i voti uguali al criterio
		List<Voto> risultato = new ArrayList<>();
		for( Voto v: this.voti) {
			if(v.getVoto()==punteggio) {
				risultato.add(v);
			}
		}
		return risultato;
	}
	
	public Libretto votiUguali(int punteggio) {
		Libretto risultato = new Libretto();
		for (Voto v: this.voti){
			if(v.getVoto()==punteggio) {
				risultato.add(v);
			}
		}
		return risultato;		
	}
	
	//Ricerca un voto del corso di cui è specificato il nome,
	//se il corso non esiste, restituisce null.
	public Voto ricercaCorso(String nomeCorso) {
		Voto risultato = null;
		for(Voto v: this.voti) {
			if(v.getNome().equals(risultato)) {
				risultato = v;
				break;
			}
		}
		return risultato;
	}
	
	//usiamo un metodo per stampare la lista 
	public String toString() {
		String s = "";
		for(Voto v: this.voti) {
			//richiamiamo il metodo toString di Voto
			s = s + v.toString() + "\n";
		}
		return s;
	}
}
