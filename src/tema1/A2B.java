package tema1;

public class A2B {
    
    public static void main(String[] args) {
        

        
        String tipo = switch (dia) {
            case 1, 2, 3, 4, 5 -> "Laborable";
            case 6, 7 -> "Fin de semana";
            default -> "No válido";
        };
        
        System.out.println(tipo);

    }

}
