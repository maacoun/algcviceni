/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CviceniDva;

/**
 *
 * @author vladi
 */
public class SentenceFromArgv {
    public static void sentenceMethod(String[] args) {
        if (args.length != 3) {
            System.out.println("Chyba: Program vyžaduje 3 argumenty - jméno dítěte, rok narození a třídu.");
        } else {
            // Získání argumentů z příkazového řádku
            String jmenoDitete = args[0];
            int rokNarozeni = Integer.parseInt(args[1]);
            char trida = args[2].charAt(0);

            // Výpočet věku dítěte
            int vek = 2023 - rokNarozeni;

            // Výpis informací o dítěti
            System.out.println("Dítě jménem " + jmenoDitete + " je věku " + vek + " let a chodí do třídy " + trida + ".");
        }
    }
}
