public class dado {
    
    public static void main(String[] args) {
        
        int dado1;
        int dado2;
        int aleatorio;
        int aleatorio2;
        int maximo = 10;
        int  minimo = 3;
        boolean doble;

        aleatorio = (int) ( Math.random() * (10 - 3 + 1)) + 3;
        aleatorio2 = (int) ( Math.random() * (10 - 3 + 1)) + 3;
        doble = (aleatorio == aleatorio2);
        System.out.println(aleatorio);
        System.out.println(aleatorio2);
        System.out.println("el valor de doble  es " + doble);


    }

}
