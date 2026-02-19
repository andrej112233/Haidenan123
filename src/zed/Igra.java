package zed;

public class Igra {
	  String naziv;
	    double cijena;
	    String zanr;

	    public Igra(String naziv, double cijena, String zanr) {
	        this.naziv = naziv;
	        this.cijena = cijena;
	        this.zanr = zanr;
	    }

	    public void ispisiPodatke() {
	        System.out.println("Naziv: " + naziv);
	        System.out.println("Cijena: " + cijena);
	        System.out.println("Žanr: " + zanr);
	    }

	    public void pokreniIgru() {
	        System.out.println("Igra se pokreće...");
	    } }
