package Ejercicio410;

import java.util.ArrayList;

public class TestPersona {
 public static void main(String[] args) {
	ArrayList<Persona>Lista=new ArrayList<>();
	 Persona p = new Persona("yoel","Urzaiz");
	 Lista.add(p);
	 Estudiante e= new Estudiante("Pepe","Hispannidad","DAM",2);
	 Lista.add(e);
	 Profesor pr = new Profesor ("Angel","Casiano Martinez","Desarrollo de apps","Informatica");
	Lista.add(pr);
	for(Persona i:Lista) {
		System.out.println(Lista.toString());
	}
}
}
