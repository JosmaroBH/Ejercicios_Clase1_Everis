import java.util.Scanner;
public class ejercicio_01 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        int nro1, nro2,nro3,pro;

        System.out.println("Escriba el primer numero entero:");
        nro1 = leer.nextInt();
        System.out.println("Escriba el segundo numero entero:");
        nro2 = leer.nextInt();
        System.out.println("Escriba el tercer numero entero:");
        nro3 = leer.nextInt();
        pro= nro1*nro2*nro3;

        System.out.println("El producto de los 3 numeros enteros es: " + pro);
    }
}
