import java.util.Scanner;
public class Suma_Enteros {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        int nro1, nro2, sum;

        System.out.println("Escriba el primer numero entero:");
        nro1 = leer.nextInt();
        System.out.println("Escriba el segundo numero entero:");
        nro2 = leer.nextInt();
        sum= nro1+nro2;

        System.out.println("La suma de los numero enteros es: " + sum);
    }
}
