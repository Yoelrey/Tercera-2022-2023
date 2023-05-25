package Maquina;

public class Modelo {

	public Almacen Deposito1Euro = new Almacen((short) 8,"chetos");
	public Almacen Deposito01Euro = new Almacen((short) 15,"coca");

	public Almacen DepositoCocaCola = new Almacen((short) 10,"maicitos");
	public Almacen DepositoNaranja = new Almacen((short) 5,"napolitanas de queso y jamon");
	public Almacen DepositoAgua = new Almacen((short) 8,"Monster");

	private float PrecioCocaCola = 1.0f;
	private float PrecioNaranja = 1.3f;
	private float PrecioAgua = 0.6f; // precio recomendado

	public void PonPrecios(float CocaCola, float Naranja, float Agua) {
		PrecioCocaCola = CocaCola;
		PrecioNaranja = Naranja;
		PrecioAgua = Agua;
	}

	public float getPrecioCocaCola() {
		return PrecioCocaCola;
	}

	public float getPrecioNaranja() {
		return PrecioNaranja;
	}

	public float getPrecioAgua() {
		return PrecioAgua;
	}

	public void MostrarEstadoMaquina() {
		System.out.print("CocaColas: " + DepositoCocaCola.getNumeroDeElementos() + " ");
		System.out.print("Naranjas: " + DepositoNaranja.getNumeroDeElementos() + " ");
		System.out.println("Agua: " + DepositoAgua.getNumeroDeElementos() + " ");

		System.out.print("1 Euro: " + Deposito1Euro.getNumeroDeElementos() + " ");
		System.out.println("0.1 Euro: " + Deposito01Euro.getNumeroDeElementos() + " ");
		System.out.println();
	}

}
