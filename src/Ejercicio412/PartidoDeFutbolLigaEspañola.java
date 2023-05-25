package Ejercicio412;

public class PartidoDeFutbolLigaEspañola implements PartidoFUtbol{

	public String equipoLocal;
	String equipoVisitante;
	int golesEquipoLocal;
	int golesEquipoVisitante;
	@Override
	public void setEquipoLocal(String nombreEquipo) {
		this.equipoLocal=nombreEquipo;
		
	}
	@Override
	public void setEquipoVisitante(String nombreEquipo) {
		this.equipoVisitante=nombreEquipo;
		
	}
	@Override
	public void setGolesEquipoLocal(int marcador) {
		this.golesEquipoLocal=marcador;
		
	}
	@Override
	public void setGolesEquipoVisitante(int marcador) {
		this.golesEquipoVisitante=marcador;
		
	}
	@Override
	public String toString() {
		return "PartidoDeFutbolLigaEspañola [equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante
				+ ", golesEquipoLocal=" + golesEquipoLocal + ", golesEquipoVisitante=" + golesEquipoVisitante + "]";
	}
	
	
	
}
