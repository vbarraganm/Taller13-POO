
package ejercicio2;

public class Pato implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("El pato vuelva.");
    }
    
    @Override
    public void nadar() {
        System.out.println("El pato nada.");
    }
}
