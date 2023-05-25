package Equipos;

import java.util.ArrayList;

public class testEquipo {

	public static void main(String[] args) {

		ArrayList<Equipo> lista = new ArrayList<>();
		Velocista v = new Velocista("Pedro", 123, "España", 1, "Rey", 21, 60, 54);
		Escalador e = new Escalador("Angel", 120, "España", 2, "Rey", 150, 30, 20);
		Equipo uno = new Equipo("Caillu", 213, "texto");
		Escalador es = new Escalador("Rey", 1123980, "Egan Bernal", 25, "EY", 10, 385, 0);
		lista.add(v);

	}
}
