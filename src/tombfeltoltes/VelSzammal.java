
package tombfeltoltes;

import java.util.Random;


public class VelSzammal {
    
    static Random rnd = new Random();
    
    public static void main(String[] args) {
        
        final int DB = 5;
        int[] korok = new int[DB];
        
        /*FELTÖLTÉS: */
        for (int i = 0; i < DB; i++) {
            //korok[i] = (int)(Math.random()*100);
            //korok[i] = rnd.nextInt();
            //korok[i] = rnd.nextInt(100);
            korok[i] = rnd.nextInt(21, 47); //21 és 46 között lesznek számok
            

        }
        
        /*KIIRÁS: */
        for (int i = 0; i < DB; i++) {
            System.out.println(korok[i]);
        }
        
    }
}
