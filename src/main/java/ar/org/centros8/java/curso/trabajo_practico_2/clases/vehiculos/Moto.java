package ar.org.centros8.java.curso.trabajo_practico_2.clases.vehiculos;

import lombok.Getter;

@Getter

public class Moto extends Vehiculo {

    private final int cilindrada;

    public Moto(String marca, String modelo, double precio, int cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }


    /**
     * Devuelve la representación en texto de la motocicleta.
     * Formato: Marca: X // Modelo: X // Cilindrada: Xc // Precio: $X
     * Es llamado automáticamente por System.out.println().
     *
     * @return String con los datos de la moto formateados
     */
    @Override
    public String toString() {
        return String.format(
                "Marca: %s // Modelo: %s // Cilindrada: %dc // Precio: %s",
                getMarca(), getModelo(), cilindrada, getPrecioFormateado());
    }

}
