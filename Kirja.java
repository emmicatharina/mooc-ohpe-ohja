/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emmisulander
 */
public class Kirja {

    private String nimi;
    private String sisalto;
    private int julkaisuvuosi;

    public Kirja(String nimi, int julkaisuvuosi, String sisalto) {
        this.nimi = nimi;
        this.julkaisuvuosi = julkaisuvuosi;
        this.sisalto = sisalto;
    }

    public String getNimi() {
        return this.nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getJulkaisuvuosi() {
        return this.julkaisuvuosi;
    }

    public void setJulkaisuvuosi(int julkaisuvuosi) {
        this.julkaisuvuosi = julkaisuvuosi;
    }

    public String getSisalto() {
        return this.sisalto;
    }

    public void setSisalto(String sisalto) {
        this.sisalto = sisalto;
    }

    public String toString() {
        return "Nimi: " + this.nimi + " (" + this.julkaisuvuosi + ")\n"
                + "Sisältö: " + this.sisalto;
    }

    public int hashCode() {
        if (this.nimi == null) {
            return this.julkaisuvuosi;
        }

        return this.julkaisuvuosi + this.nimi.hashCode();
    }
    
    @Override
    public boolean equals(Object verrattava) {
        // jos muuttujat sijaitsevat samassa paikassa, ovat ne  samat
        if (this == verrattava) {
            return true;
        }

        // jos verrattava olio ei ole Kirja-tyyppinen, oliot eivät  ole samat
        if (!(verrattava instanceof Kirja)) {
            return false;
        }

        // muunnetaan olio Kirja-olioksi
        Kirja verrattavaKirja = (Kirja) verrattava;

        // jos olioiden oliomuuttujien arvot ovat samat, ovat   oliot samat
        if (this.nimi.equals(verrattavaKirja.nimi)
                && this.julkaisuvuosi == verrattavaKirja.julkaisuvuosi
                && this.sisalto.equals(verrattavaKirja.sisalto)) {
            return true;
        }

        // muulloin oliot eivät ole samat
        return false;
    }
}
