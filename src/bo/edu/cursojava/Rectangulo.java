package bo.edu.cursojava;

public class Rectangulo extends Figura{
    private  int altura;

    public  Rectangulo (int dato){
        super(dato);
        this.altura=altura;
    }

    public double calcularArea(){
        int area;
        area = dato * altura;
        return area;
    }
}
