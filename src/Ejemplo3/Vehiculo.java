package Ejemplo3;

import java.awt.Color;
import java.util.Scanner;

public class Vehiculo implements Comparable,EstacionServicio{
private Color ColorVehiculo;
private byte NumRuedas;
private short Cilindrada;
private short Potencia;

Vehiculo(Color color) {
setColor(color);
}

Vehiculo(byte NumRuedas) {
this.NumRuedas = NumRuedas;
}

Vehiculo(short Cilindrada) {
this.Cilindrada = Cilindrada;
}

Vehiculo(Color color, byte NumRuedas) {
// lamada
this(color);
this.NumRuedas = NumRuedas;
}

Vehiculo(Color color, byte NumRuedas, short Cilindrada) {
this(color, NumRuedas);
this.Cilindrada = Cilindrada;
}

Vehiculo(Color color, byte NumRuedas, short Cilindrada, short Potencia) {
this(color, NumRuedas, Cilindrada);
this.Potencia = Potencia;
}

public void setColor(Color color) {
ColorVehiculo = color;
}

public Color getColor() {
return ColorVehiculo;
}

public byte getNumRuedas() {
return NumRuedas;
}

public short getCilindrada() {
return Cilindrada;
}

public short getPotencia() {
return Potencia;
}

@Override
public String toString() {
return "Vehiculo [ColorVehiculo=" + ColorVehiculo + ", NumRuedas=" + NumRuedas + ", Cilindrada=" + Cilindrada
+ ", Potencia=" + Potencia + "]";
}
public double pagarRodaje() {
	return 53.37d;
}

@Override
public int compareTo(Object arg0) {
	// TODO Auto-generated method stub
	Vehiculo v = (Vehiculo) arg0;
	if(this.pagarRodaje() > v.pagarRodaje())
		return -1 ;
		else if(this.pagarRodaje() == v.pagarRodaje())
	return 0;
			else
				return 1;
}
public double pidelitros() {
	Scanner sc = new Scanner (System.in);
	System.out.println("Numero de litros q vas a repostar");
	 double litros = sc.nextDouble();
	 return litros;
}
public boolean EsDiesel() {
	Scanner sc = new Scanner (System.in);
	System.out.println("Es diesel");
	char respuesta=sc.nextLine().charAt(0);
	if(respuesta=='s')
		return true;
	else
		return false;
	

}


@Override
public double pagarCarburante() {
	// TODO Auto-generated method stub
	System.out.println("Impuesto general a todos los vehiculos");
	
	return 1.55;
}

}