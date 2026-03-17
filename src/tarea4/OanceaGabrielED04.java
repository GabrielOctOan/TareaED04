/*
 * @autor Gabriel Oancea
 * @version 29
 * @since 17/03/2026 
 */
package tarea4;

public class OanceaGabrielED04 {

    public static void main(String[] args) {
        
        System.out.println("60mph son " + Utilidades.kmhAms(Utilidades.mphAKmh(60)) + " metros por segundo");
        System.out.println("Si el cateto A mide 3cm y el cateto B mide 4cm, entonces la hipotenusa mide "
                + Utilidades.hipotenusa(3, 4) + "cm");
    }

}
