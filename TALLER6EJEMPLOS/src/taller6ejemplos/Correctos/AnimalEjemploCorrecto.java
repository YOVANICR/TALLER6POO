/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6ejemplos.Correctos;

/**
 *
 * @author yoven
 * 
 * 
 * Ejemplo Correcto 2: Métodos protected que pueden ser Sobrescritos
 * 
 */
// Ejemplo Correcto: Métodos protected que pueden ser sobrescritos
// Este ejemplo muestra cómo un método protected en una clase base puede ser sobrescrito por una subclase.

public class AnimalEjemploCorrecto {
    protected String especie;  // Atributo protegido

    // Constructor
    public AnimalEjemploCorrecto(String especie) {
        this.especie = especie;
    }

    // Método protegido para emitir un sonido
    protected void emitirSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

class PerroEjemploCorrecto extends AnimalEjemploCorrecto {

    // Constructor
    public PerroEjemploCorrecto(String especie) {
        super(especie);  // Llama al constructor de la clase base
    }

    // Sobrescribe el método emitirSonido
    @Override
    protected void emitirSonido() {
        System.out.println("El perro ladra.");
    }

    public static void main(String[] args) {
        PerroEjemploCorrecto perro = new PerroEjemploCorrecto("Perro");
        perro.emitirSonido();  // Muestra el sonido personalizado del perro
    }
}
