public class Main {

    public static void main (String[] args){

        //aqui se pueden poner funciones y variables

        int edad;
        double precio;
        String nombre;
        boolean tonto;
        double notaProgramacion = 10;
        String nombreProfesor = ("Javier");
        double notaMedia = 0;
        double notaPrimerTrimestre = 5;
        double notaSegundoTrimestre = 3;
        double notaTercerTrimestre = 8;

        edad = 21;
        edad = 33;
        nombre = "123456789";

        IO.println("Me llamo " + nombre + " y tengo " + edad + " años");
        tonto = true;
        IO.println("¿Eres tonto?" + tonto);
        IO.println(nombreProfesor);

        notaMedia = (notaPrimerTrimestre + notaSegundoTrimestre + notaTercerTrimestre) / 3;        
        IO.println("LA NOTA MEDIA ES " + notaMedia);

    }

}
