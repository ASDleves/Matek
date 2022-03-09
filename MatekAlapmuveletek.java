package matekalapmuveletek;

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
       int szam1 = 0;
       return szam1;
    }
    private static int kivonas(){
        int szam1 = 0;
       return szam1;
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
