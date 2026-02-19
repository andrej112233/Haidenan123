package zed;

public class OnlineIgra extends Igra {
	 int brojIgraca;

	    public OnlineIgra(String naziv, double cijena, String zanr, int brojIgraca) {
	        super(naziv, cijena, zanr);
	        this.brojIgraca = brojIgraca;
	    }

	    @Override
	    public void ispisiPodatke() {
	        super.ispisiPodatke();
	        System.out.println("Broj igrača: " + brojIgraca);
	    }

	    @Override
	    public void pokreniIgru() {
	        System.out.println("Online igra se pokreće i povezuje na server...");
}}
