public class juegisla {
    
    public static void main(String[] args) {
        
        int Vida = 100;
        int Comida = 50;
        boolean TieneRefugio = true;
        int NivelPeligro;

        NivelPeligro =(int) (Math.random() * (20 - 1 + 1) + 1); //CUANDO TRABAJAS  CON ENTEROS INT AL PRINCIPIO

        if (NivelPeligro == 1){

            Vida = Vida - 100;
            System.out.println("Has muerto");

        }

        else if(NivelPeligro <= 2 && 5 >= NivelPeligro){

            IO.println("Has sido atacado por un animal");
            Vida = Vida - 30;

        }
        else if(NivelPeligro >= 6 && 10 <= NivelPeligro){

            IO.println("Ceniza volanica busca refugio");

            if(TieneRefugio == true){

                IO.println("no pierdes vida");

            } else {

                Vida = Vida - 20;

            }


        }
        else if(NivelPeligro >= 11 && 15 <= NivelPeligro){

            IO.println("Encuentras un campamento +20 puntos de comida");
            Comida = Comida + 20;

        }
        else if(NivelPeligro >= 16 && 19 <= NivelPeligro){

            if(TieneRefugio == true && Comida > 20){

                IO.println("sobrevive sin daños");

            } else {

                Vida = Vida - 40;

            }

        }
        else if(NivelPeligro == 20){

            IO.println("recuperas toda la vida mas 20 de comida");
            Vida = 100;
        }
    }

}
