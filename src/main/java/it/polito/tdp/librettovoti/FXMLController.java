package it.polito.tdp.librettovoti;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import it.polito.tdp.librettovoti.model.Libretto;
import it.polito.tdp.librettovoti.model.Voto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	//dichiaro istanza
	private Libretto model;
	
	//faccio il set di model
	public void setModel(Libretto model) {
		this.model = model;
	}
	
	

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtEsame;

    @FXML
    private TextField txtVoto;

    @FXML
    private TextField txtData;

    @FXML
    private TextArea txtResult;

    @FXML
    void handleInserisci(ActionEvent event) {
    	//Sarà diviso in 3 parti
    	
    	//1. leggi e controlla i dati
    	String nomeEsame = txtEsame.getText();
    	if(nomeEsame.length()==0) {txtResult.setText("ERRORE: nome esame vuoto"); return;}
    	
    	String votoEsame = txtVoto.getText();
    	int votoInt = Integer.parseInt(votoEsame);
    	
    	String dataEsame = txtData.getText();
    	LocalDate data = LocalDate.parse(dataEsame);
    	
    	//2. esegui l'azione
    	Voto voto = new Voto(nomeEsame,votoInt, data); //passo parametri a oggetto voto    	
    	model.add(voto);
    	
    	//3. aggiorna i risultati (nella View)
    	txtResult.setText(model.toString());
    	

    }

    @FXML
    void initialize() {
        assert txtEsame != null : "fx:id=\"txtEsame\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtVoto != null : "fx:id=\"txtVoto\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtData != null : "fx:id=\"txtData\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
