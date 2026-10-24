public class A4 {
    
    public static void main(String[] args) {
        
        int x = 10, y = 3;
        int d = x + y++; 
        System.out.println(d);
        System.out.println(y); //aqui la y ya vale 4

        int v = x + ++y; //daria 15 por que la y ya  vale 4
        System.out.println(v);
        System.out.println(y);

        int j = 34, b = 34;
        int c = (++j + ++b);
        System.out.println("esto vale c " + c);

        int t = 34, l = 34;
        int g = (t++ + l++);
        System.out.println("esto vale g " + g);

    }

}
