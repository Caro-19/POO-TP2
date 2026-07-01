package ar.org.centros8.java.curso.trabajo_practico_2.clases.concesionarias;

import java.util.List;

import ar.org.centros8.java.curso.trabajo_practico_2.clases.vehiculos.Auto;
import ar.org.centros8.java.curso.trabajo_practico_2.clases.vehiculos.Moto;
import ar.org.centros8.java.curso.trabajo_practico_2.clases.vehiculos.Vehiculo;

public class EjecutadorDeConcesionaria {

    public void ejecutar() {

        Concesionaria concesionaria = new Concesionaria();
        concesionaria.cargarVehiculos(vehiculosDeEjemplo());

        // Lista inicial de vehículos
        concesionaria.getVehiculos().forEach(System.out::println);
        separador();

        // Búsquedas
        List<Vehiculo> masCaro = concesionaria.masCaro();
        masCaro.forEach(v -> System.out.println("Vehículo más caro: " + v.getMarca() + " " + v.getModelo()));

        List<Vehiculo> masBaratos = concesionaria.masBarato();
        masBaratos.forEach(v -> System.out.println("Vehículo más barato: " + v.getMarca() + " " + v.getModelo()));

        List<Vehiculo> conY = concesionaria.buscarPorLetra("Y");
        conY.forEach(v -> System.out.println("Vehículo que contiene en el modelo la letra 'Y': "
                + v.getMarca() + " " + v.getModelo() + " " + v.getPrecioFormateado()));
        separador();

        // Ordenado por precio de mayor a menor
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        concesionaria.ordenarDeMayorAMenor()
                .forEach(v -> System.out.println(v.getMarca() + " " + v.getModelo()));
        separador();

        // Orden natural completo con toString()
        System.out.println("Vehículos ordenados por orden natural (marca, modelo, precio):");
        concesionaria.ordenNatural().forEach(System.out::println);
    }

    /**
     * Define los vehículos de ejemplo requeridos por la consigna.
     *
     * @return array de vehículos de ejemplo
     */
    private Vehiculo[] vehiculosDeEjemplo() {
        return new Vehiculo[] {
                new Auto("Peugeot", "206", 200000.00, 4),
                new Moto("Honda", "Titan", 60000.00, 125),
                new Auto("Peugeot", "208", 250000.00, 5),
                new Moto("Yamaha", "YBR", 80500.50, 160)
        };
    };

    /**
     * Este metodo sirve para generar el separador que se encuentra en la consigna.
     */
    private void separador() {
        System.out.println("=============================");
    }

}
