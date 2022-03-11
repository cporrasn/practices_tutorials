package es.pildoras.pruebasHibernate;

import javax.persistence.*;

@Entity
@Table(name="clientes")
public class Cliente {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="Nombre")
	private String nombre;
	@Column(name="Apellidos")
	private String apellidos;
	@Column(name="Direccion")
	private String direccion;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private Detalles_Cliente detalles_cliente;
	
	public Cliente() {
	}
	public Cliente(String nombre, String apellidos, String direccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
	}
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion
				+ "]";
	}
	
	public Detalles_Cliente getDetalles_cliente() {
		return detalles_cliente;
	}
	public void setDetalles_cliente(Detalles_Cliente detalles_cliente) {
		this.detalles_cliente = detalles_cliente;
	}

}
