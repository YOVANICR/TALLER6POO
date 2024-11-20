/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6ejemplos.Incorrectos;

/**
 *
 * @author yoven
 */
// Ejemplo Incorrecto: Intentar acceder a un miembro protected desde una clase no relacionada
// Este ejemplo muestra que un atributo protected no puede ser accedido desde una clase no relacionada fuera del paquete.



/* inicio

package paquete1;  // Paquete 1

public class PersonaEjemploIncorrecto {
    protected String nombre;  // Atributo protegido

    // Constructor
    public PersonaEjemploIncorrecto(String nombre) {
        this.nombre = nombre;
    }
}

// Paquete 2
package paquete2;

import paquete1.PersonaEjemploIncorrecto;

public class MainEjemploIncorrecto {
    public static void main(String[] args) {
        PersonaEjemploIncorrecto persona = new PersonaEjemploIncorrecto("Juan");

        // Intentar acceder a un atributo protected desde una clase no relacionada
        System.out.println(persona.nombre);  // Error de compilacion
    }
}


*/