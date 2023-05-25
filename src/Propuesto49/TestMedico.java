package Propuesto49;

import java.util.ArrayList;


import Propuesto49.Pediatra.tipologia;

public class TestMedico {

	public static void main(String[] args) {
		ArrayList<Medico>Medicos= new ArrayList<>();
		Medico m1=new Medico("Juan");
		Pediatra p1=new Pediatra("Yoel",tipologia.PSICOLOGO);
		Pediatra p2=new Pediatra("Eloy",tipologia.NEUROLOGO);
		Ortopedista o1=new Ortopedista("Pepe",Ortopedista.tipologia.MAXILOFACIAL);
		Ortopedista o2=new Ortopedista("Antonio",Ortopedista.tipologia.PEDIATRA);
		
		Medicos.add(m1);
		Medicos.add(p1);
		Medicos.add(o1);
		Medicos.add(o2);
		Medicos.add(p2);
		
		
		for(int i=0;i<Medicos.size();i++) {
			System.out.println(i);
			Medico a =Medicos.get(i);
			if(a instanceof Ortopedista) {
				System.out.println("El objeto en el indice "+a+ "es de la clase Ortopedista");
			continue;
			}
			if(a instanceof Pediatra) {
				System.out.println("El objeto en el indice "+a+ "es de la clase Pediatra");
			continue;
			}
			if(a instanceof Medico) {
				System.out.println("El objeto en el indice "+a+ "es de la clase Medico");
			continue;
			}
		}
		
		for (Medico medico : Medicos) {
			System.out.println(medico.toString());
		}
		
	}
}
