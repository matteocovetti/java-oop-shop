package jana60.shop;

import java.text.DecimalFormat;

public class Prodotto {
	/*
	 * Nel progetto java-oop-shop, package jana60.shop e creare la classe Prodotto
	 * che gestisce i prodotti dello shop. Un prodotto è caratterizzato da: marca
	 * nome prezzo iva Scegliere opportunamente il tipo di dato per gli attributi
	 * Aggiungere un costruttore che inizializza tutti gli attributi. Aggiungere dei
	 * metodi per: calcolare il prezzo comprensivo di iva formattare il prezzo
	 * restituendo una stringa con un determinato numero di decimali e il carattere
	 * €
	 */

	// variabili
	String marca, nome;
	float prezzoBase;
	int iva;

	// import decimal format
	DecimalFormat df = new DecimalFormat("#.00€");

	// costruttori
	Prodotto(String marca, String nome, float prezzoBase, int iva) {
		this.marca = marca;
		this.nome = nome;
		this.prezzoBase = prezzoBase;
		this.iva = iva;
	}

	// metodi
	float calcolaPrezzoTotale() {
		return prezzoBase + ((prezzoBase / 100) * iva);
	}

	String stringa() {
		return "Il prezzo del prodotto " + nome + " di marca" + marca + " è: " + df.format(calcolaPrezzoTotale());
	}
}
