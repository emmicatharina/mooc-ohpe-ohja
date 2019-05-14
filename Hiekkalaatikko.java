
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.util.Collections;

public class Hiekkalaatikko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        List<Joukkue> joukkueet = new ArrayList<>();
       
        System.out.print("Syötä luettava tiedosto: ");
        String tiedosto = lukija.nextLine();

        

        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {

            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();

                String[] palat = rivi.split(";");

                Joukkue joukkue1 = new Joukkue(palat[0]);
                Joukkue joukkue2 = new Joukkue(palat[1]);

                int tulos1 = Integer.valueOf(palat[2]);
                int tulos2 = Integer.valueOf(palat[3]);

                if (!(joukkueet.contains(joukkue1))) {
                    joukkueet.add(joukkue1);
                }

                if (!(joukkueet.contains(joukkue2))) {
                    joukkueet.add(joukkue2);
                }

                joukkue1 = joukkueet.get(joukkueet.indexOf(joukkue1));
                joukkue2 = joukkueet.get(joukkueet.indexOf(joukkue2));

                if (tulos1 > tulos2) {
                    joukkue1.voita();
                    joukkue2.havia();
                } else if (tulos2 > tulos1) {
                    joukkue2.voita();
                    joukkue1.havia();
                } else {
                    joukkue1.tasapeli();
                    joukkue2.tasapeli();
                }

            }

        } catch (Exception e) {
            System.out.println("Tiedostoa ei voida lukea");
        }

        System.out.println();
        System.out.println("Joukkueet");

        joukkueet.stream()
                .forEach(joukkue -> System.out.println(joukkue.getNimi()));
        
        
        Collections.sort(joukkueet);
        
        System.out.println();
        System.out.println("Sarjataulukko");
        
        joukkueet.stream()
                .forEach(joukkue -> System.out.println(joukkue));
    }

}
