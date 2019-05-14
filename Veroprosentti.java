
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.util.HashMap;

public class Hiekkalaatikko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Tulotaso: ");
        
        int tulotaso = Integer.valueOf(lukija.nextLine());
        
        double veroprosentti = 0;
        
        if (tulotaso < 11000) {
            veroprosentti = 0.077;
        } else if (tulotaso < 13000) {
            veroprosentti = 0.083;
        } else if (tulotaso < 14000) {
            veroprosentti = 0.086;
        } else if (tulotaso < 15000) {
            veroprosentti = 0.102;
        } else if (tulotaso < 16000) {
            veroprosentti = 0.118;
        } else if (tulotaso < 17000) {
            veroprosentti = 0.132;
        } else if (tulotaso < 18000) {
            veroprosentti = 0.144;
        } else if (tulotaso < 19000) {
            veroprosentti = 0.155;
        } else if (tulotaso < 20000) {
            veroprosentti = 0.166;
        } else {
            veroprosentti = 0.178;
        }
       
        double verot = tulotaso * veroprosentti;
            
        System.out.println("Veroprosentti: " + veroprosentti * 100 + "%"); 
        System.out.println("Veroja maksetaan: " + verot + " euroa");
    }

}
