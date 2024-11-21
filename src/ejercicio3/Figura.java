
package ejercicio3;

public abstract class Figura {
    // Método abstracto
    public abstract double calcularArea();
    
    // Intento de método predeterminado o default
    public default void imprimitFigura() {
        System.out.println("Imprimiendo figura.");
    }
}
