package tema1;

public class ejemplolecturateclado {
    
    public static void main(String[] args) {
        
        //recuerda que cuando pongas next int puede haber un problema que se soluiciona poniendo un nextLine() justo despues del nextInt()
        //codigo mas eficiente para poder pedir enteros edad = Integer.parseInt(sc.nextLine())
        // para pedir todo tipo de dato mas facil aun nombre = IO.readln("dime tu nombre")

        //otro ejemplo edad = Integer.parseInt (IO.readln("dime tu edad"))

        int edad;
        String nombre;

        edad = Integer.parseInt (IO.readln("Tu edad es ")); //Cuando quieras pedir un entero se hace asi
        nombre = IO.readln("Y te llamas "); //Cuando quieras pedir un string se hace asi
        
        //hoy tambien hemos visto el casting que es numeropequenio = (int) numerogrande

    }

}
