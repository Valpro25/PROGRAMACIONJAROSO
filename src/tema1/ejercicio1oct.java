package tema1;

public class ejercicio1oct {
    public static void main(String[] args) {
        
        int precio = 125;
        boolean res = false;
        
        
        res = (precio > 100);
        IO.println(res);

        res = (precio >= 130);
        IO.println(res);

        res = (precio < 100);
        IO.println(res);

        res = (precio <= 125);
        IO.println(res);

        res = (precio != 126);
        IO.println(res);

    }
}