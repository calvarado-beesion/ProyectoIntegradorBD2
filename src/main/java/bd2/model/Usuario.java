package bd2.model;

import java.util.*;


public class Usuario {
	private String email;
	private String nombre;
	private Date fechaDeCreacion;
	private Collection<Cursada> cursadasRealizadas = new LinkedList<Cursada>();
	private Collection<Traduccion> traducciones = new LinkedList<Traduccion>();
	
	public Usuario(){
		
	}
	
	public Usuario(String email, String nombre, Date fechaDeCreacion){
		this.email = email;
		this.nombre = nombre;
		this.fechaDeCreacion = fechaDeCreacion;
	}
	
	public int nivel(Idioma idioma){
		int nivMax=-1;
		for (Cursada cursadaAct : this.cursadasAprobadas(idioma)){
			if (cursadaAct.getNivel()>nivMax){
				nivMax=cursadaAct.getNivel();
			}
		}
		if (nivMax==-1){
			return 0;
		} else {
			return nivMax;
		}
	}
	
	public Collection<Cursada> cursadasAprobadas(Idioma idioma){
		Collection<Cursada> CAprobadas = new LinkedList<Cursada>();
		for (Cursada cursadaAct : this.cursadasRealizadas){
			if(cursadaAct.finalizada() && cursadaAct.getIdioma().equals(idioma)){
				CAprobadas.add(cursadaAct);
			}
		}
		return CAprobadas;
	}
	
	public void agregarCursada(Cursada cursada){
		this.cursadasRealizadas.add(cursada);
	}
	
	public void agregarTraduccion(Traduccion traduccion){
		this.traducciones.add(traduccion);
	}
	
	public Collection<Cursada> getCursadasRealizadas(){
		return this.cursadasRealizadas;
	}
	
	public Collection<Traduccion> getTraducciones(){
		return this.traducciones;
	}
	
	public void setEmail(String email){
		this.email=email;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public void setDate(Date fechaDeCreacion){
		this.fechaDeCreacion=fechaDeCreacion;
	}
	
	public void setCursadasRealizadas(Collection<Cursada> cursadasRealizadas){
		this.cursadasRealizadas=cursadasRealizadas;
	}
	
	public void setTraducciones(Collection<Traduccion> traducciones){
		this.traducciones=traducciones;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public Date getFechaDeCreacion(){
		return this.fechaDeCreacion;
	}
}
