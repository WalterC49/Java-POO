/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ejercicio_05;

import Entidades.Cuenta;
import Servicios.CuentaServicio;

/**
 *
 * @author Walter
 */
public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaServicio cS = new CuentaServicio();
        Cuenta c1 = new Cuenta();
        int op;

        System.out.println("Este programa administra una cuenta bancaria creada por el usuario.");

        do {
            System.out.println("\nMenú:"
                    + "\n1- Crear Cuenta"
                    + "\n2- Ingresar saldo"
                    + "\n3- Retirar saldo"
                    + "\n4- Extracción rápida(20% del saldo)"
                    + "\n5- Consultar saldo"
                    + "\n6- Consultar Datos"
                    + "\n7- Salir");
            System.out.print("Ingrese una opción: ");
            op = cS.leer.nextInt();

            switch (op) {
                case 1:
                    cS.CrearCuenta(c1);
                    break;
                case 2:
                    cS.IngresarS(c1);
                    break;
                case 3:
                    cS.RetirarS(c1);
                    break;
                case 4:
                    cS.ExtracionRapida(c1);
                    break;
                case 5:
                    cS.ConsultarSaldo(c1);
                    break;
                case 6:
                    cS.ConsultarDatos(c1);
                    break;
                case 7:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Opción no valida.");
                    break;
            }
        } while (op != 7);
    }

}
