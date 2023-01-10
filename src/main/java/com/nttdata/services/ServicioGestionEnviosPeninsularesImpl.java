/**
 * 
 */
package com.nttdata.services;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.nttdata.repositories.Pedido;
import com.nttdata.repositories.Producto;

/**
 * Implementación del servicio de gestión de envíos a península y Baleares
 * 
 * @author Jonatan Carrera Viera
 *
 */

@Service("servicioPeninsular")
@Primary
public class ServicioGestionEnviosPeninsularesImpl extends ServicioGestionEnviosGenericoImpl
		implements ServicioEnviosI {

	@Override
	public void incluirProductoAPedido(Pedido pedidoActualizado, List<Producto> listaProductos) {

		Double precio;

		for (Producto producto : listaProductos) {
			precio = producto.getPrecio() * 1.21;
			producto.setPvp(precio);
		}

		pedidoActualizado.setListaProductos(listaProductos);

	}

}
