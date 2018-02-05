package bo.edu.cursojava;

public class Circulo extends Figura {

    public Circulo(int dato) {
        super(dato);
    }

    public double calcularArea() {
        double resul;
        return resul = (Math.PI * (Math.pow(dato, 2)));
    }
}
