package ar.org.centros8.java.curso.trabajo_practico_2.test;

import ar.org.centros8.java.curso.trabajo_practico_2.clases.concesionarias.EjecutadorDeConcesionaria;

public class TestTrabajoPractico {  
    public static void main(String[] args) {
        EjecutadorDeConcesionaria concesionaria1 = new EjecutadorDeConcesionaria();
        System.out.println("\nEjecutando Test de Concesionaria\n");
        concesionaria1.ejecutar();
    }
}
