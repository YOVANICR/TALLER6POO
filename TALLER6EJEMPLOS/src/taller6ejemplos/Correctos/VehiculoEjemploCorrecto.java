/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6ejemplos.Correctos;

/**
 *
 * @author yoven
 * 
 * Ejemplo Correcto 1: Atributos protected en una Clase Base
 * 
 */
// Ejemplo Correcto: Atributos protected en una clase base
// Aquí vamos a usar el modificador protected en los atributos de una clase llamada Vehiculo.
// La subclase Coche puede acceder a estos atributos directamente gracias al modificador protected.

public class VehiculoEjemploCorrecto {
    protected String marca;      // Atributo protegido
    protected double velocidad;  // Atributo protegido

    // Constructor
    public VehiculoEjemploCorrecto(String marca, double velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    // Método protegido para mostrar los detalles del vehículo
    protected void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Velocidad: " + velocidad + " km/h");
    }
}

class CocheEjemploCorrecto extends VehiculoEjemploCorrecto {
    private int puertas;  // Atributo privado de la subclase

    // Constructor
    public CocheEjemploCorrecto(String marca, double velocidad, int puertas) {
        super(marca, velocidad);  // Llama al constructor de la clase base
        this.puertas = puertas;
    }

    // Método para mostrar la información completa del coche
    public void mostrarInformacion() {
        mostrarDetalles();  // Llama al método protegido de la clase base
        System.out.println("Numero de puertas: " + puertas);
    }

    public static void main(String[] args) {
        CocheEjemploCorrecto coche = new CocheEjemploCorrecto("Toyota", 120.5, 4);
        coche.mostrarInformacion();  // Muestra la informacion del coche
    }
}
