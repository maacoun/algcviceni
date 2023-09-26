/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CviceniDva;

/**
 *
 * @author vladi
 * Vytvořte program Farm.java. Definujte  dvě číselné proměnné pocetHus a pocetKraliku. Uložte do nich libovolné smysluplné hodnoty. Nadefinujte další proměnné pocetZvirat a pocetNohou, do kterých vypočítejte správné hodnoty podle počtu hus a králíků. Vypište na obrazovku:
příkl. Pro hodnoty: 5 4 
Pocet hus: 5
Pocet kraliku: 4
Na farme je 9 zvirat a maji 26 nohou.

 */
public class Farm {
    public static void main(String[] args) {
        // Definice číselných proměnných pocetHus a pocetKraliku
        int pocetHus = 5;
        int pocetKraliku = 4;

        // Výpočet celkového počtu zvířat a nohou
        int pocetZvirat = pocetHus + pocetKraliku;
        int pocetNohou = (pocetHus * 2) + (pocetKraliku * 4);

        // Výpis informací
        System.out.println("Pocet hus: " + pocetHus);
        System.out.println("Pocet kraliku: " + pocetKraliku);
        System.out.println("Na farme je " + pocetZvirat + " zvirat a maji " + pocetNohou + " nohou.");
    }
}

