package pct.model;

public class Integrante {

	private Long id;
	private String nombre;
	private String apellido;
	private Instrumento instrumento;
	
	public Integrante(){
		
	}
	
	public Integrante(String nombre,String apellido, Instrumento instrumento){
		this.nombre = nombre;
		this.apellido = apellido;
		this.instrumento = instrumento;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Instrumento getInstrumento() {
		return instrumento;
	}
	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}

	
}
