package terceraejemplos;

public class Logisticacc {
	private String nombre;
	private int Capacidad;
	private byte NumeroDeContenedores;
	
	 Logisticacc(byte Capacidad,String n) {
	 this.Capacidad = Capacidad;
	 NumeroDeContenedores = Capacidad;
	 this.nombre=n;
	 }
		 public byte getNumeroDeHuecos() {
	 return (NumeroDeContenedores);
	 }
	
	 public int getCapacidad() {
	 return (Capacidad);
	 }
	
	
	 public boolean HayHueco() {
	 return (NumeroDeContenedores !=0);
	 }
	
	 public boolean HayContenedor() {
	 return (NumeroDeContenedores != Capacidad);
	 }
	
	 public void MeteContenedor() {
		 System.out.println(this.toString());
	 NumeroDeContenedores++;
	 }
	
	 @Override
	public String toString() {
		return "LogisticaAlmacen [nombre=" + nombre + ", Capacidad=" + Capacidad 
				+ ", NumeroDeHuecos="+NumeroDeContenedores
				+ "]";
	}
	public void SacaContenedor() {
		 System.out.println(this.toString());

	 NumeroDeContenedores--;
	 }
}
