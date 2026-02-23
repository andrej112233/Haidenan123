package Projekt;

import Projekt.Osoba;

class Zaposleni extends Osoba {
    String pozicija;

    public Zaposleni(String ime, int godine, String pozicija) {
        super(ime, godine);
        this.pozicija = pozicija;
    }

    @Override
    public void predstaviSe() {
        System.out.println("Ja sam zaposleni " + ime + ", imam " + godine + " godina i radim kao " + pozicija + ".");
    }
}

