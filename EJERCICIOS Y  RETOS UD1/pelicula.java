public class pelicula {
    
    public static void main(String[] args) {
        
        int total = 98765;
        int horascompletas;
        int minutoscompletos;
        int segundoscompletos;
        boolean superadia;
        

        horascompletas = (total / 3600);
        System.out.println(horascompletas);
        minutoscompletos = (horascompletas * 3600 - total % 60);
        System.out.println(minutoscompletos);
        segundoscompletos = (total * 60 - minutoscompletos % 3600);
        System.out.println(segundoscompletos);
        superadia = (total > (3600  * 24));
        System.out.println(superadia);



    }

}
