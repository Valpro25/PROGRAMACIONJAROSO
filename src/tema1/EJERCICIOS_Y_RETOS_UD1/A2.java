package tema1.EJERCICIOS_Y_RETOS_UD1;

public class A2 {
    
    public static void main(String[] args) {
        
        System.out.println(5 / 2);
        System.out.println(5 / 2.0);
        System.out.println(5 % 2);
        System.out.println(-5 / 2); //aqui el numero que multiplicamos se queda con el signo negativo
        System.out.println(-5 % 2); //aqui el resto se queda con el signo negativo
        System.out.println(5.0 / 0); //algo dividido entre 0 siempre da infinito
        System.out.println(0.0 / 0.0); //solo si dividimos 0 entre 0 da error (las cosas entre 0 no e pueden dividir)
        System.out.println(0.1 + 0.2); //el resultado es 0,3 pero como no tiene limite salen mas decimales (para rellenar la cantidad de bits del tipo de dato double)
        System.out.println(0.1 + 0.2 == 0.3);//el resultado es false por que 0.1 + 0.2 es 0.3000000... al no haberle puesto limite 
        System.out.println((int) 3.99); //el resultado es 3 por que al pasar de double a entero SIEMPRE se redondea hacia ABAJO
        System.out.println((int) -3.99); //esto es lo mismo pero se le añade el signo menos por que lo ereda de el 3.99
        System.out.println(Math.round(3.5)); //cuando queremos redondear un numero a partir de .5 redondea para arriba
        System.out.println(Math.round(-3.5)); //da 3 por que al hacer round java lo que hace SIEMPRE SUMA 0.5 por lo que si a un numero negativo le sumas 0.5 estas mas cerca del 3
        System.out.println(Math.round(2.5)); //aqui vemos que a partir de .5 redondeamos para arriba igual
        System.out.println(10 / 3 * 3);
        System.out.println((double) 10 / 3 * 3);

    }

}
