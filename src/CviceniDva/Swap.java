/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CviceniDva;

/**
 *
 * @author vladi
 * Napište program Swap.java, který prohodí pořadí dvou celých čísel uložených v proměnných a, b a vypíše je na konzoly. 
    * bez výměny v paměti
    * s výměnou v paměti  s pomocnou proměnnou
    * s výměnou v paměti  bez pomocné proměnné
    * příkl. Pro čísla: 34, 89
    89, 34
 */
public class Swap {
    public static void main(String[] args) {

    int a = 34;
    int b = 89;
    
    // Bez výměny v paměti
    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("Bez výměny v paměti:");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    
    // S výměnou v paměti s pomocnou proměnnou
    int temp = a;
    a = b;
    b = temp;
    
    System.out.println("\nS výměnou v paměti s pomocnou proměnnou:");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    
    // S výměnou v paměti bez pomocné proměnné
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;

    System.out.println("\nS výměnou v paměti bez pomocné proměnné:");
    System.out.println("a = " + a);
    System.out.println("b = " + b);    
    
    }
}
