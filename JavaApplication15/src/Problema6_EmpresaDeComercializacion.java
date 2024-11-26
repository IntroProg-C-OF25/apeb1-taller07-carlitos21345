
/** *
 * Una empresa de comercialización de computadoras
 * realiza el proceso de venta haciendo un descuento por tipo de cliente:
 * Si es cliente tipo 1 hay un descuento del 10% Si es cliente tipo 2 hay un descuento del 20%
 * En caso que sea otro tipo de cliente, no hay descuento. Generar un proceso que permita ingresar 7 ventas:
 * por cada venta preguntar los siguiente datos:
 *
 *Nombre del cliente
 *Costo de la computadora (solo se vende una computadora por transacción)
 *Tipo de cliente Presentar el siguiente reporte: Cliente tipo 1, compra computadora con precio $100
 */
import java.util.Scanner;

public class Problema6_EmpresaDeComercializacion {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        String nombre_cliente;
        int tipo_cliente;
        int contador = 1;
        double precio_fi, cost_compu;
        while (contador <= 7) {
            System.out.println("Cliente " + contador + ":");
            System.out.print("INGRESA EL NOMBRE DEL CLIENTE ,EL COSTO DE LA COMPUTADORA Y TIPO DE CLIENTE: ");
            nombre_cliente = ingreso.nextLine();
            cost_compu = ingreso.nextDouble();
            tipo_cliente = ingreso.nextInt();
            ingreso.nextLine();
            if (tipo_cliente == 1) {
                precio_fi = cost_compu * 0.9;
            } else if (tipo_cliente == 2) {
                precio_fi = cost_compu * 0.8;
            } else {

                precio_fi = cost_compu;
                System.out.println("NO SE APLICA EL DESCUENTO");
            }
            System.out.println("NOMBRE DEL CLIENTE = " + nombre_cliente);
            System.out.println("COSTO DE LA COMPUTADORA = " + cost_compu);
            System.out.println("QUE TIPO ES DE CLIENTE = " + tipo_cliente);
            System.out.println("EL PRECIO FINAL ES = " + precio_fi);

            contador++;
        }

    }
}
/***
 * Cliente 1:
 *INGRESA EL NOMBRE DEL CLIENTE ,EL COSTO DE LA COMPUTADORA Y TIPO DE CLIENTE: Carlitos
 *100
 *1
 *NOMBRE DEL CLIENTE = Carlitos
 *COSTO DE LA COMPUTADORA = 100.0
 *QUE TIPO ES DE CLIENTE = 1
 *EL PRECIO FINAL ES = 90.0
 */
