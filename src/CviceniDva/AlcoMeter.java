/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CviceniDva;

/**
 *
 * @author vladi
 *  V této úloze máte vytvořit program, který bude počítat zbytkový alkohol v krvi po zadané době po konzumaci
nebo dobu potřebnou pro odbourání zkonzumovaného alkoholu dle Widmarkova vzorce. Vstupem programu
bude objem vypitého nápoje Q, podíl alkoholu ve vypitém nápoji p, tělesná hmotnost konzumenta mkonzument.
Program bude dále používat konstanty rho (0,8 – hustota ethanolu v g/cm3
); r (podíl vody v organismu 0,7 pro
muže a 0,6 pro ženy); beta (faktor představující rychlost odbourávání alkoholu v g/hod 0,1 pro muže a 0,085 pro
ženy). Tyto konstanty zaveďte v programu jako pojmenované konstanty. Program bude provádět výpočet buď
jen pro muže, nebo jen pro ženy). Pro výpočet lze použít vzorce:
 */
import java.util.Scanner;

public class AlcoMeter {
    public static void main(String[] args) {
        // Vstupy - objem nápoje (Q), podíl alkoholu v nápoji (p), hmontnost m konzumenta (mkonzument)
        // Konstanty rho - 0.8, r - 0.7 nebo 0.6 (muž/žena), beta 0.1 nebo 0.085 (muž/žena)
        
        Scanner scanner = new Scanner(System.in);

        // Vstupní data od uživatele
        System.out.print("Pohlaví (M/Z): ");
        String pohlavi = scanner.nextLine();
        
        // Konstanty
        float rho = 0.8f;
        
        float rmuz = 0.7f;
        float rzena = 0.6f;
        
        float betamuz = 0.1f;
        float betazena = 0.085f;
        
        float met; //hmotnost vypitého ethanolu
        float prom; //promile alkoholu v krvi bezprostředně po konzumaci
        float uet; // rychlost odbourávání alkoholu v těle konzumenta
        
        boolean isMan; 
        
        // Vstupy
        System.out.print("Objem nápoje (ml): ");
        float Q = scanner.nextFloat();
        
        System.out.print("Podíl alkoholu (v %): ");
        float p = scanner.nextFloat();
        
        System.out.print("Vaše hmotnost (kg): ");
        float mkonzument = scanner.nextFloat();
        
        if (pohlavi == "M" || pohlavi == "m" )
        {
            isMan = true;
        }
        else
        {
            isMan = false;
        }
        
        // hmotnost ethanolu (g)
        met = (Q*p*rho)/100;
        prom = isMan ? (met)/(mkonzument*rmuz) : (met)/(mkonzument*rzena);
        uet = isMan ? (mkonzument*betamuz) : (mkonzument*betazena);
        
        System.out.println("Hmotnost vypitého ethanolu: " + met + ("g"));
        System.out.println("Promile alkoholu v krvi (bezprostředně po konzumaci): " + prom + ("g/kg"));
        System.out.println("Rychlost odbourávání alkoholu: " + uet + ("g/hod"));
    }
}
