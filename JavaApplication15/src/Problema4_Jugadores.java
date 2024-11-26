
/** *
 * Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:
 *Nombre el jugador
 *Posición en el campo de juego
 *Edad
 *Estatura
 *El ciclo de ingreso de información deberá terminar cuando el usuario lo decida.
 *Se debe imprimir el siguiente reporte (usar una cadena de acumulación):
 *
 * Listado de Jugadores
 * 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
 * 2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
 * 3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
 * 4. Ángel Mena -Delantero-, edad 32, estatura 1.75
 * 5. Michael Estrada -Delantero-, edad 27, estatura 1.93
 * Promedio de edades:  26.8
 * Promedio de estaturas: 1.87
 */
import java.util.Scanner;

public class Problema4_Jugadores {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombre, posicion;
        int contador = 1, cantidad;
        double edad, estatura, sumaEdades = 0, sumaEstaturas = 0;

        System.out.print("Ingrese la cantidad de jugadores: ");
        cantidad = in.nextInt();

        System.out.println("Listado de jugadores:");

        while (contador <= cantidad) {
            System.out.print("Ingrese el nombre, posicion, edad y estatura del jugador " + contador + ": ");
            nombre = in.next();
            posicion = in.next();
            edad = in.nextDouble();
            estatura = in.nextDouble();

            System.out.println(contador + " - " + posicion + " - " + nombre + " edad " + edad + " estatura " + estatura);

            sumaEdades += edad;
            sumaEstaturas += estatura;

            contador++;
        }

        double promedioEdades = sumaEdades / cantidad;
        double promedioEstaturas = sumaEstaturas / cantidad;

        System.out.println("Promedio de edades: " + promedioEdades);
        System.out.println("Promedio de estaturas: " + promedioEstaturas);

    }
}
/**
 * *
 * Ingrese la cantidad de jugadores: 5 Listado de jugadores: Ingrese el nombre,
 * posicion, edad y estatura del jugador 1: AlexanderDominguez Arquero 32 1,95 1
 * - Arquero - AlexanderDominguez edad 32.0 estatura 1.95 Ingrese el nombre,
 * posicion, edad y estatura del jugador 2: XavierArreaga Defensa 24 1,85 2 -
 * Defensa - XavierArreaga edad 24.0 estatura 1.85 Ingrese el nombre, posicion,
 * edad y estatura del jugador 3: MoisesCaicedo MedioCentro 19 1,88 3 -
 * MedioCentro - MoisesCaicedo edad 19.0 estatura 1.88 Ingrese el nombre,
 * posicion, edad y estatura del jugador 4: AngelMena Delantero 32 1,75 4 -
 * Delantero - AngelMena edad 32.0 estatura 1.75 Ingrese el nombre, posicion,
 * edad y estatura del jugador 5: MichaelEstrada Delantero 27 1,93 5 - Delantero
 * - MichaelEstrada edad 27.0 estatura 1.93 
 * Promedio de edades: 26.8 
 * Promedio de  estaturas: 1.8719999999999999 
 * BUILD SUCCESSFUL (total time: 1 minute 52  seconds)
 *
 */
