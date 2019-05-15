/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emmisulander
 */
public class Muistio {

    private String nimi;
    private int vuosi;

    public Muistio(String nimi, int vuosi) {
        this.nimi = nimi;
        this.vuosi = vuosi;
    }

    public boolean equals(Object olio) {
        if (olio == null || this.getClass() != olio.getClass()) {
            return false;
        }

        if (olio == this) {
            return true;
        }

        Muistio verrattava = (Muistio) olio;

        return this.nimi.equals(verrattava);
    }
}
