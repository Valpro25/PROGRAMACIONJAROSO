package tema2;

public class enum21oct4 {
    public static void main(String[] args) {
        
        /*🧑‍💻 Ejercicio de Java: ENUM y SWITCH
Nivel: Fácil — DAW
Enunciado: Selección de un medio de transporte 🚗
Crea un programa que permita al usuario elegir un medio de transporte y muestre un mensaje según su elección.

El programa debe cumplir estos requisitos:
1. Crea un enum llamado Transporte con estas opciones:
   - COCHE
   - MOTO
   - BICICLETA
2. Crea una variable llamada transporte de tipo Transporte.
3. Pide al usuario que escriba qué medio de transporte quiere utilizar.
4. Utiliza toUpperCase() para convertir la respuesta a mayúsculas y valueOf() para obtener el valor correspondiente del enum.
5. Utiliza un switch para mostrar un mensaje dependiendo del transporte elegido:*/


        enum transporte{

            COCHE,
            MOTO,
            BICI

        }

        transporte Transporte;

        IO.println("Puedes elegir los siguentes tipos de transporte:");
        IO.println("COCHE");
        IO.println("MOTO");
        IO.println("BICI");

        Transporte = transporte.valueOf(IO.readln("Seleccione un tipo de transporte ").toUpperCase());

        switch (Transporte) {
            case BICI -> IO.println("El transporte elegido a sido una bici");
            case MOTO -> IO.println("El transporte elegido a sido una moto");
            case COCHE -> IO.println("El transporte elegido a sido un coche");
        }
    }
}
