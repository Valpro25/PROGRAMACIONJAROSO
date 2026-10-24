public class A7 {
    
    public static void main(String[] args) {
        
        int a = 'a';
        System.out.println(a); //esto imprime 97 por que es el valor de A en ascii

        // int PI = 3.14;
        // System.out.println(PI); //da fallo por que estas intentando meter un numer doube en una variable  int

        // double PI2 = 3,14;
        // System.out.println(PI2); //este no funciona por  que un double (numero con decimal se separa con punto no con coma)

        float pi = 3.1416f; //recuerda los numeros con float SIEMPRE se le pone una f al final
        System.out.println(pi);

        // boolean adivina = (1 == 4);
        // System.out.println(adivina);

        // boolean adivina = (97 == 'a' == 97);  //esto da error por que estas intentando comparar un boleano con un entero true == 97
        // System.out.println(adivina);


        boolean adivina = (97 == 'a' == true);
        System.out.println(adivina);

        // final int MAX = 10;
        // MAX = 20; //esto da error por que no puedes cambiar el valor de una constante

        
        // int x;
        // System.out.println(x);  //no imprime nada por que x no tiene valor

        byte b = 120;
        System.out.println(b); //esto se imprime por que dentro de un un byte se puede almacenar un numero del 0 al 127

        // byte c = 200;
        // System.out.println(c);

        char c = 'A' + 1;
        System.out.println(c); //aumenta en uno y nos muestra la equivalencia  en el codigo ascii

        int i = 1;
        char d = 'A' + i;
        System.out.println(c);


    }

}
