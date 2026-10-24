public class A1 {

    public static void main(String[] args) {
        
        int A = 6, B = 2,  C = 3;
        int a;
        int b;
        int c;
        int d;
        int e;

        a = (A * C) % C;
        b = A * B / C;
        c = C % B + C * B;
        d = A % (A * B * C / (B + C));
        e = B * B + C - B * (A % B);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d); //aqui estas inteentando dividir 6  entre 7 y ccomo no cabe el resto es el propio 6 por eso sale 6
        System.out.println(e);

    }

}
