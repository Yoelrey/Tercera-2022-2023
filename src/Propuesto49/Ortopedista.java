package Propuesto49;

public class Ortopedista extends Medico{

	
	enum tipologia{MAXILOFACIAL,PEDIATRA};
	protected tipologia tipo;

	@Override
	public String toString() {
		return "Ortopedista [tipo=" + tipo + "]";
	}

	public Ortopedista(String nombre, tipologia tipo) {
		super(nombre);
		this.tipo = tipo;
	}

	public tipologia getTipo() {
		return tipo;
	}

	public void setTipo(tipologia tipo) {
		this.tipo = tipo;
	}
	
}
