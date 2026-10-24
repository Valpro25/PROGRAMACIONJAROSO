void main() {
    double radio;
    double superficie;
    double perimetro;

    radio = 25;
    IO.println("el radio " + radio);

    superficie = Math.PI * radio * radio;
    perimetro = 2 * Math.PI * radio;

    IO.println("la superficie es:" + superficie);
    IO.println("El perimetro es:" + perimetro);
}