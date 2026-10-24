package tema1;

public class ejerciciosoperadoreslogicos {
    
    public static void main(String[] args) {
        
        /*
            En un parque de atracciones para subir a la montaña rusa "el dragon"
            hace falta cumplir estas reglas:

            - tener 12 años o mas
            - medir 150cm o mas

            pero para la montaña rusa Mini-Mierda solo hace falta cumplir una de estas:

            -tener menos de 12 años
            -0 medir menos de 140 cm

            Declara estas variables 
            int edad = 18
            double altura = 1.45

            Debes decirme
            1. Si puede subri a algun dragon
            2. Si puede subir al mini mini
            3. Piensa el resultado antes de programar
            4. Cambia la edad y la altura para poder entrar a minimini


        
        
        
        */


            int edad = 18;
            double altura = 1.45;

            if (edad >=12 && altura >= 1.50) {
                IO.println("puedes subir la montaña el dragon");
            }

            if (edad < 12 || altura < 1.40) {         
                IO.println("puedes subirte a la montaña mini-mierder");
            } 


    }

}
