/***
 * Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados.
 * Por cada empleado se debe solicitar el nombre, numero de días trabajados y costo del día trabajo. 
 * Calcular el valor a cancelar por la empresa para cada empleado. Presentar un reporte como el siguiente:

 *Nombre 1	10	$2.5	$25
 *Nombre 2	11	$2	$22
 *Nombre 3	9	$3	$27
 *Nombre 4	5	$4	$20
 *Nombre 5	12	$2	$24

 */
import java.util.Scanner;

public class Problema3_Cancelacionempresa {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String NomEmpleado;
        int diastrabajo, costoDia, costoPagar, contador = 1;
        while(contador <= 5){
            System.out.print("INGRESE NOMBRE, DIAS TRABAJOS, Y COSTO POR DÍA DEL EMPLEDADO" + contador + ": ");
            NomEmpleado = tcl.next();
            diastrabajo = tcl.nextInt();
            costoDia = tcl.nextInt();
            costoPagar = (diastrabajo * costoDia);
            System.out.printf("| %10s\t| %10s\t| %10s\t| %10s\t|\n", "NOMBRE", "DIAS", "COSTO DIA", "TOTAL");
            System.out.printf("| %10s\t| %10d\t| %10d\t| %10d\t|\n", NomEmpleado, diastrabajo, costoDia, costoPagar);
            contador++;
        }
    }
}
/***
 * run:
INGRESE NOMBRE, DIAS TRABAJOS, Y COSTO POR D�A DEL EMPLEDADO1: Carlitos 2 20
|     NOMBRE	|       DIAS	|  COSTO DIA	|      TOTAL	|
|   Carlitos	|          2	|         20	|         40	|
INGRESE NOMBRE, DIAS TRABAJOS, Y COSTO POR D�A DEL EMPLEDADO2: Mauricio 4 20
|     NOMBRE	|       DIAS	|  COSTO DIA	|      TOTAL	|
|   Mauricio	|          4	|         20	|         80	|
INGRESE NOMBRE, DIAS TRABAJOS, Y COSTO POR D�A DEL EMPLEDADO3: Jose 1 20
|     NOMBRE	|       DIAS	|  COSTO DIA	|      TOTAL	|
|       Jose	|          1	|         20	|         20	|
INGRESE NOMBRE, DIAS TRABAJOS, Y COSTO POR D�A DEL EMPLEDADO4: Ruben 5 10
|     NOMBRE	|       DIAS	|  COSTO DIA	|      TOTAL	|
|      Ruben	|          5	|         10	|         50	|
INGRESE NOMBRE, DIAS TRABAJOS, Y COSTO POR D�A DEL EMPLEDADO5: Luis 4 20
|     NOMBRE	|       DIAS	|  COSTO DIA	|      TOTAL	|
|       Luis	|          4	|         20	|         80	|
BUILD SUCCESSFUL (total time: 1 minute 13 seconds)

 */