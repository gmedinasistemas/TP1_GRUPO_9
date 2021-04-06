package entity;

import java.util.Date;

import dao.IGenerosDAO;

public abstract class Eventos  {

	private int idEvento;
	private String titulo;
	private String tipoEvento;
	private double precio;
	private Date fecha;// #German: esto lo agrego para reemplazar los int de dia,mes y a�o
	private int duracion;
	private int idEntrada;
	private static int contEntrada = 0;

	// CONSTRUCTORES

	public Eventos() {
		this.idEntrada = ++contEntrada;
	}

	public Eventos(int idevento, String titulo, String tipoevento, Date fecha, int duracion, String tipoEntrada, int valor) {
		this.idEvento = idevento;
		this.titulo = titulo;
		this.tipoEvento = tipoevento;
		this.fecha = fecha;
		this.duracion = duracion;
		this.idEntrada = ++contEntrada;
		
	}

	// METODOS

	public int getidEntrada() {
		return idEntrada;
	}
	
	public int getDuracion() {
		return duracion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	
	 public double getPrecio() {
	 return precio;
	 }
	
	 public void setPrecio(double precio) {
	 this.precio = precio;
	 }

	public int getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(int idevento) {
		this.idEvento = idevento;
	}

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoevento) {
		this.tipoEvento = tipoevento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Evento [idEvento=" + idEvento + ", titulo=" + titulo + ", tipoEvento=" + tipoEvento + ", fecha=" + fecha
				+ ", duracion=" + duracion + "]";
	}
	
	// metodo para que cada tipo de evento pueda aplicar distintos descuentos en base 
	// a la cantidad de invitados y a la empresa que lo contrata
	public abstract double bonificaCorporativo(int cantInvitados, String Empresa);

}
