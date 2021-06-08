public class Cuenta {

    private String nombre; //variable de instancia

    private int monto;

    //metodo set de modificacion
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setMonto(int monto){
        this.monto = monto;
    }

    public int getMonto(){
        return monto;
    }

    public void retirar(int cantidad){
        if(cantidad > monto){
            System.out.println("No se puede retirar, El monto a retirar excede el saldo de la cuenta ");
        }else {
            monto = monto - cantidad;
        }
    }
}
