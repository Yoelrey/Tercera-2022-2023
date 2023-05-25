package terceraejemplos;

public class testVotacion {
	public static void main (String[] args) {
		
		 System.out.println (Votacion.showItToMe() +
		 ": "+ Votacion.VotosDelMasVotado());
		
		 // Tenemos tres candidatos en esta votacion
		 Votacion Juan = new Votacion ("Juan Peire");
		 Votacion Ana = new Votacion ("Ana Garcia");
		 Votacion Adela = new Votacion ("Adela Sancho");
		
		 // empieza la votacion
		 Juan.Voto(); Ana.Voto(); Ana.Voto(); Ana.Voto();
		 Adela.Voto();
		 System.out.println (Votacion.showItToMe());
		
		 Juan.Voto(); Juan.Voto(); Juan.Voto(); Adela.Voto();
		 System.out.println (Votacion.NombreDelMasVotado());
		
		 Adela.Voto(); Adela.Voto(); Ana.Voto(); Ana.Voto();
		 System.out.println (Votacion.NombreDelMasVotado());
		 System.out.println("Lo q dicen los objetos");
		 
		 System.out.println(Juan.toString());
		 System.out.println(Ana.toString());
		 System.out.println(Adela.toString());
		 System.out.println("Fin de la votacion y Resultado : --->Lo que dice la clase de sus atributos");
		 
		 System.out.println (Juan.NombrePersona() + ": " +
		 Juan.Votos() );
		 System.out.println (Ana.NombrePersona() + ": " +
		Ana.Votos() );
		 System.out.println (Adela.NombrePersona() + ": " +
		 Adela.Votos() );
		
		 }
}
