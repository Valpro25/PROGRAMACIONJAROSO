package tema1;

public class ejercicioclase7oct {
    
    public static void main(String[] args) {
        
        /*
            La nota de programación de la primera evaluación se calcula:
            - 30% una prueba de clase a mitad de trimestre
            - 30% un exámen al final de la evaluación
            - 25% de prácticas de clase
            - 15% evaluación formativa: participación en clase, lo bien que le caes al profesor, etc.

            Pide cada nota por teclado y muestra la nota final del trimestre
        */

        double resultado;
        double pruebaClase;
        double examenFinal;
        double practicasClase;
        double evalucaionFormativa;

        
        pruebaClase = Double.parseDouble(IO.readln("Tu nota de la prueba de clase es "));
        pruebaClase = pruebaClase * 0.30;
        examenFinal = Double.parseDouble(IO.readln("Tu nota del examen final es "));
        examenFinal = examenFinal * 0.30;
        practicasClase = Double.parseDouble(IO.readln("Tu nota de las practicas de clase es "));
        practicasClase = practicasClase * 0.25;
        evalucaionFormativa = Double.parseDouble(IO.readln("Tu nota de la evaluacion formativa es "));
        evalucaionFormativa = evalucaionFormativa * 0.15;
        resultado = (pruebaClase + examenFinal + practicasClase + evalucaionFormativa);
        
        
        IO.println("Tu nota de clase es " + resultado);
        




    }

}
