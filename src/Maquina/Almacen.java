package Maquina;

public class Almacen {
	private String Nombre;
	 private short Capacidad;
	  private short NumeroDeElementos = 0;
	 
	  Almacen(short Capacidad,String nombre) {
	  this.Capacidad = Capacidad;
	  this.Nombre=nombre;
	  }
	 
	  public short getNumeroDeElementos() {
	  return (NumeroDeElementos);
	  }
	 
	  public short getCapacidad() {
	  return (Capacidad);
	  }
	 
	  public boolean HayElemento() {
	  return (NumeroDeElementos != 0);
	  }
	 
	  public boolean HayHueco() {
	  return (NumeroDeElementos != Capacidad);
	  }
	 
	 public void MeteElemento() {
	  NumeroDeElementos++;
	  }
	 
	  public void SacaElemento() {
	  NumeroDeElementos--;
	  }
	 
	 
	  public void RellenaAlmacen() {
	  NumeroDeElementos = Capacidad;
	  }
}
