package terceraejemplos;

public class testObjeto3DConConstructor {
	public static void main (String[] args) {
		//Usa tres constructores diferentes
		 Objeto3DConConstructor Caja = new
		 Objeto3DConConstructor(20.0,12.5,30.2,"centimetros");
		
		 Objeto3DConConstructor Esfera = new
		 Objeto3DConConstructor(10.0,"pulgadas",10.0,10.0);
		
		 Objeto3DConConstructor Bicicleta = new
		 Objeto3DConConstructor(90.0,30.0,20.0);
		
		 System.out.println(Bicicleta.getMedida());
		 System.out.println(Bicicleta.getAlto());
		
		 Bicicleta.TipoMedida("pulgadas");
		
		 System.out.println(Bicicleta.getMedida());
		 System.out.println(Bicicleta.getAlto());
		 System.out.println(Bicicleta);
		 System.out.println(Esfera);
		 System.out.println(Caja);
		 
		 
	 }

}
