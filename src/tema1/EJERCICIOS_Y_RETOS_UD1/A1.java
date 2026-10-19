package tema1.EJERCICIOS_Y_RETOS_UD1;

public class A1 {
    
    public static void main(String[] args) {
        
        int A = 6, B = 2, C = 3;
        int a,b,c,d,e;

        a = (A * C) % C;
        b = A * B / C;
        c = C % B + C * B;
        d = A % (A * B * C / (B + C)); //coo la division de 6 entre 7 no se puede hacer nos devuelve el mismo numero que estamos dividiento
        e = B * B + C - B * (A % B);


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }

}
