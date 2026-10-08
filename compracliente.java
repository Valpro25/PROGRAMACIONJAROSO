import java.util.Scanner;

public class compracliente {



    public static void main(String[] args) {
        
        String NombreCliente;
        int unidades;
        double precioUnidad = 5.00;
        double importeCompra;
        double importeCompraConIva;
        Scanner sc = new Scanner (System.in);

        final double iva = 0.21;

        System.out.println("Indique su nombre");
        NombreCliente = sc.nextLine();
        System.out.println("¿Cuantas unidades del producto a comprado?");
        unidades = sc.nextInt();
        System.out.println("El cliente " + NombreCliente + "ha  adquirido " + unidades + " unidades de abduscan que valen " + precioUnidad + " por unidad por lo que el importe total a pagar es " + importeCompra + "y el importe incluyendo el iva es " + importeCompraConIva);

        importeCompra = (precioUnidad * unidades);
        importeCompraConIva  = (precioUnidad * unidades * iva);


    }
}