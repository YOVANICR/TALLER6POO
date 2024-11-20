/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6ejercicios.Ejercicio2;

/**
 *
 * @author yoven
 */
// Clase Moto que hereda de Vehiculo
// Incluye un atributo adicional (cilindrada) y sobrescribe el método mostrarDetalles.

public class Moto extends Vehiculo {
    private int cilindrada;  // Atributo adicional de Moto

    // Constructor
    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);  // Llama al constructor de la clase base
        this.cilindrada = cilindrada;
    }

    // Sobrescribimos el método mostrarDetalles para incluir la información de la moto
    @Override
    protected void mostrarDetalles() {
        super.mostrarDetalles();  // Llama al método de la clase base
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}
