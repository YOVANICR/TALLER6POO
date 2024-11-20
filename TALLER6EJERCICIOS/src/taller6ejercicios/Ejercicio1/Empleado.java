/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6ejercicios.Ejercicio1;

/**
 *
 * @author yoven
 * 
 * Ejercicio 1: Clase Empleado y Clase Gerente
 */


public class Empleado {
    protected String nombre;  
    protected double salario;  

  
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Método para mostrar la información del empleado
    protected void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario);
    }
}

class Gerente extends Empleado {
    private String departamento;  // Atributo privado adicional de la clase Gerente

    // Constructor
    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);  // Llama al constructor de la clase base
        this.departamento = departamento;
    }

    // Sobrescribimos el método mostrarInformacion
    @Override
    protected void mostrarInformacion() {
        super.mostrarInformacion();  // Llama al método de la clase base
        System.out.println("Departamento: " + departamento);
    }

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos", 5000, "Ventas");
        gerente.mostrarInformacion();  // Muestra la información completa del gerente
    }
}
