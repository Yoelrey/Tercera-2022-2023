package Ejercicio411;

public class Terrestre extends Vehiculo implements Motor{

	public Terrestre(int velocidadActual, int velocidadMaxima) {
		super(velocidadActual, velocidadMaxima);
		
	}

	@Override
	public void acelerar(int incremento) {
		int vel= velocidadActual+incremento;
		if(vel>velocidadMaxima){
			System.out.println("Supera la velcidad maxima permitida");	
		}else {
			velocidadActual=vel;
		}
	}

	@Override
	public void frenar(int incremento) {
		int vel= velocidadActual - incremento;
		if(vel<0) {
			System.out.println("La velocidad no puede ser negativa");			
		}else {
			velocidadActual=vel;
		}
	}

	@Override
	public int calcularRevoluciones(int fuerza, int radio) {
		// TODO Auto-generated method stub
		return (fuerza*radio);
	}
	
	

}
