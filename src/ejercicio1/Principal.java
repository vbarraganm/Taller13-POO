
package ejercicio1;

public class Principal {
    public static void main(String[] args) {
        // Creación de objetos
        Rectangulo rectangulo = new Rectangulo(3,6);
        Triangulo triangulo = new Triangulo(5, 4);
        
        // Mostrar el área
        System.out.println("Rectángulo:");
        rectangulo.mostrarArea();
        System.out.println("");
        System.out.println("Triángulo:");
        triangulo.mostrarArea();
    }
}
