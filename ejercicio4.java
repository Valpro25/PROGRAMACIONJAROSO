public class ejercicio4 {
    
    public static void main(String[] args) {
        
    /*
        La ficha de un producto tiene la siguiente información:
        - Nombre
        - Descripción
        - Precio
        - IVA (0.21, 0.10, ...)
        - Categoría
        - Stock en almacén

        Pide los valores por teclado y pinta la información lo mejor posible
        
    */

        String Nombre;
        String Descripcion;
        double Precio;
        double Iva;
        double PrecioIva;
        String Categoria;
        int Stock;

        IO.println("\u001B[32m--------------------------------\u001B[0m");
        Nombre = IO.readln("Nombre: ");
        IO.println("INFORMACION PRODUCTO: " + Nombre);
        IO.println("\u001B[32m--------------------------------\u001B[0m");
        Descripcion = IO.readln("\u001B[32mDescripcion: \u001B[0m");
        Precio = Double.parseDouble(IO.readln("\u001B[32mPrecio: \u001B[0m"));
        System.out.printf("El precio es  %.2f%n", Precio);
        Iva = Double.parseDouble(IO.readln("\u001B[32mIva: \u001B[0m "));
        System.out.printf("El iva es  %.2f%n", Iva);
        Categoria = IO.readln("\u001B[32mCategoria: \u001B[0m ");
        Stock = Integer.parseInt(IO.readln("\u001B[32mStock \u001B[0m"));
        

        Iva = Precio * Iva  +  Precio;

        System.out.printf  ("El precio con IVA es: %.2f%n", Iva);
        IO.println("\u001B[32m--------------------------------\u001B[0m");

    }

}
