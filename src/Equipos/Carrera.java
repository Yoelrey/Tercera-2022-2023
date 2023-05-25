package Equipos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.Scanner;

public class Carrera {

	private int posicion=0;
	private String nombre;
	private String Pais;
	private ArrayList<Equipo>listaEquipos;
	private ArrayList<Ciclista>clasificacion;
	public Carrera(String nombre, String pais, ArrayList<Equipo> listaEquipos, ArrayList<Ciclista> clasificacion) {
		super();
		this.nombre = nombre;
		Pais = pais;
		this.listaEquipos = new ArrayList<>();
		this.clasificacion =new ArrayList<>();
	}
	
	public void buscarEquipo() {
		boolean esta=false;
		Scanner sc =new Scanner (System.in);
		String nombreEquipo=sc.next();
	}
	public void listarequipo() {
		  
		for (int i=0;i<listaEquipos.size();i++) {
			Equipo e=listaEquipos.get(i);
			
		}
	}
	public void añadirCiclista() {}
	
	public void añadirEquipo(Equipo equipo) {
		listaEquipos.add(equipo);
	}
	
	public void ordenaPosiciones() {
		Collections.sort(listaEquipos, new Comparator<Equipo>() {
			public int compare(Equipo e1 ,Equipo e2) {
				return ((Ciclista) e1).getTiempoAcumulado()-((Ciclista) e2).getTiempoAcumulado();
		}
		
		});
	
	

	}
	
	public void ImprimirClasificacion() {
		ListIterator<Ciclista>iter= clasificacion.listIterator();
		while(iter.hasNext()) {
			iter.next().toString();
		}
	}
	}
	
