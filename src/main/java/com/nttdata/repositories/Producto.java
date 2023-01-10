/**
 * 
 */
package com.nttdata.repositories;

import java.io.Serializable;

/**
 * Entity para Producto
 * 
 * @author Jonatan Carrera Viera
 *
 */
public class Producto implements Serializable {

	/** SERIAL VERSION */
	private static final long serialVersionUID = 1L;

	/** ID (PK) */
	private Long productoId;

	/** Nombre producto */
	private String nombre;

	/** PVP */
	private Double pvp;

	/** Precio */
	private Double precio;

	/**
	 * Método constructor con parámetros
	 * 
	 * @param productoId
	 * @param nombre
	 * @param pvp
	 * @param precio
	 */
	public Producto(Long productoId, String nombre, Double precio) {
		super();
		this.productoId = productoId;
		this.nombre = nombre;
		this.precio = precio;
	}

	/**
	 * Método ocnstructor sin parámetros
	 */
	public Producto() {
		super();
	}

	/**
	 * @return the productoId
	 */
	public Long getProductoId() {
		return productoId;
	}

	/**
	 * @param productoId the productoId to set
	 */
	public void setProductoId(Long productoId) {
		this.productoId = productoId;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the pvp
	 */
	public Double getPvp() {
		return pvp;
	}

	/**
	 * @param pvp the pvp to set
	 */
	public void setPvp(Double pvp) {
		this.pvp = pvp;
	}

	/**
	 * @return the precio
	 */
	public Double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [Id del producto=" + productoId + "; nombre=" + nombre + "; pvp=" + pvp + "; precio=" + precio
				+ "]";
	}

}
