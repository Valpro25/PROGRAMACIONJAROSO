package tema1;


public class ejercicioclase7oct2 {
    
    public static void main(String[] args) {
     
        /*
            Hay que pedir por teclado el precio de un producto
            Debéis aplicarle el 21% de IVA y mostrar el nuevo precio
            Debéis aplicarle un descuento del 5% (sobre el precio con IVA) y mostrar el precio final
        
        */
        final double iva = 1.21;
        double precioProducto;
        double precioConIVA;
        double precioConIVAyDescuento;



        precioProducto = Double.parseDouble(IO.readln("El precio del producto es "));

        precioConIVA = precioProducto * iva;
        precioConIVAyDescuento = precioConIVA - (precioConIVA * 0.05);

        IO.println("El precio del producto con iva es " + precioConIVA);
        IO.println("El precio del producto con iva con el decuento es " + precioConIVAyDescuento);


        

    }

}
