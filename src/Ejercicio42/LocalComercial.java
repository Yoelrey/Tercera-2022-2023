package Ejercicio42;

public class LocalComercial extends Local {

	// Atributo que identifica el valor por área de un local comercial
	//protected static double valorArea = 3000000;
	/*
	 * Atributo que identifica el centro comercial donde está ubicado el local
	 * comercial
	 */
	protected String centroComercial;

	public LocalComercial(int identificadorInmobiliario, int área, String dirección, tipo tipoLocal,
			String centroComercial) {
		// Invoca al constructor de la clase padre
		super(identificadorInmobiliario, área, dirección, tipoLocal);
		this.centroComercial = centroComercial;
	}

	/**
	 * Método que muestra en pantalla los datos de un local comercial
	 */
	@Override
	public String toString() {
		return "LocalComercial [centroComercial=" + centroComercial + ", tipoLocal=" + tipoLocal
				+ ", identificadorInmobiliario=" + identificadorInmobiliario + ", área=" + area + ", dirección="
				+ dirección + ", precioVenta=" + precioVenta + "]";
	}
		

}
