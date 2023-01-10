package com.nttdata;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.repositories.Pedido;
import com.nttdata.repositories.Producto;
import com.nttdata.services.ServicioEnviosI;
import com.nttdata.services.ServicioGestionEnviosGenericoI;

@SpringBootApplication
public class Main implements CommandLineRunner {

	/** Servicio: Envío */
	@Autowired
	private ServicioGestionEnviosGenericoI generico;
	/** Servicio: Peninsular */
	@Autowired
	@Qualifier("servicioPeninsular")
	private ServicioEnviosI envioPeninsular;
	/** Servicio: Exterior de península y Baleares */
	@Autowired
	@Qualifier("ServicioExterior")
	private ServicioEnviosI envioExterior;

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		/** Creación de productos */
		Producto pr1 = new Producto(1L, "Monitor", 130d);
		Producto pr2 = new Producto(2L, "Teclado", 90d);
		Producto pr3 = new Producto(3L, "Ratón", 60d);
		Producto pr4 = new Producto(4L, "Cascos Gaming", 80d);
		Producto pr5 = new Producto(5L, "Torre Gaming", 1150d);

		/** Creación de las listas con productos */
		List<Producto> lista1 = new ArrayList<>();
		List<Producto> lista2 = new ArrayList<>();

		lista1.add(pr2);
		lista1.add(pr3);
		lista1.add(pr4);

		lista2.add(pr1);
		lista2.add(pr5);

		/** Creación de envios */
		Pedido pedido1;
		Pedido pedido2;

		pedido1 = generico.crearPedido(1L, 1L, "c/ Inventazo Nº1, Sevilla", true);
		pedido2 = generico.crearPedido(2L, 2L, "c/ Genialidad Nº1, La Palma", false);

		/** Añadir productos a la lista del pedido */
		if (Boolean.TRUE.equals(pedido1.getPeninsular())) {

			envioPeninsular.incluirProductoAPedido(pedido1, lista1);
		} else {
			
			envioExterior.incluirProductoAPedido(pedido1, lista1);
		}

		if (Boolean.TRUE.equals(pedido2.getPeninsular())) {
			
			envioPeninsular.incluirProductoAPedido(pedido2, lista2);
		} else {
			
			envioExterior.incluirProductoAPedido(pedido2, lista2);
		}

		/** Detalles de los pedidos */
		generico.detallesPedido(pedido1);
		generico.detallesPedido(pedido2);

		/** Visualización de los precios totales de los pedidos */
		generico.calcularPrecio(pedido1);
		generico.calcularPrecio(pedido2);

	}
}
