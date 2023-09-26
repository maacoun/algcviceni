/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CviceniDva;

/**
 *
 * @author vladi
 */
import java.util.Scanner;

public class Platidla {

    public static void main(String[] args) {
        // Vytvoření instance Scanner pro načítání vstupu od uživatele
        Scanner scanner = new Scanner(System.in);

        // Získání částky od uživatele
        System.out.print("Zadejte částku v Kč: ");
        int castka = scanner.nextInt();

        //Nebo by slo
        int zbytek;
        int stovky = castka/100;
        zbytek = castka%100;
        int pajdy = zbytek/50;
        zbytek = pajdy%50;
        int dvacky = zbytek/20;
        zbytek = dvacky%20;
        int desitky = zbytek/10;
        zbytek = desitky%10;
        //atd..
        
        // Pole hodnot bankovek a mincí
        int[] hodnoty = {100, 50, 20, 10, 5, 2, 1};

        // Pole pro uchování počtu jednotlivých platidel
        int[] pocetPlatidel = new int[hodnoty.length];

        // Výpočet počtu platidel
        for (int i = 0; i < hodnoty.length; i++) {
            if (castka >= hodnoty[i]) {
                pocetPlatidel[i] = castka / hodnoty[i];
                castka %= hodnoty[i];
            }
        }

        // Výstup s výčetkem platidel
        System.out.println("Výčet platidel:");
        for (int i = 0; i < hodnoty.length; i++) {
            if (pocetPlatidel[i] > 0) {
                System.out.println(hodnoty[i] + " Kč: " + pocetPlatidel[i]);
            }
        }

        // Uzavření scanneru
        scanner.close();
    }
}

