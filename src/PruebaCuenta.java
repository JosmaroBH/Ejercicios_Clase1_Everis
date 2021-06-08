import java.util.Scanner;
public class PruebaCuenta {
    public static void main(String[] args){
        //creamos un objeto leer para recoger datos
        Scanner leer = new Scanner(System.in);

        //creamos un objeto de la clase Cuenta
        Cuenta miCuenta = new Cuenta();

        System.out.printf("El nombre inicial es: %s %n %n", miCuenta.getNombre());

        //pide y lee el nombre
        System.out.println("Introduce el nombre de la cuenta: ");
        String elnombre = leer.nextLine();
        miCuenta.setNombre(elnombre);
        System.out.println();

        System.out.printf("El nombre en el objeto miCuenta es: %n %s %n", miCuenta.getNombre());


        System.out.println("Introduce el monto de la cuenta: ");
        int dineropararetirar = leer.nextInt();
        miCuenta.setMonto(dineropararetirar);

        System.out.println("Introduce la cantidad para retirar: ");
        int cretirar = leer.nextInt();
        miCuenta.retirar(cretirar);

        System.out.printf("El saldo restante en la cuenta es: %n %d %n", miCuenta.getMonto());

    }
}
