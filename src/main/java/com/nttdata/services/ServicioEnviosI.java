/**
 * 
 */
package com.nttdata.services;

import java.util.List;

import com.nttdata.repositories.Pedido;
import com.nttdata.repositories.Producto;

/**
 * Interfaz para el servicio de envíos
 * 
 * @author Jonatan Carrera Viera
 *
 */
public interface ServicioEnviosI {

	/**
	 * Método para actualizar el precio final (PVP) de los productos según si es
	 * peninsular o exterior
	 * 
	 * @param pedidoActualizado
	 * @param listaProductos
	 */
	public void incluirProductoAPedido(Pedido pedidoActualizado, List<Producto> listaProductos);
}
