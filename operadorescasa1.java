public class operadorescasa1 {
    public static void main(String[] args) {
        
        int cantidad = 7;
        int stock  = 10;
        boolean resultado;

        resultado = (resultado = ++cantidad > 7  &&  stock--  < 10);
        IO.println("Este es el valor final  de cantidad " + cantidad);
        IO.println("Este es el valor final  de stock " + stock);
        IO.println("Y este es el resultado " + resultado);

    }
}
