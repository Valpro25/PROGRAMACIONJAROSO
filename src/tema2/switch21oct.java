package tema2;

public class switch21oct {
    
    public static void main(String[] args) {
        
        int dado;

        dado = (int) (Math.random() * (20 - 1 + 1)) + 1;

        switch (dado) {

            case 1 -> IO.println("opcion del caso 1");
            case 2,3,4,5 -> IO.println("opcion del caso del 2 al 5");
            case 6,7,8,9,10 -> IO.println("opcion del caso del 6 al 10");
            case 11,12,13,14,15 -> IO.println("opcion del caso del 11 al 15");
            case 16,17,18,19 -> IO.readln("opcion del caso del 16 al 19");
            case 20 -> IO.println("opcion del caso 20");
            default -> IO.println("error");

        }

    }

}
