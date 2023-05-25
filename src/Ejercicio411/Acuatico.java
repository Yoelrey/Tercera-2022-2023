package Ejercicio411;

public class Acuatico extends Vehiculo implements Motor,Vela{

	public Acuatico(int velocidadActual, int velocidadMaxima) {
		super(velocidadActual, velocidadMaxima);
		// TODO Auto-generated constructor stub
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

	@Override
	public void recomendarVelocidad(int velocidadViento) {
		if(velocidadViento >80 || velocidadViento<10) {
			velocidadActual=0;
		}
	}

	
	
}
