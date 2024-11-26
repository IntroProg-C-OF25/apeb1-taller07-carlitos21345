/** *
 * Generar un programa Java que permita ingresar 4 estudiantes;
 * por cada uno de ellos ingresar el nombre del estudiante, el promedio de ciclo.
 * Presentar el siguiente reporte
 *Estudiante1	10	Aprobado
 *Estudiante2	6.9	Reprobado
 *Estudiante3	7	Aprobado
 *Estudiante4	5	Reprobado
 *Atención; con base al valor del promedio, usted debe asignar en cada registro
 * el tipo Aprobado o Reprobado.
 */
import java.util.Scanner;

public class Problema5_PromediosEstudiantes {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        String nombre, estado;
        double promedio;
        int contador = 1;
        while (contador <= 4) {
            System.out.print("DAME NOMBRE DEL ESTUDIANTE Y PROMEDIO DEL EST_" + contador + ":");
            nombre = ingreso.next();
            promedio = ingreso.nextDouble();
            if (promedio < 7) {
                estado = "Reprobado";
            } else {
                estado = "Aprobado";
            }
            System.out.printf("| %s\t| %s\t| %s\t|\n", "NOMBRE", "PROMEDIO", "ESTADO");// o tambien %s%s%s pero saldra pegado
            System.out.printf("| %s\t| %.2f\t | %s\t|\n ", nombre, promedio, estado);
            contador++;
        }
    }
}
/***
 * run:
DAME NOMBRE DEL ESTUDIANTE Y PROMEDIO DEL EST_1:Carlitos 10
| NOMBRE	| PROMEDIO	| ESTADO	|
| Carlitos	| 10,00	 | Aprobado	|
 DAME NOMBRE DEL ESTUDIANTE Y PROMEDIO DEL EST_2:Jose 6,9
| NOMBRE	| PROMEDIO	| ESTADO	|
| Jose	| 6,90	 | Reprobado	|
 DAME NOMBRE DEL ESTUDIANTE Y PROMEDIO DEL EST_3:Roberto 7
| NOMBRE	| PROMEDIO	| ESTADO	|
| Roberto	| 7,00	 | Aprobado	|
 DAME NOMBRE DEL ESTUDIANTE Y PROMEDIO DEL EST_4:Tania 5
| NOMBRE	| PROMEDIO	| ESTADO	|
| Tania	| 5,00	 | Reprobado	|
 BUILD SUCCESSFUL (total time: 27 seconds)

 */