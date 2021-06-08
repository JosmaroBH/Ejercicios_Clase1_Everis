import java.util.Scanner;
public class ejercicio_03 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        int nro1;

        System.out.println("Escriba el numero entero:");
        nro1 = leer.nextInt();
        if(nro1%2 == 0){
            System.out.println("El numero "+nro1+ " es par");
        }else{
            System.out.println("El numero "+nro1+" es impar");
        }
    }
}
