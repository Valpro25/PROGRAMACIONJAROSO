package tema1;

class ejercicioclase7oct3 {

    public static void main(String[] args) {
        
    /*
        Tienes dos variables numeroA y numeroB, y debes intercambiar sus valores
    */
        int temp;
        int numeroA = 2;
        int numeroB = 8;

        temp = numeroA;
        numeroA = numeroB;
        numeroB = temp;


        IO.println("NumeroA vale " + numeroA + " NumeroB vale " + numeroB);

    }
    
}