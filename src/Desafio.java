import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("**********");
        System.out.println();
        System.out.println("Nombre de Cliente: " + nombre);
        System.out.println("Tipo de Cuenta: " + tipoDeCuenta);
        System.out.println("Saldo: " + saldo);

        String menu = """
                *** Escriba el numero de la opcion deseada...:
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El sueldo actualizado es: " + saldo);
                    break;
                case 2:
                    double saldoARetirar = 0;
                    System.out.println("Ingrese el monto a retirar: ");
                    saldoARetirar = teclado.nextDouble();
                    if (saldoARetirar > saldo){
                        System.out.println("Saldo insuficiente");
                    }else {
                        saldo -= saldoARetirar;
                        System.out.println("El saldo actualizado es: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el monto a depositar: ");
                    double saldoADepositar = teclado.nextDouble();
                    saldo += saldoADepositar;
                    System.out.println("El saldo actualizado es: " + saldo);
                    break;
                case 9:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios");
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
