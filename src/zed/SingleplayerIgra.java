package zed;

public class  SingleplayerIgra extends Igra {
	  boolean imaPricaMode;

	    public SingleplayerIgra(String naziv, double cijena, String zanr, boolean imaPricaMode) {
	        super(naziv, cijena, zanr);
	        this.imaPricaMode = imaPricaMode;
	    }

	    @Override
	    public void ispisiPodatke() {
	        super.ispisiPodatke();
	        System.out.println("Ima story mode: " + imaPricaMode);
	    }

	    @Override
	    public void pokreniIgru() {
	        System.out.println("Singleplayer igra se pokreće u offline modu...");
	    }
}
