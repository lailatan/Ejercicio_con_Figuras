package ada.java;

public class Cuadrado extends Figura{
    private Double lado;

    public Cuadrado(String color,Double lado) {
        super(color);
        this.lado=lado;
    }

    @Override
    public Double getPerimetro() {
        // P = 4*s  (s es la longitud del lado del cuadrado)
        return lado * 4;
    }

    @Override
    public Double getArea() {
        // A = s^2 (s es la longitud del lado del cuadrado)
        return lado * lado;
    }
}
