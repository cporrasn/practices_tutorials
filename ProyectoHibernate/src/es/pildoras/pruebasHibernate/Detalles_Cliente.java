package es.pildoras.pruebasHibernate;

import javax.persistence.*;

@Entity
@Table(name="detalles_cliente")
public class Detalles_Cliente {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="web")
	private String web;
	@Column(name="tfno")
	private String telefono;
	@Column(name="comentarios")
	private String comentarios;

	
	public Detalles_Cliente() {
	}
	public Detalles_Cliente(String web, String telefono, String comentarios) {
		this.web = web;
		this.telefono = telefono;
		this.comentarios = comentarios;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Detalles_Cliente [id=" + id + ", web=" + web + ", telefono=" + telefono + ", comentarios=" + comentarios
				+ "]";
	}
	
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	

	
	

}