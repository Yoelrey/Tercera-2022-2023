package Ejercicio412;

public class testeo {

	public static void main(String[] args) {
			
		PartidoDeFutbolLigaEspañola pdf=new PartidoDeFutbolLigaEspañola();
		pdf.setEquipoLocal("Goian");
		pdf.setEquipoVisitante("Tomiño");
		pdf.setGolesEquipoLocal(0);
		pdf.setGolesEquipoVisitante(23);
		
		
		PartidDeBaloncesto PDB = new PartidoBaloncesrtoEuro();
		PDB.setCestasEquipoLocal(23);
		PDB.setCestasEquipoVisitante(453);
		PDB.setEquipoLocal("Goian");
		PDB.setEquipoVisitante("Tomiño");
		
		System.out.println(PDB.toString());
		System.out.println("Tiempo de juego: "+ PartidoFUtbol.duracionPartidoFutbol);
		
	}
}
