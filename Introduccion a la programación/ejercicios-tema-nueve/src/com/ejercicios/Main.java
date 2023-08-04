package com.ejercicios;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 25;
        cliente.nombre = "Alberto";
        cliente.telefono = 87654321;
        cliente.credito = 200;

        System.out.println("Nombre del cliente: " + cliente.nombre);
        System.out.println("Edad: " + cliente.edad + " años.");
        System.out.println("Teléfono: " + cliente.telefono);
        System.out.println("Su crédito es de " + cliente.credito + " pesos.");

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 30;
        trabajador.nombre = "Juan";
        trabajador.telefono = 12345678;
        trabajador.salario = 1500;

        System.out.println("Nombre del trabajador: " + trabajador.nombre);
        System.out.println("Edad: " + trabajador.edad + " años.");
        System.out.println("Teléfono: " + trabajador.telefono);
        System.out.println("Su salario es de " + trabajador.salario + " pesos.");
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}