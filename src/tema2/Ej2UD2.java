package tema2;

public class Ej2UD2 {
    
    public static void main(String[] args) {
        
        String usuario = "usuario";
        String contrasena = "12345678";
        String usuarioTeclado;
        String contrasenaTeclado;

        usuarioTeclado = IO.readln("Dime tu usuario ");
        contrasenaTeclado = IO.readln("Dime tu contraseña ");

        if (contrasena.equals(contrasenaTeclado)){ //SIRVE PARA COMPARAR EL EQUALS 
            IO.println("la contraseña es correcta");
        }
        else {
            IO.println("contraseña inorrecta");
        }

        if(usuario.equals(usuarioTeclado)){

            IO.println("el usuario es correcto");

        }
        else{

            IO.println("el usuario es incorrecto");

        }

    }

}
