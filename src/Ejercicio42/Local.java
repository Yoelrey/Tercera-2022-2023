package Ejercicio42;

public class Local extends Inmueble {

	enum tipo {
		INTERNO, CALLE
	}; /*
		 * Tipo de inmueble especificado como un valor enumerado
		 */

	protected tipo tipoLocal; /*
								 * Atributo que identifica el tipo de inmueble
								 */

	public Local(int identificadorInmobiliario, int área, String dirección, tipo tipoLocal) {
		// Invoca al constructor de la clase padre
		super(identificadorInmobiliario, área, dirección);
		this.tipoLocal = tipoLocal;
	}

	/**
	 * Método que muestra en pantalla los datos de un local //
	 */

	@Override
	public String toString() {
		return "Local [tipoLocal=" + tipoLocal + ", identificadorInmobiliario=" + identificadorInmobiliario + ", área="
				+ area + ", dirección=" + dirección + ", precioVenta=" + precioVenta + "]";
	}

}
