/**
 * 
 */
package com.nttdata.services;

import java.util.List;

import com.nttdata.repositories.Pedido;
import com.nttdata.repositories.Producto;

/**
 * Implementación del servicio de gestión de envíos
 * 
 * @author Jonatan Carrera Viera
 *
 */
public class ServicioGestionEnviosGenericoImpl implements ServicioGestionEnviosGenericoI {

	@Override
	public Pedido crearPedido(Long pedidoId, Long destinoId, String direccion, Boolean peninsular) {

		final Pedido pedido = new Pedido();
		pedido.setPedidoId(pedidoId);
		pedido.setDestinoId(destinoId);
		pedido.setDireccion(direccion);
		pedido.setPeninsular(peninsular);

		return pedido;
	}

	@Override
	public void detallesPedido(Pedido pedido) {

		final String detallesPedido;
		detallesPedido = pedido.toString();
		System.out.println("\nDetalles del pedido:");
		System.out.println("-------------------------");
		System.out.println(detallesPedido + "\n");

	}

	@Override
	public void calcularPrecio(Pedido pedido) {

		Double precioFinal = 0.0;
		List<Producto> listaProducto = pedido.getListaProductos();

		for (Producto producto : listaProducto) {
			precioFinal += producto.getPvp();
		}

		System.out.println("El precio total del envío " + pedido.getPedidoId() + " es: " + precioFinal + " euros.");

	}

}
