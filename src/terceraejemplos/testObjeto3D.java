package terceraejemplos;

public class testObjeto3D {
	public static void main(String[] args) {
		 Objeto3d Caja = new Objeto3d();
		 Objeto3d Esfera = new Objeto3d();
		 Objeto3d Bicicleta = new Objeto3d();
		 
		 Caja.Dimensiones(20.0,12.5,30.2,"centimetros");
		 Esfera.Dimensiones(10.0,"pulgadas",10.0,10.0);
		 Bicicleta.Dimensiones(90.0,30.0,20.0);
		 
		  System.out.println(Bicicleta.getMedida());
		  System.out.println(Bicicleta.getAlto());
		 
		  Bicicleta.Dimensiones("pulgadas");
		 
		  System.out.println(Bicicleta.getMedida());
		  System.out.println(Bicicleta.getAlto());
		  System.out.println(Caja);
		  System.out.println(Esfera);
		  System.out.println(Bicicleta);
	}
}
