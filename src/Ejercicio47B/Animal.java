package Ejercicio47B;

public abstract class Animal {

	protected String sonido;
	protected String alimentos;
	protected String habitat;
	protected String nombreCientifico;
	
	public abstract String getSonido();
	public abstract String setSonido();
	public abstract String getAlimentos();
	
	public abstract String setAlimentos(); 
		
	public abstract String getHabitat();
		
	
	public abstract String setHabitat(); 
		
	
	public abstract String getNombreCientifico();

	
	public abstract void setNombreCientifico(String nombreCientifico);
	
}
