package Ejercicio41;

public class CuentaDeAhorros extends Cuenta{

	
	private boolean activa;

	public CuentaDeAhorros(float Saldo, float TasaAnual) {
		super(Saldo, TasaAnual);
		if(Saldo>10000)
			activa=true;
		else
			activa=false;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void consignar(float cantidad) {
		if (esActiva())
			super.consignar(cantidad);
		else
			System.out.println("La cuenta no esta activa");
		
		super.consignar(cantidad);
	}
	@Override
	public void retirar(float cantidad) {
		if (activa)
			super.retirar(cantidad);
		else
			System.out.println("La cuenta no esta activa");
	
		
		
		super.retirar(cantidad);
	}
	@Override
	public void extractoMensual() {
		
	if(esActiva()) {
		if(NumeroRetiros>4) {
			
			Comision+=1000;
			super.extractoMensual();
			
		}else 
		super.extractoMensual();
	
	}else 
		System.out.println("la cuenta no esta activa");
		
	}
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "CuentaDeAhorros [activa=" + activa +super.toString();
	}
	
	private boolean esActiva() {
		boolean activa=true;
		return activa;
	}
	
}
