/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6ejercicios.Ejercicio3;

/**
 *
 * @author yoven
 */


// Clase Banco con una solución más segura para encapsular el saldo
public class BancoSeguro {
    private double saldo;  // El saldo ahora es privado

    // Constructor
    public BancoSeguro(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    // Método para consultar el saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Fondos insuficientes o cantidad no válida.");
        }
    }

    public static void main(String[] args) {
        BancoSeguro banco = new BancoSeguro(1000);
        banco.depositar(500);  // Deposita 500
        banco.retirar(300);  // Retira 300
        System.out.println("Saldo actual: " + banco.getSaldo());  // Muestra el saldo actual
    }
}
