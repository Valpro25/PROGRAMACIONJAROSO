
// Una tienda de informática quiere crear un pequeño programa para calcular el importe que debe pagar un cliente por la compra de un producto. El programa deberá trabajar con los datos correspondientes al precio de un producto, la cantidad de unidades compradas y un porcentaje de descuento que se aplicará sobre el importe de la compra. Además, la tienda cobra un IVA del 21 %, cuyo valor debe mantenerse fijo durante la ejecución del programa. El programa deberá calcular primero el importe correspondiente a las unidades adquiridas, después aplicar el descuento y, finalmente, calcular el IVA sobre el importe resultante para obtener el precio final de la compra. Al terminar, deberá mostrar por pantalla el precio inicial de la compra, el descuento aplicado, el IVA correspondiente y el precio final que deberá pagar el cliente.

public static void main (String args[]){

    double precio;
    int cantidad;
    double descuento;
    final double iva = 0.21;
    double precioTotal;
    double resultado;
    double cantidadDescontada;
    double valorIva;

    cantidad = 10;
    precio = 1.00;
    descuento = 0;

    precioTotal = precio * cantidad;
    descuento = precioTotal - (precioTotal /2);
    resultado =  (descuento * iva) + descuento; //asi se calcula el IVA de algo PRECIO * 0.21 + PRECIO
    cantidadDescontada = (precioTotal /2);
    valorIva = (descuento * iva);

    IO.println("El precio inicial sin iva es " + precioTotal + " aplicando el descuento el precio seria " + descuento + " y si a eso le añadimos el iva se queda en " + resultado);
    IO.println("El dinero que se desconto fue " + cantidadDescontada);
    IO.println("El valor del iva es " + valorIva);

}