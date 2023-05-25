package Herencia;

public class test {

	public static void main(String[] args) {
		 Libro MiLibro = new Libro(575,15.2f,"Manifiesto negro","dura","","Frederick Forsyth","Circulo de lectores");
		 
		 System.out.println(MiLibro.toString());
		 
		 
		 Periodico TuPeriodico= new Periodico(64,1.5f,"Fora de Bigo","14 de Abril");
		 System.out.println(TuPeriodico.toString());
		 }
	
}
