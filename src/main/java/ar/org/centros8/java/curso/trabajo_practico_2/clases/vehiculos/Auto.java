package ar.org.centros8.java.curso.trabajo_practico_2.clases.vehiculos;

import lombok.Getter;

@Getter

public class Auto extends Vehiculo {

    private final int puertas;


    public Auto(String marca, String modelo, double precio, int puertas) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }



    /**
     * Devuelve la representación en texto del automóvil.
     * Formato: Marca: X // Modelo: X // Puertas: X // Precio: $X
     * Es llamado automáticamente por System.out.println().
     *
     * @return String con los datos del auto formateados
     */
    @Override
    public String toString() {

         return String.format(
            "Marca: %s // Modelo: %s // Puertas: %d // Precio: %s",
            getMarca(), getModelo(), puertas, getPrecioFormateado()
        );
    }
}
