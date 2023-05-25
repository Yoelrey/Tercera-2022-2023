package Ejercicio412;

public class PartidoTennisMons implements PartidoTennis{

	public String equipoLocal;
	String equipoVisitante;
	int juegosEquipoLocal;
	int juegosEquipoVisitante;
	
	public void setEquipoLocal(String nombreEquipo) {
		this.equipoLocal=nombreEquipo;
		
	}
	@Override
	public void setEquipoVisitante(String nombreEquipo) {
		this.equipoVisitante=nombreEquipo;		
	}

	@Override
	public void setJuegosLocal(int juegos) {
		this.juegosEquipoLocal=juegos;
		
	}

	@Override
	public void setJuegosVisitante(int juegos) {
		this.juegosEquipoVisitante=juegos;
		
	}

}
