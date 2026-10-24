public class C2 {
    
    public static void main(String[] args) {
        
        int total = 3725;
        int horas;
        int minutos;
        int segundos;
        int gaurdasegs;

        horas = (total / 3600);
        minutos = (total %  60);
        gaurdasegs =  (total - 3600);
        
      

        

        System.out.println(horas);
        System.out.println (gaurdasegs);


    }

}
