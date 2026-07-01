package ar.org.centros8.java.curso.trabajo_practico_2.clases.vehiculos;

import java.util.Locale;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public abstract class Vehiculo implements Comparable<Vehiculo> {

    /**
     * Locale fijo para que el formato del precio ($200.000,00) sea siempre
     * el mismo sin importar el locale por defecto configurado en la
     * máquina donde corra la aplicación.
     */
    private static final Locale LOCALE_PRECIO = Locale.of("es", "AR");

    private String marca;
    private String modelo;
    private double precio;

    @Override
    public abstract String toString();

    /**
     * Formatea el precio con el estilo requerido por la consigna
     * (separador de miles con punto y decimales con coma), independiente
     * del locale por defecto de la JVM.
     *
     * @return el precio formateado, por ejemplo "$200.000,00"
     */
    public String getPrecioFormateado() {
        return String.format(LOCALE_PRECIO, "$%,.2f", precio);
    }

    /**
     * Define el orden natural de los vehículos.
     * Ordena primero por marca, luego por modelo y finalmente por precio.
     * 
     * @param otro -> es el vehiculo con el que se lo compara.
     * @return -> si this es negativo va antes, si es 0 son iguales, si es positivo va despues
     */
    @Override
    public int compareTo(Vehiculo otro) {
        int porMarca = this.marca.compareTo(otro.marca);
        if (porMarca != 0)
            return porMarca;

        int porModelo = this.modelo.compareTo(otro.modelo);
        if (porModelo != 0)
            return porModelo;

        return Double.compare(this.precio, otro.precio);
    }

}
