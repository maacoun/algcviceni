/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CviceniDva;

/**
 *
 * @author vladi
 * Zapište program pro výpočet úsekové rychlosti vozidla (průměrné rychlosti vozidla ve sledovaném úseku).
Vypisujte jak dosaženou průměrnou rychlost, tak i o kolik byla překročena maximální povolená rychlost v daném
úseku. Vstupem budou: maximální povolená rychlost v daném úseku, délka úseku a časové údaje (hh mm sec
set) průjezdu vozidla začátkem a koncem sledovaného úseku.
 */
import java.util.Scanner;

public class VehicleSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vstup od uživatele: maximální povolená rychlost v úseku (km/h)
        System.out.print("Zadejte maximální povolenou rychlost v úseku (km/h): ");
        double maxPovolenaRychlost = scanner.nextDouble();

        // Vstup od uživatele: délka úseku (km)
        System.out.print("Zadejte délku úseku (km): ");
        double delkaUseku = scanner.nextDouble();

        // Vstup od uživatele: časový údaj začátku úseku (hh mm ss set)
        System.out.print("Zadejte čas začátku úseku (hh mm ss set): ");
        int hhStart = scanner.nextInt();
        int mmStart = scanner.nextInt();
        int ssStart = scanner.nextInt();
        int setStart = scanner.nextInt();

        // Vstup od uživatele: časový údaj konce úseku (hh mm ss set)
        System.out.print("Zadejte čas konce úseku (hh mm ss set): ");
        int hhEnd = scanner.nextInt();
        int mmEnd = scanner.nextInt();
        int ssEnd = scanner.nextInt();
        int setEnd = scanner.nextInt();

        // Převod časových údajů na sekundy
        double casStart = hhStart * 3600 + mmStart * 60 + ssStart + setStart / 1000.0;
        double casEnd = hhEnd * 3600 + mmEnd * 60 + ssEnd + setEnd / 1000.0;

        // Výpočet průměrné rychlosti (rychlost = vzdálenost / čas)
        double prumernaRychlost = delkaUseku / ((casEnd - casStart) / 3600); // výsledek v km/h

        // Výpočet překročení povolené rychlosti
        double prekroceni = prumernaRychlost - maxPovolenaRychlost;

        // Výpis výsledků
        System.out.println("Průměrná rychlost vozidla v úseku: " + prumernaRychlost + " km/h");
        if (prekroceni > 0) {
            System.out.println("Překročení maximální povolené rychlosti o: " + prekroceni + " km/h");
        } else {
            System.out.println("Rychlost byla v mezích povoleného limitu.");
        }

    }
}
