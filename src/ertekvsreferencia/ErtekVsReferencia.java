
package ertekvsreferencia;

public class ErtekVsReferencia {

    public static void main(String[] args) {
        int ertek =0;
        kiirErtek(ertek);
        modositErtek(ertek);
        kiirErtek(ertek);
        
        int[] ref ={0,0,0};
        kiirReferencia(ref);
        modositReferencia(ref);
        kiirReferencia(ref);
    }

    static void modositErtek(int ertek) {
        ertek = 10;
    }

    static void kiirErtek(int ertek) {
        System.out.println(ertek);
    }

    static void modositReferencia(int[] tomb) {
        tomb[0]=10;
    }

    static void kiirReferencia(int[] ref) {
        System.out.println(ref);
    }
    
    
        
    }

    
    

