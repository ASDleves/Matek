package matekalapmuveletek;

import java.util.Random;
import java.util.Scanner;

public class MatekAlapmuveletek {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
     valasztas();   
    }
    
    private static void valasztas(){
        System.out.println("Milyen műveletet szeretnél gyakorolni?");
        System.out.print("1: összeadás\n2: kivonás\n3: szorzás\n4: osztás\nÍrd be a megfelelő számot: ");
        int valasz = scanner.nextInt();
        while (!(valasz==1 || valasz==2 || valasz==3 || valasz==4)){
            System.out.print("Nem jó számot adtál meg.Írd be újra: ");
            valasz = scanner.nextInt();
        }
        if (valasz==1){
            osszeadas();
        }else if (valasz==2){
            kivonas();
        }else if (valasz==3){
            szorzas();
        }else if (valasz==4){
            osztas();
        }
    }
    
    private static int osszeadas(){
       int joValaszok = 0;
        int min = 0, max = 50;
        Random rndSzam = new Random();
        for (int i = 0; i < 10; i++) {
            int szam1 = rndSzam.nextInt(max - min + 1) + min;
            int szam2 = rndSzam.nextInt(max - min + 1) + min;
            System.out.print(szam1 + "+" + szam2 + "= ");
            int valasz = scanner.nextInt();
            if (valasz == (szam1 + szam2)) {
                joValaszok++;
            }

        }
        System.out.println("");
        System.out.println("Helyes válaszok: " + joValaszok);
        
        return joValaszok;
    }
    private static int kivonas(){
        int joValaszok = 0;
        int min = 0, max = 100;
        Random rndSzam = new Random();
        for (int i = 0; i < 10; i++) {
            int szam1 = rndSzam.nextInt(max - min + 1) + min;
            int szam2 = rndSzam.nextInt(max - min + 1) + min;
            
            int seged = 0;
            if (szam2 > szam1){
                seged = szam2;
                szam2 = szam1;
                szam1 = seged;
            }
            
            System.out.print(szam1 + "-" + szam2 + "= ");
            int valasz = scanner.nextInt();
            if (valasz == (szam1 - szam2)) {
                joValaszok++;
            }

        }
        System.out.println("");
        System.out.println("Helyes válaszok: " + joValaszok);
        
        return joValaszok;
    }
    private static int szorzas(){
        int szam1 = 0;
       return szam1;
    }
    private static int osztas(){
        int szam1 = 0;
       return szam1;
    }
    
}
