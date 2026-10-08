import java.util.Scanner;

public static void main (String args[]) {
    double radioFutbol;
    double radioBaloncesto;
    double volumenFutbol;
    double volumenBaloncesto;
    String mayorVolumen;
    Scanner teclado = new Scanner(System.in);

    System.out.println("¿cual es el radio del balon de futbol?");
    radioFutbol = teclado.nextInt();
    System.out.println("¿cual es el radio del balon de baloncesto?");
    radioBaloncesto = teclado.nextInt();
    volumenFutbol = (Math.PI * radioFutbol * radioFutbol);
    System.out.println("El volumen del balon de futbol es " + volumenFutbol);
    volumenBaloncesto  = (Math.PI * radioBaloncesto * radioBaloncesto);
    System.out.println("El volumen del balon de baloncesto es " + volumenBaloncesto);
    Math.max(volumenFutbol, volumenBaloncesto);
    System.out.println("El volumen maximo es " + );

}
