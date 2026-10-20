package tema2;

public class ejercicioclase219oct {
    
    public static void main(String[] args) {

        /*
            Estamos en una partida de D&D

            Añadir una variable 'vida' de tipo entero que empiece con valor 100
            Añadir una variable 'escudo' de tipo booleano, si llevas escudo o no. True.

            El héroe se enfrenta a un orco y tira un dado de 20 caras. Según el dado:
                1 Pifia, tropieza y pierde el combate. Vida = 0
                2 - 5  Huyes despavorido. Vida -50
                6 - 10 Te cubres con el escudo. 
                    Si llevas escudo no te quita vida y mensaje "Paras golpe con escudo"
                    Si no llevas escudo. Via -70
                11 - 15 Ataque normal con la espada                
                16 - 19 Ataque feroz
                    Si llevas escudo mensaje "Golpe brutal con el escudo"
                    Si no llevas escudo mensaje "Golpe feroz con la espada"
                20 Golpe critico, el orco es fulminado
            
            Simula la tirada del dado (ver ejercicios tema anterior)
            Y muestra un mensaje con la acción que se produce.    
            Que muestre también un mensaje con la vida del jugador.

            

            
            int n = (int) (Math.random() * (maximo - minimo + 1)) + minimo
        */

        
        int n = (int) (Math.random() * (20 - 1 + 1)) + 1;
        int vida = 100;
        boolean escudo = true;
        

        if (n == 1){

            System.out.println("a la mierda");
            vida = 0;


        }

        else if (n >= 2 && n <=5) {

            System.out.println("huye como marica");
            vida = (vida - 50);
            
        }

        else if (n >= 6 && n <= 10){

            System.out.println("te cubres como calvo nenaza");
            if (escudo = true){

                System.out.println("has parado el golpe con el escdo como nenaza");

            } else {

                vida = (vida - 70);

            }
            
        }
        else if (n >= 11 && n <= 15){

            System.out.println("ataco con mi enorme espada");
            
        }
        else if (n >= 16 && n <= 19){

            System.out.println("atakeh feroh");
            
        }
                else if (n >= 20){

                    System.out.println("el corco vale verga");
            
        }

        

    }

}
