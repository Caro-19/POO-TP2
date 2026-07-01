package ar.org.centros8.java.curso.trabajo_practico_2.clases.concesionarias;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


import ar.org.centros8.java.curso.trabajo_practico_2.clases.vehiculos.Vehiculo;
import ar.org.centros8.java.curso.trabajo_practico_2.interfaces.IGestionDeVehiculos;
import lombok.Getter;

@Getter


public class Concesionaria implements IGestionDeVehiculos {

    private List<Vehiculo> vehiculos;

    public Concesionaria() {
        this.vehiculos = new ArrayList<>();
    }

    /**
     * Carga vehículos en la concesionaria, agregándolos a la lista existente.
     * Recibe los vehículos como varargs, permitiendo agregar
     * cualquier cantidad de vehículos sin modificar este método.
     *
     * @param vehiculos vehículos a cargar en la concesionaria
     */
    public void cargarVehiculos(Vehiculo... vehiculos) {
        this.vehiculos.addAll(List.of(vehiculos));
    }

    /**
     * Busca el/los vehículo(s) con mayor precio en la concesionaria,
     * utilizando Stream para obtener el precio máximo y luego filtrar
     * todos los vehículos que lo tengan (contempla empates).
     *
     * @return una lista con el/los vehículo(s) más caro(s), o una lista
     *         vacía si no hay vehículos cargados.
     */
    @Override
    public List<Vehiculo> precioMasCaro() {
        double precioMax = vehiculos.stream().mapToDouble(Vehiculo::getPrecio).max().orElse(Double.NaN);

        return vehiculos.stream().filter(v -> v.getPrecio() == precioMax).toList();
    }

    /**
     * Busca el/los vehículo(s) con menor precio en la concesionaria,
     * utilizando Stream para obtener el precio mínimo y luego filtrar
     * todos los vehículos que lo tengan (contempla empates).
     *
     * @return una lista con el/los vehículo(s) más barato(s), o una lista
     *         vacía si no hay vehículos cargados
     */
    @Override
    public List<Vehiculo> precioMasBarato() {
        double precioMin = vehiculos.stream().mapToDouble(Vehiculo::getPrecio).min().orElse(Double.NaN);

        return vehiculos.stream().filter(v -> v.getPrecio() == precioMin).toList();
    }

    /**
     * Busca los vehículos cuyo modelo contenga la letra indicada.
     *
     * @param letra la letra a buscar dentro del modelo
     * @return una lista de Vehiculos cuyo modelo contiene la letra, o una lista
     *         vacía si no hay
     *         ninguno
     */
    @Override
    public List<Vehiculo> buscarPorLetra(String letra) {
        return vehiculos.stream()
                .filter(v -> v.getModelo().toLowerCase().contains(letra.toLowerCase()))
                .toList();
    }

    /**
     * Ordena los vehículos de mayor a menor precio.
     * No modifica la lista original, devuelve una nueva lista ordenada.
     *
     * @return nueva List ordenada de mayor a menor precio
     */
    @Override
    public List<Vehiculo> ordenarDeMayorAMenor() {
        return vehiculos.stream()
                .sorted(Comparator.comparingDouble(Vehiculo::getPrecio).reversed())
                .toList();
    }

    /**
     * Ordena los vehículos por orden natural: marca, luego modelo, luego precio.
     * Utiliza el método compareTo() definido en la clase Vehiculo.
     * No modifica la lista original, devuelve una nueva lista ordenada.
     *
     * @return nueva List ordenada por marca, modelo y precio
     */
    @Override
    public List<Vehiculo> ordenNatural() {
        return vehiculos.stream().sorted().toList();
    }
}
