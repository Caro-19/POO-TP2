package ar.org.centros8.java.curso.trabajo_practico_2;

// import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.Bean;

// import ar.org.centros8.java.curso.trabajo_practico_2.clases.concesionarias.EjecutadorDeConcesionaria;

@SpringBootApplication
public class TrabajoPractico2Application {

	public static void main(String[] args) {
		SpringApplication.run(TrabajoPractico2Application.class, args);
	}

	// /**
	//  * Dispara la lógica de la concesionaria apenas el contexto de Spring
	//  * termina de levantar. Es el único punto de entrada de la aplicación:
	//  * antes existía una segunda clase "main" (en el paquete "test") que
	//  * hacía esto mismo por fuera del ciclo de vida de Spring, lo cual
	//  * generaba dos candidatas a clase principal para el plugin de Maven.
	//  */
	// @Bean
	// CommandLineRunner ejecutarConcesionaria() {
	// 	return args -> new EjecutadorDeConcesionaria().ejecutar();
	// }

}
