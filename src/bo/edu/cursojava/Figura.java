package bo.edu.cursojava;

abstract public class Figura {
    protected  int dato;

    public  Figura(int dato){
        this.dato=dato;
    }

    abstract public double calcularArea();
}
