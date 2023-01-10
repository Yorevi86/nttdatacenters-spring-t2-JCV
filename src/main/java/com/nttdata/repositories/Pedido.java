/**
 * 
 */
package com.nttdata.repositories;

import java.io.Serializable;
import java.util.List;

/**
 * Entity para Pedido
 * 
 * @author Jonatan Carrera Viera
 *
 */
public class Pedido implements Serializable {

	/** SERIAL VERSION */
	private static final long serialVersionUID = 1L;

	/** ID (PK) */
	private Long pedidoId;

	/** ID Destino */
	private Long destinoId;

	/** Direccion */
	private String direccion;

	/** Peninsular */
	private Boolean peninsular;

	/** Lista Productos */
	private List<Producto> listaProductos;

	/**
	 * Método constructor con parámetros
	 * 
	 * @param pedidoId
	 * @param destinoId
	 * @param direccion
	 * @param peninsular
	 * @param listaProductos
	 */
	public Pedido(Long pedidoId, Long destinoId, String direccion, Boolean peninsular, List<Producto> listaProductos) {
		super();
		this.pedidoId = pedidoId;
		this.destinoId = destinoId;
		this.direccion = direccion;
		this.peninsular = peninsular;
		this.listaProductos = listaProductos;
	}

	/**
	 * Método constructor sin parámetros
	 * 
	 */
	public Pedido() {
		super();
	}

	/**
	 * @return the pedidoId
	 */
	public Long getPedidoId() {
		return pedidoId;
	}

	/**
	 * @param pedidoId the pedidoId to set
	 */
	public void setPedidoId(Long pedidoId) {
		this.pedidoId = pedidoId;
	}

	/**
	 * @return the destinoId
	 */
	public Long getDestinoId() {
		return destinoId;
	}

	/**
	 * @param destinoId the destinoId to set
	 */
	public void setDestinoId(Long destinoId) {
		this.destinoId = destinoId;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the peninsular
	 */
	public Boolean getPeninsular() {
		return peninsular;
	}

	/**
	 * @param peninsular the peninsular to set
	 */
	public void setPeninsular(Boolean peninsular) {
		this.peninsular = peninsular;
	}

	/**
	 * @return the listaProductos
	 */
	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	/**
	 * @param listaProductos the listaProductos to set
	 */
	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	@Override
	public String toString() {
		return "Pedido [Id del pedido=" + pedidoId + "; Id del destino=" + destinoId + "; dirección=" + direccion
				+ "; es peninsular=" + peninsular + "]";
	}

}
