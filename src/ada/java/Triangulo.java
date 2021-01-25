package ada.java;

public class Triangulo extends Figura {
    private Double lado_1;
    private Double lado_2;
    private Double lado_3;

    public Triangulo(String color, Double lado1, Double lado2, Double lado3) {
        super(color);
        this.lado_1 = lado1;
        this.lado_2 = lado2;
        this.lado_3 = lado3;
    }

    @Override
    public Double getPerimetro() {
        // P = a + b + c   (a , b , y c son las longitudes de los lados)
        return lado_1 + lado_2 + lado_3;
    }

    @Override
    public Double getArea() {
        // A = raiz2( s*(s-a)*(s-b)*(s-c) )
        // (a , b , y c son las longitudes de los lados y s es el semiperímetro)
        // s = (a+b+c)/2
        Double s = (lado_1 + lado_2 + lado_3) / 2;
        Double A = Math.sqrt(s * (s - lado_1) * (s - lado_2) * (s - lado_3));
        return A;
    }
}
