package Propuesto2;

import java.awt.Color;

public class Mascota {
 protected String nombre;
 protected int edad;
 protected Color color;
public Mascota(String nombre, int edad, Color color) {
	super();
	this.nombre = nombre;
	this.edad = edad;
	this.color = color;
}
@Override
public String toString() {
	return "Mascota [nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]";
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public Color getColor() {
	return color;
}
public void setColor(Color color) {
	this.color = color;
}
 
 
}
