/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6ejercicios.Ejercicio3;

/**
 *
 * @author yoven
 */
// Clase Banco con un atributo protegido (mala práctica)
public class Banco {
    protected double saldo;  // Mala práctica: el saldo no debería ser protegido

    // Constructor
    public Banco(double saldo) {
        this.saldo = saldo;
    }

    // Método para mostrar el saldo
    public void mostrarSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public static void main(String[] args) {
        Banco banco = new Banco(1000);
        banco.mostrarSaldo();  // Muestra el saldo, pero esto no es seguro si el saldo es protegido
    }
}
