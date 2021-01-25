package ada.java;

public abstract class Figura {
        private String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract Double getPerimetro();

    public abstract Double getArea();

    public void mostrarDatos(){
        System.out.println("Color: " + color);
        System.out.println("Perimetro: " + getPerimetro());
        System.out.println("Area: " + getArea());
    }
}
