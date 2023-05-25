package Ejemplo3;

import java.awt.Color;

public class Motocicleta extends Vehiculo implements EstacionServicio{

private byte NumeroDePlazas;

Motocicleta() {
super((byte) 2);
}

Motocicleta(byte NumeroDePlazas) {
super((byte) 2);
setNumeroDePlazas(NumeroDePlazas);
}

Motocicleta(Color color) {
super(color, (byte) 2);
}

Motocicleta(Color color, short Cilindrada) {
super(color, (byte) 2, Cilindrada);
}

Motocicleta(Color color, short Cilindrada, short Potencia) {
super(color, (byte) 2, Cilindrada, Potencia);
}

public byte getNumeroDePlazas() {
return NumeroDePlazas;
}

public void setNumeroDePlazas(byte NumeroDePlazas) {
this.NumeroDePlazas = NumeroDePlazas;
}

@Override
public String toString() {
return "Motocicleta [NumeroDePlazas=" + NumeroDePlazas + ", getColor()=" + getColor() + ", getNumRuedas()="
+ getNumRuedas() + ", getCilindrada()=" + getCilindrada() + ", getPotencia()=" + getPotencia() + "]";
}


@Override
	public double pagarRodaje() {
		
		return super.pagarRodaje() + (1.24*getPotencia());
	}
@Override
public double pagarCarburante() {
	
double litros =pidelitros();

	return super.pagarCarburante()+litros*Gasolina;
	
	
}


}