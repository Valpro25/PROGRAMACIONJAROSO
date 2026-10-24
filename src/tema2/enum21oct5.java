package tema2;

public class enum21oct5 {
    
    public static void main(String[] args) {
        
        /*🎮 Ejercicio Java: Menú principal de un videojuego
Nivel: Fácil — DAW
Enunciado
Crea un programa en Java que simule el menú principal de un videojuego. El menú tendrá tres opciones:
1. UN JUGADOR
2. MULTIJUGADOR
3. SALIR
El programa debe cumplir los siguientes requisitos:

1. Crear un enum llamado OpcionesMenu con estas tres opciones:
- UN_JUGADOR
- MULTIJUGADOR
- SALIR
2. Crear una variable de tipo OpcionesMenu para guardar la opción elegida por el usuario.

3. Mostrar el menú por pantalla y pedir al usuario que escriba una de las tres opciones.

4. Convertir la respuesta del usuario a mayúsculas y utilizar valueOf() para obtener el valor correspondiente del enum.

5. Utilizar un switch para mostrar un mensaje diferente según la opción elegida.*/

        enum menu{

            SOLITARIO,
            MULTIJUGADOR,
            SALIR

        }

        menu OpcionUsuario;

        System.out.println("ELIGE UNA DE ESTAS TRES OPCIONES");
        System.out.println("SOLITARIO");
        System.out.println("MULTIJUGADOR");
        System.out.println("SALIR");

        OpcionUsuario = menu.valueOf(IO.println("Escoge una opcion")).toUpperCase();

    }

}
