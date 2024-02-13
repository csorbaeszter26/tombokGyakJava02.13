
package tombfeltoltes;

import java.util.Scanner;

public class Bekeres {

    //static Scanner sc = new Scanner(System.in, "utf-8");
    static Scanner sc = new Scanner(System.in, "latin2");
    //static Scanner sc = new Scanner(System.in, "iso-8859-2");
    //static Scanner sc = new Scanner(System.in, "windows-1250");
    
    public static void main(String[] args) {
        /*1.: fix*/
        //final int DB = 3;
        //String[] nevek = new String[DB];
        
        /*2.: meghatározva*/
        System.out.println("név db: ");
        final int DB = sc.nextInt();
        String[] nevek = new String[DB];
        sc.nextLine(); //az ENTER kiolvasása
        
        /*FELTÖLTÉS:*/
        for (int i = 0; i < DB; i++) {
            System.out.printf("név (%d/%d): ", i+1, DB);
            String nev = sc.nextLine();
            nevek[i] = nev;
        }
        
        /*KIIRÁS:*/
        for (int i = 0; i < DB; i++) {
            System.out.println(nevek[i]);
        }
        
        
    }
    
}
