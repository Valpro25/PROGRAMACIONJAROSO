package tema2;

public class ejercicio3_20oct {
    
    public static void main(String[] args) {
        
         /*
            Tenemos tres variables:
            - Humedad del suelo: entre 0 y 100, generada de forma aleatoria
            - Temperatura: entre -50 y 50, generada de forma aleatoria
            - EstaLloviendo: booleano, generado de forma aleatoria

            El programa mostrará la acción de si se riega o no según:
            1. Si está lloviendo no regar
            2. Si la humedad es menor que 30:
                - Si la temperatura es mayor que 30: riego intensivo
                - En otro caso: riego normal
            3. Si la humedad está entre 30 y 59:
                - Si la temperatura es mayor que 35: riego normal
                - En otro caso: riego ligero
            4. Si la humedad es mayor que 60: no regar

            Muestra mensaje de regar (intensivo, normal o ligero) o de no regar según los datos.
            
            int n = (int) (Math.random() * (maximo - minimo + 1)) + minimo

        */

        int HumedadSuelo;
        int Temperatura;
        boolean EstaLloviendo;

        HumedadSuelo = (int) (Math.random() * (100 - 0 + 1)) + 0;
        Temperatura = (int) (Math.random() * (50 - -50 + 1)) + -50;
        EstaLloviendo = Math.random() < 0.5; //esto hace que haya un 50% de probabilidades de que salga verdadero o falso 


        if(EstaLloviendo == true){

            System.out.println("no regar esta lloviendo");

        }

        if(HumedadSuelo < 30 && Temperatura > 30){

            System.out.println("riego intensivo");

        } else {

            System.out.println("riego normal");

        }

        if(HumedadSuelo >= 30 && HumedadSuelo <= 59){

           
        } else if(Temperatura > 35){

            System.out.println("riego normal");

        } else {

            System.out.println("riego ligero");

        }

        if(HumedadSuelo > 60){

            System.out.println("no regar");

        }

    }

}
