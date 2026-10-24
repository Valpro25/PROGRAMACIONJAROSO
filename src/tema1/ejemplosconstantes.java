package tema1;

public class ejemplosconstantes {

    //las constantes se ponen fuera del main 
            final double ivageneral = 0.21;
            final double pi = 1.84;
    public static void main(String[] args) {
        double precio = 220.0;
        double precioConIva = 0.0;

        precioConIva = precio + precio * ivageneral;
        IO.println("el precio con iva es " + precioConIva);
    }

}
