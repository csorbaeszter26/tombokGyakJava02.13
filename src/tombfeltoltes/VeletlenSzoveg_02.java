
package tombfeltoltes;

import java.util.Scanner;

public class VeletlenSzoveg_02 {
    
    static Scanner sc = new Scanner(System.in, "latin2");
    
    public static void main(String[] args) {
        
        
        System.out.println("hely db: ");
        final int DB = sc.nextInt();
        String[] helyek = new String[DB];
        sc.nextLine(); 
        int[] szam = new int[DB];
        
        for (int i = 0; i < DB; i++) {
            System.out.printf("hely (%d/%d): ", i+1, DB);
            String hely = sc.nextLine();
            helyek[i] = hely;
     
        }
        
        int[] letszamok = new int[DB];
        
        
        
        
        
        
        
        
        for (int i = 0; i < DB; i++) {
            szam[i] = (int)(Math.random());
            
        }
        
        
        
        for (int i = 0; i < DB; i++) {
            System.out.println("helyek:" + helyek[i] + "számuk: " + szam);
        }
        
        
        int m = 0;
        for (int i = 1; i < DB; i++) {
            if (letszamok[i] > letszamok[m]){
                m = i;
            }
        }
        
        String helys = helysegek[m];
        int letsz = letszamok[m];
        System.out.printf("A(z) %s rendelkezik a legtöbb lakossal (%d)", helys, letsz);
        
        System.out.print("Van e pontosan 1000 fős helység: ");
        int i = 0;
        while (i < DB && !(letszamok[i]) == 1000) {
            i++;
        }
        boolean van = i < DB || i >= DB;
        
        
        System.out.print("Minden létszám > 1000: ");
        i = 0;
        while (i < DB && (letszamok[i]) > 1000) {
            i++;
        }
        boolean mind = i < DB || i >= DB;
}
}
