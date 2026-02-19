package zed;

public class TestIgra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 OnlineIgra igra1 = new OnlineIgra("Warzone", 0, "FPS", 150);
	        SingleplayerIgra igra2 = new SingleplayerIgra("God of War", 60, "Akcija", true);

	        System.out.println("=== ONLINE IGRA ===");
	        igra1.ispisiPodatke();
	        igra1.pokreniIgru();

	        System.out.println("\n=== SINGLEPLAYER IGRA ===");
	        igra2.ispisiPodatke();
	        igra2.pokreniIgru();
	}

}
