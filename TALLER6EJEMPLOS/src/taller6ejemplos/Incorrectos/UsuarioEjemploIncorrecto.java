/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6ejemplos.Incorrectos;

/**
 *
 * @author yoven
 */
// Ejemplo Incorrecto: Uso inadecuado de protected en datos sensibles
// Este ejemplo muestra una mala práctica al usar protected para un dato sensible como una contraseña.

public class UsuarioEjemploIncorrecto {
    protected String contrasena;  // Mala práctica: la contraseña no debería ser accesible directamente

    // Constructor
    public UsuarioEjemploIncorrecto(String contrasena) {
        this.contrasena = contrasena;
    }

    // Método para mostrar información del usuario
    public void mostrarContrasena() {
        System.out.println("Contraseña: " + contrasena);
    }

    public static void main(String[] args) {
        UsuarioEjemploIncorrecto usuario = new UsuarioEjemploIncorrecto("1234");
        usuario.mostrarContrasena();  // Muestra la contraseña, lo cual no es seguro
    }
}
