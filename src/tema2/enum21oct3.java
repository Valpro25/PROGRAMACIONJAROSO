package tema2;

public class enum21oct3 {
    
    public static void main(String[] args) {
        
        enum Meses{

            ENERO,
            FEBRERO,
            MARZO,
            ABRIL,
            MAYO,
            JUNIO,
            JULIO,
            AGOSTO,
            SEPTIEMBRE,
            OCTUBRE,
            NOVIEMBRE,
            DICIEMBRE

        }

        Meses MesesDelAnio;
        MesesDelAnio = Meses.valueOf(IO.readln("ESCRIBE UN MES DEL AÑO ").toUpperCase());
        //la variable = lo verde.valueOf(IO.readln("el mensaje")).toUpperCase() al final recuerda
        switch(MesesDelAnio){

            case Meses.ENERO -> IO.println("Estamos en enero");
            case Meses.FEBRERO -> IO.println("Estamos en febrero");
            case Meses.MARZO -> IO.println("Estamos en marzo");


        }

    }

}
