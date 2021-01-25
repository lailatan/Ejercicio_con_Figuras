package ada.java;

public class Circulo extends Figura{
    private Double radio;

    public Circulo(String color,Double radio) {
        super(color);
        this.radio=radio;
    }

    @Override
    public Double getPerimetro() {
        // P = C = 2*π*r (r es el radio)
        return 2 * Math.PI * radio;
    }

    @Override
    public Double getArea() {
        // A = πr^2 (r es el radio)
        return Math.PI * radio * radio ;
    }
}
