package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

//POJO - Plain Old Java Object
//Java Bean
//Classe semplice contenitore di dati, essa non ha logica 

/**
 * Memorizza il risultato di un esame singolo
 * @author gabri
 *
 */

public class Voto {
	private String nome;
	private int voto;
	private LocalDate data; //data superamento esame
	
	//genero costruttore
	public Voto(String nome, int voto, LocalDate data) {
		super();
		this.nome = nome;
		this.voto = voto;
		this.data = data;
	}

	//getter e setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Esame " + nome + " superato con " + voto + " il " + data + "";
	}
	
	
	
	
	
	
	

}
