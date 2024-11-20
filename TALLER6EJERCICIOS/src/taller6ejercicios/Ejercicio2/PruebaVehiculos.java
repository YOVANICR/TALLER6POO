/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6ejercicios.Ejercicio2;

/**
 *
 * @author yoven
 */
// Clase de prueba para verificar el comportamiento de los atributos protected
// Intentamos acceder directamente a los atributos protected desde una clase no relacionada.

public class PruebaVehiculos {
    public static void main(String[] args) {
        // Creamos una instancia de Moto
        Moto moto = new Moto("Deportiva", "Yamaha", 600);

        // Mostramos los detalles de la moto usando el método protegido sobrescrito
        moto.mostrarDetalles();

        // Intentamos acceder directamente a los atributos protected
        // Esto generará un error de compilación porque no estamos en una subclase ni en el mismo paquete
        // System.out.println(moto.tipo);  // Error: tipo tiene acceso protegido
        // System.out.println(moto.marca); // Error: marca tiene acceso protegido
    }
}
