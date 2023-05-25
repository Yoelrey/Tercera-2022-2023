package Herencia;

public class Libro extends Publicacion{

	//atributos
	public String TipoPortada;
	public String ISBN;
	public String NombreAutor;
	public String Editorial;
	
	
	@Override
	public String toString() {
		return "Libro [TipoPortada=" + TipoPortada + ", ISBN=" + ISBN + ", NombreAutor=" + NombreAutor + ", Editorial="
				+ Editorial + ", Titulo=" + Titulo + ", NumeroDePaginas=" + NumeroDePaginas + ", Precio=" + Precio
				+ "]";
	}
	public Libro(String tipoPortada, String iSBN, String nombreAutor, String editorial, String titulo) {
		super();
		TipoPortada = tipoPortada;
		ISBN = iSBN;
		NombreAutor = nombreAutor;
		Editorial = editorial;
		Titulo = titulo;
	}
	public Libro(int i, float f, String string, String string2, String string3, String string4, String string5) {
		super();
		// TODO Auto-generated constructor stub
	}
	public Libro(int numeroDePaginas, float precio) {
		super(numeroDePaginas, precio);
		// TODO Auto-generated constructor stub
	}
	public String Titulo;
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getTipoPortada() {
		return TipoPortada;
	}
	public void setTipoPortada(String tipoPortada) {
		TipoPortada = tipoPortada;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getNombreAutor() {
		return NombreAutor;
	}
	public void setNombreAutor(String nombreAutor) {
		NombreAutor = nombreAutor;
	}
	public String getEditorial() {
		return Editorial;
	}
	public void setEditorial(String editorial) {
		Editorial = editorial;
	}
	
	
}
