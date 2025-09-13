package it.unibs.ids.elaborato;

import it.unibs.fp.mylib.InputDati;

public class Configuratore extends Utente {
	
	
	public Configuratore(String nome, String password) {
		super(nome, password);
		this.isFirstAccess = true;
		this.authorization = true;
	}
	
	public void cambiaCredenziali() {
		this.nome = InputDati.leggiStringaNonVuota("Inserisci il tuo nuovo nickname: ");
		this.password = InputDati.leggiStringaNonVuota("Inserisci la tua nuova password: ");
		this.isFirstAccess = false;
	}
	
	protected boolean isAuthorized() {
		return authorization;
	}

}
