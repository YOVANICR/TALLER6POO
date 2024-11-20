/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6ejercicios.Ejercicio2;

/**
 *
 * @author yoven
 */
// Clase Vehiculo con atributos tipo y marca como protected
// Los atributos protected permiten que las subclases accedan directamente a ellos, pero no las clases no relacionadas.

public class Vehiculo {
    protected String tipo;   // Atributo protegido
    protected String marca;  // Atributo protegido

    // Constructor
    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    // Método protegido para mostrar los detalles del vehículo
    protected void mostrarDetalles() {
        System.out.println("Tipo: " + tipo + ", Marca: " + marca);
    }
}
