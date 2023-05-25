package Maquina;

import java.util.Scanner;

public class testMaquina {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Accion;
		char Car;

		Modelo MiMaquina = new Modelo();
		MiMaquina.PonPrecios(1.1f, 1.3f, 0.8f);
		MiMaquina.Deposito1Euro.MeteElemento();
		MiMaquina.Deposito01Euro.MeteElemento();
		MiMaquina.Deposito01Euro.MeteElemento();
		MiMaquina.DepositoCocaCola.RellenaAlmacen();
		MiMaquina.DepositoNaranja.RellenaAlmacen();
		// MiMaquina.Deposito1Euro.RellenaAlmacen(); No nos
		// ha llegado el suministro de agua

		do {
			System.out.println("-- c,n,a,s --");
			Accion = sc.nextLine();
			Car = Accion.charAt(0);
			switch (Car) {
			case 'c':
				System.out.println("Ha seleccionado Coca cola");
				if (MiMaquina.DepositoCocaCola.HayElemento()) {
					if (MaquinaAutomaticaDeEuros.IntroduccionMonedas(MiMaquina, MiMaquina.getPrecioCocaCola())) {
						MiMaquina.DepositoCocaCola.SacaElemento();
						System.out.println("No olvide coger su cocacola");
						// Sacar fisicamente la CocaCola
					}
				} else
					System.out.println("Producto agotado");
				break;

			case 'n':
				System.out.println("Ha seleccionado Naranja");
				if (MiMaquina.DepositoNaranja.HayElemento()) {
					if (MaquinaAutomaticaDeEuros.IntroduccionMonedas(MiMaquina, MiMaquina.getPrecioNaranja())) {
						MiMaquina.DepositoNaranja.SacaElemento();
						System.out.println("No olvide coger su naranja");
						// Sacar fisicamente la Naranja
					}
				} else
					System.out.println("Producto agotado");
				break;

			case 'a':
				System.out.println("Ha seleccionado Agua");
				if (MiMaquina.DepositoAgua.HayElemento()) {
					if (MaquinaAutomaticaDeEuros.IntroduccionMonedas(MiMaquina, MiMaquina.getPrecioAgua())) {
						MiMaquina.DepositoAgua.SacaElemento();
						System.out.println("No olvide coger su agua");
						// Sacar fisicamente el agua
					}
				} else
					System.out.println("Producto agotado");
				break;

			default:
				System.out.println("Error de seleccion,intentelo de nuevo");
				break;
			}
			MiMaquina.MostrarEstadoMaquina();

		} while (!Accion.equals("s"));
	}
}
