package terceraejemplos;

public class Objeto3d {

	
	 private double X = 0d;
	 private double Y = 0d;
	 private double Z = 0d;
	 private String TipoMedida = "centimetro";
	
	 public void Dimensiones3D(double Ancho, double Alto, double Profundo) {
	 X = Ancho;
	 Y = Alto; 
	 Z = Profundo;
	 }
	
	 public void TipoMedida(String Medida) {
	 TipoMedida = Medida;
	 }
	//el metodo dimensiones esta sobrecargado por q se esta llamando de distintas formas
	 public void Dimensiones(double Ancho, double Alto,double Profundo,String Medida) {
	
		 Dimensiones3D(Ancho,Alto,Profundo);
	 
		 TipoMedida(Medida);
	}
	
	public void Dimensiones(String Medida, double Ancho,double Alto, double Profundo) {
	
		Dimensiones(Ancho,Alto,Profundo,Medida);
	 }
	
	 public void Dimensiones(double Ancho, String Medida,double Alto, double Profundo) {
	 
		 Dimensiones(Ancho,Alto,Profundo,Medida);
	 }
	
	 public void Dimensiones(double Ancho, double Alto,String Medida,double Profundo) {
		 
		 Dimensiones(Ancho,Alto,Profundo,Medida);
	 }
	 public void Dimensiones(String Medida) {
	 TipoMedida(Medida);
	 }
	
	 public void Dimensiones(double Ancho, double Alto,double Profundo) {
	 
		 Dimensiones3D(Ancho,Alto,Profundo);
	 }
	
	 public double getAncho() {
	 return X;
	 }
	
	 public double getAlto() {
	 return Y;
	 }
	
	 public double getProfundo() {
	 return Z;
	 }
	
	 public String getMedida() {
	 return TipoMedida;
	 }


	@Override
	public String toString() {
		return "Objeto3d [X=" + X + ", Y=" + Y + ", Z=" + Z + ", TipoMedida=" + TipoMedida + "]";
	}

	public void setX(double x) {
		X = x;
	}

	public void setY(double y) {
		Y = y;
	}

	public void setZ(double z) {
		Z = z;
	}

	public void setTipoMedida(String tipoMedida) {
		TipoMedida = tipoMedida;
	}

}
