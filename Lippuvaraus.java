import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.util.HashMap;

public class Hiekkalaatikko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        tulostaValikko();        
        
        Map<Integer, Matka> tunnisteet = new HashMap<>();
        Map<String, Integer> varaukset = new HashMap<>();
        
        while (true) {
            System.out.println();
            System.out.print("Syötä komento: ");
            
            int komento = Integer.valueOf(lukija.nextLine());
            if (komento == 5) {
                break;
            }
            
            if (komento == 1) {
                System.out.print("Mistä: ");
                String mista = lukija.nextLine();
                System.out.print("Minne: ");
                String minne = lukija.nextLine();
                System.out.print("Paikkoja: ");
                int paikkoja = Integer.valueOf(lukija.nextLine());
                
                Matka matka = new Matka(mista, minne, paikkoja);
                tunnisteet.put(tunnisteet.size(), matka);
                
            }
            
            if (komento == 2) {
                for (Map.Entry<Integer, Matka> matkat : tunnisteet.entrySet()) {
                    System.out.println(matkat.getKey() + ": " + matkat.getValue());
                }
            }
            
            if (komento == 3) {
                System.out.print("Mikä matka: ");
                int matka = Integer.valueOf(lukija.nextLine());
                System.out.print("Sähköposti: ");
                String email = lukija.nextLine();
                
                if (tunnisteet.get(matka).getPaikat() >= 1) {
                    tunnisteet.get(matka).vahennaPaikka();
                    varaukset.put(email, matka);
                }
                
            }
            
            if (komento == 4) {
                System.out.print("Minkä matkan liput listataan? ");
                int listattava = Integer.valueOf(lukija.nextLine());
                
                for (Map.Entry<String, Integer> liput : varaukset.entrySet()) {
                    if (liput.getValue().equals(listattava)) {
                        System.out.println(liput.getKey());
                    }
                }
                
            }
            
            if (komento > 5) {
                tulostaValikko();
            }
            
        }
        
    }
    
    public static void tulostaValikko() {
        System.out.println();
        System.out.println("1) lisaa matka");
        System.out.println("2) listaa matkat");
        System.out.println("3) varaa lippu matkalle");
        System.out.println("4) listaa matkan liput");
        System.out.println("5) lopeta");
        System.out.println("(muut tulostavat valikon)");
        
    }
    
        

}
