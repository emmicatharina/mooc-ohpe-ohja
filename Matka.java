/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emmisulander
 */
public class Matka {
    
    private String mista;
    private String minne;
    private int paikkoja;
    
    public Matka(String mista, String minne, int paikkoja) {
        this.mista = mista;
        this.minne = minne;
        this.paikkoja = paikkoja;
    }
    
    public int getPaikat() {
        return this.paikkoja;
    }
    
    public void vahennaPaikka() {
        this.paikkoja--;
    }
    
    public String toString() {
        return this.mista + "-" + this.minne + ", paikkoja jäljellä " + this.paikkoja;
    }
}
