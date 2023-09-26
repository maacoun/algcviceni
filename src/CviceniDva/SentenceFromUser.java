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

public class SentenceFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vstupní data od uživatele
        System.out.print("Zadejte jméno dítěte: ");
        String jmenoDitete = scanner.nextLine();

        System.out.print("Zadejte rok narození: ");
        int rokNarozeni = scanner.nextInt();

        System.out.print("Zadejte třídu, do které chodí: ");
        char trida = scanner.next().charAt(0);

        // Výpočet věku dítěte
        int vek = 2023 - rokNarozeni;

        // Výpis informací o dítěti
        System.out.println("Dítě jménem " + jmenoDitete + " je věku " + vek + " let a chodí do třídy " + trida + ".");

        // Uzavření scanneru
        scanner.close();
    }
}
