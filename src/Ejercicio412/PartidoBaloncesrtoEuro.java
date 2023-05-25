package Ejercicio412;

public class PartidoBaloncesrtoEuro implements PartidDeBaloncesto{

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
	public void setCestasEquipoLocal(int marcador) {
		this.golesEquipoLocal=marcador;
		
	}
	@Override
	public void setCestasEquipoVisitante(int marcador) {
		this.golesEquipoVisitante=marcador;
		
	}
	@Override
	public String toString() {
		return "PartidoBaloncesrtoEuro [equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante
				+ ", golesEquipoLocal=" + golesEquipoLocal + ", golesEquipoVisitante=" + golesEquipoVisitante + "]";
	}
	
	
}
