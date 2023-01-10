/**
 * 
 */
package com.nttdata.services;

import com.nttdata.repositories.Pedido;

/**
 * Interfaz para el servicio de gestión de envíos
 * 
 * @author Jonatan Carrera Viera
 *
 */
public interface ServicioGestionEnviosGenericoI {

	/**
	 * Método para la creación de un pedido
	 * 
	 * @param pedidoId
	 * @param destinoId
	 * @param direccion
	 * @param peninsular
	 * @return
	 */
	public Pedido crearPedido(Long pedidoId, Long destinoId, String direccion, Boolean peninsular);

	/**
	 * Método para el desglose del pedido
	 * 
	 * @param pedido
	 */
	public void detallesPedido(Pedido pedido);

	/**
	 * Método para calcular el precio total del pedido
	 * 
	 * @param pedido
	 */
	public void calcularPrecio(Pedido pedido);
}
