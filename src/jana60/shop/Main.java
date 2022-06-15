package jana60.shop;

public class Main {

	public static void main(String[] args) {

		Prodotto[] prodotti = new Prodotto[4];

		Prodotto shaveFoam = new Prodotto("Garnier", "Schiuma da barba", 3.99, 23);
		Prodotto toothPaste = new Prodotto("Colgate", "Dentifricio", 1.99, 22);
		Prodotto dishSoap = new Prodotto("Sole", "Sapone per piatti", 1.59, 22);
		Prodotto toiletPaper = new Prodotto("Scottex", "Carta igenica", 0.99, 18);

		prodotti[0] = shaveFoam;
		prodotti[1] = toothPaste;
		prodotti[2] = dishSoap;
		prodotti[3] = toiletPaper;

		for (int i = 0; i < prodotti.length; i++) {
			System.out.println(prodotti[i].stringa());
		}

	}

}
