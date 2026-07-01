package ar.org.centros8.java.curso.trabajo_practico_2.interfaces;

import java.util.List;

import ar.org.centros8.java.curso.trabajo_practico_2.clases.vehiculos.Vehiculo;

public interface IGestionDeVehiculos {

    List<Vehiculo> precioMasCaro();
    List<Vehiculo> precioMasBarato();
    List<Vehiculo> buscarPorLetra(String letra);

    List<Vehiculo> ordenarDeMayorAMenor();
    List<Vehiculo> ordenNatural();


}
