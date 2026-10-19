package tema2;

class ifanidados {

    public static void main(String[] args) {
 
        int armadura;
        int vida;

        armadura = Integer.parseInt(IO.readln("tienes armadura"));
        vida = Integer.parseInt(IO.readln("tienes vida"));

        if(armadura > 0){

            System.out.println("el personaje sobrevive");

        }
        else if(armadura < 0 || vida <= 0){

            System.out.println("el personaje muere");

            

        }

    }
}