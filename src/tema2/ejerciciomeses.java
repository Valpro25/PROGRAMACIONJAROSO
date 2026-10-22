package tema2;

public class ejerciciomeses {
    
    public static void main(String[] args) {
        /*
        
        Pide por teclado un dia del mes (1-31) y un numero del mes (1-12) y dime si la fecha es correcta
        
        */

        int DiaMes;
        int Mes;
        String TecladoDiaMes;
        String TecladoMes;

        DiaMes =Integer.parseInt(IO.readln("Dime el dia del mes "));
        Mes = Integer.parseInt( IO.readln("Dime el numero del mes "));

        if (Mes == 1 || Mes == 3 || Mes == 5 || Mes == 7 || Mes == 8 || Mes == 10 || Mes == 12) {

            if (DiaMes >= 1 && DiaMes <= 31){

                IO.println("La fecha es " + DiaMes + "/" + Mes);

            } else {

                IO.println("Dia del mes incorrecto");

            }

        } else {

            if (DiaMes >= 1 && DiaMes <= 30){

                IO.println("La fecha es " + DiaMes + "/" + Mes);

            } else {

                IO.println("Dia del mes incorrecto");

            }

        }

    }

}
