package Ejercicio42;

public class Oficina extends Local {

	// Atributo que identifica el valor por área de una oficina
	protected static double valorArea = 3500000;
	// Atributo que identifica si una oficina pertenece o no al gobierno
	protected boolean esGobierno;

	public Oficina(int identificadorInmobiliario, int área, String dirección, tipo tipoLocal, boolean esGobierno) {
		// Invoca al constructor de la clase padre
		super(identificadorInmobiliario, área, dirección, tipoLocal);
		this.esGobierno = esGobierno;
	}

	@Override
	public String toString() {
		return super.toString() + "Oficina [esGobierno=" + esGobierno + "]";
	}


}
