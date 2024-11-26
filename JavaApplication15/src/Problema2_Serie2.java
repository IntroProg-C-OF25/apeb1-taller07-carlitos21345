
/** *
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 *
 *5/10
 *10/12
 *15/14
 *20/16
 *25/18
 *30/20
 */
import java.util.Scanner;

public class Problema2_Serie2 {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int contador = 5, limite, contador2 = 8;
        System.out.println("DAME EL LIMITE");
        limite = ingreso.nextInt();
        while (contador <= limite) {
            System.out.println(contador + "/" + (contador2 + 2) + ",");
            contador += 5;
            contador2 += 2;
        }
    }

}
/***
 * DAME EL LIMITE
 *30
 *5/10,
 *10/12,
 *15/14,
 *20/16,
 *25/18,
 *30/20,
 */
