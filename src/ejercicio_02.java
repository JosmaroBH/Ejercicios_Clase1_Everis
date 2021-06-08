import java.util.Scanner;
public class ejercicio_02 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        int nro1, nro2;

        System.out.println("Escriba el primer numero entero:");
        nro1 = leer.nextInt();
        System.out.println("Escriba el segundo numero entero:");
        nro2 = leer.nextInt();

        if(nro1>nro2){
            System.out.println("Numero: " +nro1 + " es mayor");
        }else{
            System.out.println("Numero: " +nro2 + " es mayor");
        }
        if(nro1==nro2){
            System.out.println("los numeros son iguales");
        }
    }
}
