package bd2.model;

import java.util.*;

public class Documento {
	
	/** Esta es la clase Documento, la cual conoce su nombre, su complejidad, el idioma en el que est� escrito y la colecci�n de p�rrafos que lo conforman.*/
	
	private String nombre;
	private Integer complejidad;
	private Idioma idioma;
	private Collection<Parrafo> parrafos = new LinkedList<Parrafo>();
	
	
	/** Constructor de la clase que recibe por par�metro un nombre, una complejidad y el idioma en que el Documento est� escrito.*/
	public Documento(String nombre, Integer complejidad, Idioma idioma){
		this.nombre=nombre;
		this.complejidad=complejidad;
		this.idioma=idioma;
	}
	
	/** Constructor de la clase que recibe por par�metro un nombre y el idioma en que el Documento est� escrito.*/
	public Documento(String nombre, Idioma idioma){
		this.nombre=nombre;
		this.idioma=idioma;
	}
	
	/** M�todo de la clase que recibe por par�metro una complejidad, si el par�metro es mayor o igual a 0 o menor o igual a 10, se setea la complejidad. Caso contrario, 
	 * se lanza una excepci�n.*/
	
	public void setComplejidad(Integer complejidad) throws Exception{
		if (complejidad<0) {
			throw new Exception ("No se puede usar valores negativos como complejidad de un documento.");
		}
		if (complejidad>10){
			throw new Exception ("No se puede usar valores mayores a 10 como complejidad de un documento.");
		}
		this.complejidad=complejidad;
	}
	
	public Integer getComplejidad(){
		return this.complejidad;
	}
	
	public Idioma getIdioma(){
		return this.idioma;
	}
	
	public void setIdioma(Idioma idioma){
		this.idioma=idioma;
	}
	
	/** M�todo que crea un p�rrafo con el texto recibido por par�metro y lo agrega a la colecci�n de p�rrafos del Documento.*/
	public Parrafo agregarParrafo(String texto){
		Parrafo tempParrafo = new Parrafo(texto,this);
		parrafos.add(tempParrafo);
		return tempParrafo;
	}
	
	public Collection<Parrafo> getParrafos(){
		return this.parrafos;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
}
