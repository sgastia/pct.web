package pct.model;

public class Video {

	private String link;
	private String nombre;
	private String comentarios;
	
	public Video(String link,String nombre){
		this.link = link;
		this.nombre = nombre;
	}
	
	public String getLink() {
		return link;
	}
	
	public String getNombre(){
		return nombre;
	}
	public String getComentarios() {
		return comentarios;
	}
	
	
	
}
