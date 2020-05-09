package com.nfsm.springboot.web.app.models;

public class Articulos {

	private String descripcion;
	private String marca;
	private String precio;
	private String cantidad;
	private String proveedor;
	
	
	
	public Articulos(String descripcion, String marca, String precio, String cantidad, String proveedor) {
		super();
		this.descripcion = descripcion;
		this.marca = marca;
		this.precio = precio;
		this.cantidad = cantidad;
		this.proveedor = proveedor;
	}
	
	
	
	public Articulos() {
		
	}



	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	


}
