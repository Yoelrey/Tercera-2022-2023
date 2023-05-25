package Ejercicio411;

import java.util.ArrayList;

public class test {
public static void main(String[] args) {
	
	ArrayList<Vehiculo>vehiculos=new ArrayList<>();
	
	Terrestre t =new Terrestre(34, 150);
	Acuatico a = new Acuatico(20,100);
	
	vehiculos.add(a);
	vehiculos.add(t);
	
	a.acelerar(23);
	a.calcularRevoluciones(1213, 4);
	a.frenar(10);
	
	for(Vehiculo v:vehiculos) {
		System.out.println(v.toString());
	}
	
}
}
