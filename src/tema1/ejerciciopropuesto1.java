package tema1;

public class ejerciciopropuesto1 {
    public static void main(String[] args) {
        
        double precioSinIva = 40000.0;
        double precioConIva;
        double primerDescuento;
        double segundoDescuento;
        double resultado;

        precioConIva = precioSinIva + (precioSinIva * 0.21);
        primerDescuento = precioConIva - 3500;
        segundoDescuento = precioConIva - 1500;
        resultado = segundoDescuento;

        IO.println("el precio sin el iva y con los descuentos" + resultado);

    }
}
