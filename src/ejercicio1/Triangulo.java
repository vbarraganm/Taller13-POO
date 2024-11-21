
package ejercicio1;

public class Triangulo extends Figura {
    // Propiedades
    private double base;
    private double altura;
    
    // Constructor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    // Método abstracto sobreescrito
    @Override
    public double calcularArea() {
        return 0.5 * base * altura;
    }
}
