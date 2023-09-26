/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CviceniDva;

/**
 *
 * @author vladi
 */
import java.text.SimpleDateFormat;

public class Letopocet {
    public static void main(String[] args) {
        String rodneCislo = "101223/1234";

        String[] parts = rodneCislo.split("/");
        if (parts.length != 2) {
            System.out.println("Neplatný formát rodného čísla.");
            return;
        }

        String datePart = parts[0];
        String yearPart = datePart.substring(4);
        String monthPart = datePart.substring(2, 4);
        String dayPart = datePart.substring(0, 2);

        String fullYear = "20" + yearPart;

        String formattedDate = dayPart + "-" + monthPart + "-" + fullYear;        
        System.out.println(formattedDate);
    }    
}
