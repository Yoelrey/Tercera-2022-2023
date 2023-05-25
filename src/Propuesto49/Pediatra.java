package Propuesto49;



public class Pediatra extends Medico{

	enum tipologia{NEUROLOGO,PSICOLOGO};
	protected tipologia tipo;

	public Pediatra(String nombre, tipologia tipologia) {
		super(nombre);
		tipo = tipologia;
	}

	@Override
	public String toString() {
		return "Pediatra [Tipologia=" + tipo + "]"+super.toString();
	}

	public tipologia getTipologia() {
		return tipo;
	}

	public void setTipo(tipologia tipo) {
		this.tipo = tipo;
	}

	
	
	
}
