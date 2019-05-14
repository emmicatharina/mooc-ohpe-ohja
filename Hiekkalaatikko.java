import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.HashMap;

public class Hiekkalaatikko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();
        lista.add(8);
        lista.add(4);
        lista.add(1);
        lista.add(2);
        lista.add(5);
        lista.add(12);
        List<Integer> indeksit = alkulukujenIndeksit(lista);
        for (int indeksi : indeksit) {
            System.out.println("Indeksissä " + indeksi
                    + " on alkuluku " + lista.get(indeksi));
        }

    }

    public static List<Integer> alkulukujenIndeksit(List<Integer> luvut) {

        List<Integer> indeksit = new ArrayList<>();

        for (int luku : luvut) {
            boolean onAlkuluku = true;
            for (int jakaja = 2; jakaja < luku; jakaja++) {
                if (luku % jakaja == 0) {
                    onAlkuluku = false;
                    break;
                }
            }
            
            if (luku == 1) {
                onAlkuluku = false;
            }
            
            if (onAlkuluku) {
            indeksit.add(luvut.indexOf(luku));
            }
        }

        return indeksit;
    }
}
