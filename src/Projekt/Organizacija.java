package Projekt;

class Organizacija {
    String naziv;

    public Organizacija(String naziv) {
        this.naziv = naziv;
    }

    public void info() {
        System.out.println("Organizacija: " + naziv);
    }
}
