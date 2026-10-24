package tema2;

public class enum21oct2 {
    
    public static void main(String[] args) {
        
        enum DiasSemana{

            LUNES,
            MARTES,
            MIERCOLES,
            JUEVES,
            VIERNES,
            SABADO,
            DOMINGO

        }

        DiasSemana diasSemana; //le damos nombre a la carpeta
        diasSemana = DiasSemana.valueOf(IO.readln("dime un dia de la semana ").toUpperCase());
        //Busca dentro de la carpeta diasSemana un valorDe el readln (lo que se meta por teclado) .toUpperCase y conviertemelo a mayuscula para que coincida con alguna de las opciones
        switch(diasSemana){ //RECUERDA el switch siempre se hace con el nombre que se le da a la carpeta

            case LUNES -> IO.println("Hoy es lunes");
            case MARTES -> IO.println("Hoy es martes");
            case MIERCOLES -> IO.println("Hoy es miercoles");
            case JUEVES -> IO.println("Hoy es jueves");
            case DiasSemana.VIERNES -> IO.println("Hoy es viernes");
            case DiasSemana.SABADO -> IO.println("Hoy es fin de semana");
            case DiasSemana.DOMINGO -> IO.println("Hoy tambien es fin de semana");
        }

    }

}
