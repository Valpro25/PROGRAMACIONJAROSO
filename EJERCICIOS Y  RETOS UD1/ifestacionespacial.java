public class ifestacionespacial {
    
    public static void main(String[] args) {
        
        int Energia = 100;
        boolean ModoEmergencia = false;
        int AlertaAleatoria;

        AlertaAleatoria =(int) (Math.random() * (20 - 1 + 1)) + 1;

        if (AlertaAleatoria == 1){

            Energia = Energia - 100;

        }
        else if(AlertaAleatoria >= 2 && 5 >= AlertaAleatoria){

            Energia = Energia - 40;

        }
        else if(AlertaAleatoria >= 6 && 10 >= AlertaAleatoria){

            if(ModoEmergencia ==  true){

                System.out.println("No pierdes energia sobrecarga controlada");

            } else {

                Energia = Energia - 30;

            }

        }
        
        else if(AlertaAleatoria >= 11 && 15 >= AlertaAleatoria){

            System.out.println("sistemas establilizados");

        }
        else if(AlertaAleatoria >= 16 && 19 >= AlertaAleatoria){

            if(ModoEmergencia == true){

                System.out.println("defensa  reforzada");

            }

            else{

                System.out.println("defensa basica");

            }

        }
        else if(AlertaAleatoria == 20){

            Energia = 100;

        }
    }

}
