package bo.edu.cursojava;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Circulo c;
	    Cuadrado cu;
	    Rectangulo r;
        int op=0, dato=0, altura=0;
        String linea;
        Scanner scanner = new Scanner(System.in);

        do {
            menu();
            linea = scanner.nextLine();
            op = Integer.parseInt(linea);
            switch (op) {
                case 0: {
                    System.out.println(" EXIT");
                    break;
                }
                case 1: {
                    System.out.print("base > ");
                    linea = scanner.nextLine();
                    dato = Integer.parseInt(linea);
                    System.out.print("altura > ");
                    linea = scanner.nextLine();
                    altura = Integer.parseInt(linea);
                    r = new Rectangulo(dato, altura);
                    //rectangulo1.mostrar();
                    System.out.println("Area: " + rectangulo1.obtenerArea());
                    System.out.println("Perimetro: " + rectangulo1.obtenerPerimetro());
                    break;
                }
                case 2: {
                    System.out.print("radio > ");
                    linea = scanner.nextLine();
                    radio = Integer.parseInt(linea);
                    circulo1 = new Circulo(radio);
                    System.out.println("Perimetro: " + circulo1.obtenerPerimetro());
                }
                case 3: {
                    System.out.print("lado > ");
                    linea = scanner.nextLine();
                    lado = Integer.parseInt(linea);
                    cuadrado = new Cuadrado(lado);
                    System.out.println("Perimetro: " + cuadrado.calcularArea());
                }
            }
        } while (op != 0);


    }

    public static void menu() {
        System.out.print("-------------\nFiguras Geometricas \n-------------\n" +
                "1 Rectangulos\n2 Circulos\n3 Cuadrado.....\nElige (0 para salir):");

    }

}
}
