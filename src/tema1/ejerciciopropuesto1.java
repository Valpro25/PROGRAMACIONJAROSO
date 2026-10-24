package tema1;

public class ejerciciopropuesto1 {
    public static void main(String[] args) {
        
        double precioSinIva = 40000.0;
        double precioConIva;
        double primerDescuento = 3500;
        double segundoDescuento = 1500;
        double resultado;

        precioConIva = precioSinIva + (precioSinIva * 0.21);
        //primerDescuento = precioConIva - 3500;
       // segundoDescuento = primerDescuento - 1500;
        resultado = precioConIva - primerDescuento - segundoDescuento;

        IO.println("el precio sin el iva y con los descuentos " + resultado);

    }
}
