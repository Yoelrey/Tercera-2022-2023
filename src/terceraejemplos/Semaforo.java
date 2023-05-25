package terceraejemplos;

public class Semaforo {

	 private String EstadoSemaforo = "Rojo";
	 public void setColor (String Color) {
	 EstadoSemaforo = Color;
	 }
	 @Override
	public String toString() {
		return "Semaforo [EstadoSemaforo=" + EstadoSemaforo + "]";
	}
	public String getColor() {
	 return EstadoSemaforo;
	 }
	} // Fin de la clase Semaforo

