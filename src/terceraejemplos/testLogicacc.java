package terceraejemplos;

import java.util.Scanner;

public class testLogicacc {
	public static void main(String[] args){
		 Logisticacc Almacen1 = new Logisticacc((byte)2 ,"cerca");
		 Logisticacc Almacen2 = new Logisticacc((byte)4,"media");
		 Logisticacc Almacen3 = new Logisticacc((byte)8 ,"lejos");
		
		 String Accion;
		Scanner sc = new Scanner(System.in);
		 do {
			 System.out.println("m meter//s sacar //salir salir");
		 Accion = sc.nextLine();
		 if (Accion.equals("m")) // meter contenedor
		 if (Almacen1.HayHueco())
		 Almacen1.MeteContenedor();
		 else
		 if (Almacen2.HayHueco())
		Almacen2.MeteContenedor();
		 else
		 if (Almacen3.HayHueco())
		 Almacen3.MeteContenedor();
		 else
		 System.out.println("Hay que esperar a que vengan a quitar un contenedor");
		 else if (Accion.equals("s"))// sacar contenedor
		 if (Almacen1.HayContenedor())
		 Almacen1.SacaContenedor();
		 else
		 if (Almacen2.HayContenedor())
		 Almacen2.SacaContenedor();
		 else
		 if (Almacen3.HayContenedor())
		 Almacen3.SacaContenedor();
		 else
		 System.out.println("Hay que esperar a que vengan a poner un contenedor"); 
		 } while (!Accion.equals("salir"));
		 }
}
