package Propuesto2;

import java.awt.Color;

public class Perro extends Mascota{
protected int peso;
protected boolean agresivo;
public Perro(String nombre, int edad, Color color, int peso, boolean agresivo) {
	super(nombre, edad, color);
	this.peso = peso;
	this.agresivo = agresivo;
}
@Override
public String toString() {
	return "Perro [peso=" + peso + ", agresivo=" + agresivo + "]";
}
public int getPeso() {
	return peso;
}
public void setPeso(int peso) {
	this.peso = peso;
}
public boolean isAgresivo() {
	return agresivo;
}
public void setAgresivo(boolean agresivo) {
	this.agresivo = agresivo;
}

public String sonido() {
	return "Los perros ladran";
}

}
