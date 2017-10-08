package pct.model;

import java.util.Date;

public class Concierto {

	private Long id;
	private Date fecha;
	private String nombre;
	private String lugar;
	private String posterHtml;
	
	public Concierto(){
	}
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id=id;
	}
	
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
		
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha){
		this.fecha = fecha;
	}
	
	public String getLugar() {
		return lugar;
	}
	
	public void setLugar(String lugar){
		this.lugar = lugar;
	}
	
	public String getPosterHtml() {
		return posterHtml;
	}
	
	public void setPosterHtml(String posterHtml){
		this.posterHtml = posterHtml;
	}
}
