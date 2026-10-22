package tema2;

public class switchmenu21oct {
    
    public static void main(String[] args) {
        
         /*
            Vamos a hacer una especie de menú
            Tenéis que pedir por teclado una opción del 1 al 5
            - 1. Mostrar todos los usuarios
            - 2. Mostrar un usuario
            - 3. Modificar un usuario
            - 4. Eliminar un usuario
            - 5. Salir

            Implementa eso con el nuevo switch, y para cada opción haz dos líneas:
            - IO.println("Has seleccionado la opción " + opcion);
            - IO.println("MOSTRAR USUARIO")

            Si no es una de esas opciones mostrar: OPCIÓN INCORRECTA
        */


        int opcion;
        opcion = (int) (Math.random() * (5 - 1 + 1) - 1);


        switch (opcion) {

            case 1 -> {
                
                IO.println("Has seleccionado la opcion " + opcion);
                IO.println("Mostrar todos los usuarios");
            
            } //recuerda cuando un case tiene mas de una linea se escribe dentro de una llave
            case 2 -> {

                IO.println("Has seleccionado la opcion " + opcion);
                IO.println("Mostrar un usuario");

            }
            case 3 -> {

                IO.println("Has seleccionado la opcion " + opcion);
                IO.println("Modificar un usuario");

            }
            case 4 -> {

                IO.println("Has seleccionado la opcion " + opcion);
                IO.println("Eliminar un usuario");

            }
            case 5 -> {

                IO.println("Has seleccionado la opcion " + opcion);
                IO.println("salir");

            }
            default -> { //ACUERDATE de poner siempre default al final

                IO.println("OPCION INCORRECTA");

            }


        }


    }

}
