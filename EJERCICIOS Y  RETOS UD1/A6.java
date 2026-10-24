public class A6 {
    
    public static void main(String[] args) {
        
        System.out.println((3 <= 7) && (7 <= 7));
        System.out.println(!((-8 > 1) && (3 <= 4)));
        System.out.println(((2 <= 5) && (3 >= 6)) || (2 > -1));
        System.out.println(((2 <= 5) || (3 >= 6)) && (2 > -1));

        System.out.println("----- SEPARACION -----");

        String s1 = "Hola", s2 = "Hola", s3 = "Hola ";
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        String s4 = new String("Hola");
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));  //equals compara el contenido del objeto

        int z = 0;
        System.out.println((z != 0) && (10 / z > 1));  //aqui solo se evalua hasta la primera condicion por que el programa ya ve que es falso




    }

}
