public class ejercicioscasa3 {
    public static void main(String[] args) {
        
        double energia;
        double potencia;
        double horas;
        double rendimiento;
        double consumoDiario;
        boolean suficienteEnergia;

        potencia = 8.5;
        horas = 6.5;
        rendimiento = 0.82;
        consumoDiario = 40.0;

        energia = (potencia * horas * rendimiento);
        suficienteEnergia = (energia > consumoDiario);

        System.out.println("la energia generada es " + energia);
        System.out.println("¿La energia es suiciente? " + suficienteEnergia);


    }

}
