package ada.java;
/*
1 - ejercicio con figuras
        Crear un sistema que permita calcular el perímetro y área de una figura.
        Las figuras pueden ser cuadrados, triángulos o círculos.
        Todas las figuras tienen un color asignado, que puede consultarse.
        Nota: el valor de Pi pueden tomarlo como 3.14 o pueden usar la constante Math.PI
*/
public class Main {

    public static void main(String[] args) {
	// write your code here
        Cuadrado cuadrado = new Cuadrado("Azul",5.00);
        Circulo circulo = new Circulo("Blanco",10.00);
        Triangulo triangulo1 = new Triangulo("Rojo",12.00,16.16,16.16);
        Triangulo triangulo2 = new Triangulo("Rojo",20.00,31.62,31.62);

        System.out.print("Cuadrado ");
        cuadrado.mostrarDatos();

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.print("Circulo ");
        circulo.mostrarDatos();

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.print("Triangulo 1 ");
        triangulo1.mostrarDatos();

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.print("Triangulo 2 ");
        triangulo2.mostrarDatos();
    }
}
