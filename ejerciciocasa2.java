public class ejerciciocasa2{

    public static void main (String[] args){

        double autonomia;
        double capacidad;
        double consumo;
        double distancia;
        boolean llegamos;

        capacidad = 82.0;
        consumo = 18.5;
        distancia = 400.0;
        autonomia = 0;

        autonomia = capacidad * 100 /  consumo;

        System.out.printf("Autonomia estimada vehiculo %.2f %n", autonomia);
        llegamos = autonomia > distancia;
        System.out.print("llegamos " + llegamos);


    }

}