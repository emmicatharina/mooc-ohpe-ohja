/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emmisulander
 */
import java.util.List;
public class Tilasto {
    private List<Integer> luvut;
    public void lisaa(int luku) {
        this.luvut.add(luku);
    }
    public double ka() {
        return this.luvut.stream().mapToInt(i -> i).average().getAsDouble();
    }
}