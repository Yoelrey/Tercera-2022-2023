package terceraejemplos;

public class LogisticaAlmacen {
	
	private String nombre;
	private int Capacidad;
	private byte NumeroDeHuecos;
	
	 LogisticaAlmacen(byte Capacidad,String n) {
	 this.Capacidad = Capacidad;
	 NumeroDeHuecos = Capacidad;
	 this.nombre=n;
	 }
		 public byte getNumeroDeHuecos() {
	 return (NumeroDeHuecos);
	 }
	
	 public int getCapacidad() {
	 return (Capacidad);
	 }
	
	
	 public boolean HayHueco() {
	 return (NumeroDeHuecos != 0);
	 }
	
	 public boolean HayContenedor() {
	 return (NumeroDeHuecos != Capacidad);
	 }
	
	 public void MeteContenedor() {
		 System.out.println(this.toString());
	 NumeroDeHuecos--;
	 }
	
	 @Override
	public String toString() {
		return "LogisticaAlmacen [nombre=" + nombre + ", Capacidad=" + Capacidad + ", NumeroDeHuecos=" + NumeroDeHuecos
				+ "]";
	}
	public void SacaContenedor() {
		 System.out.println(this.toString());

	 NumeroDeHuecos++;
	 }

}
