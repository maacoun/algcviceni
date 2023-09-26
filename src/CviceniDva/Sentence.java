/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CviceniDva;

/**
 *
 * @author vladi
 * Vytvořte program Sentence.java. Definujte proměnné pro jméno dítěte, rok narození a písmenné označení třídy, do které chodí. Uložte do nich libovolné smysluplné hodnoty. Program ať vypíše věk dítěte a do který třídy chodí. (Předpoklad: je rok 2023 a děti chodí do školy od 6ti let)
 */
public class Sentence {
    public static void main(String[] args) {
        // Proměnné pro jméno dítěte, rok narození a písmenné označení třídy
        String jmenoDitete = "Jan";
        int rokNarozeni = 2017;
        char trida = '3';

        // Výpočet věku dítěte
        int vek = 2023 - rokNarozeni;

        // Výpis informací o dítěti
        System.out.println("Dítě jménem " + jmenoDitete + " je věku " + vek + " let a chodí do " + trida + ". třídy");
    }
}

