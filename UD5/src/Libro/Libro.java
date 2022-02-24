package Libro;

public class Libro {

	String ISBN;
	String Título;
	String Autor;
	int Pags;
	
	//Métodos
	
	//Constructor
	public Libro(String iSBN, String título, String autor, int pags) {
		super();
		ISBN = iSBN;
		Título = título;
		Autor = autor;
		Pags = pags;
	}
	
	//Getters y setters
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTítulo() {
		return Título;
	}

	public void setTítulo(String título) {
		Título = título;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public int getPags() {
		return Pags;
	}

	public void setPags(int pags) {
		Pags = pags;
	}
	
	//ToString
	@Override
	public String toString() {
		return "El libro " +Título+ " con ISBN " +ISBN+ " creador por " +Autor+ " tiene " +Pags+ " páginas.";
	}
	
	
	
}
