public class A5 {
    
    public static void main(String[] args) {
        
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        boolean boleano;

        a = 1;
        boleano = (a > 2);
        System.out.println("a vale " + boleano);
        b =  40;
        boleano = (b >= 25 && b > 5);
        System.out.println("b vale " + boleano);
        d = 5;
        c = 5;
        boleano = (c > 6 || c == d);
        System.out.println("c vale " + boleano);
        e = 2;
        boleano = (e % 2 == 0  && e < 50);
        System.out.println("e vale " + boleano);
        f = 50;
        boleano = (f > a && f > b && f > c);
        System.out.println("f vale " + boleano);
        g = 777;
        boleano = (g == 3 || g == 4 || g == 5);
        System.out.println("g vale " + boleano);




    }

}
