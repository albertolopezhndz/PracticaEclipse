package Libro;

public class Libro {

	String ISBN;
	String T�tulo;
	String Autor;
	int Pags;
	
	//M�todos
	
	//Constructor
	public Libro(String iSBN, String t�tulo, String autor, int pags) {
		super();
		ISBN = iSBN;
		T�tulo = t�tulo;
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

	public String getT�tulo() {
		return T�tulo;
	}

	public void setT�tulo(String t�tulo) {
		T�tulo = t�tulo;
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
		return "El libro " +T�tulo+ " con ISBN " +ISBN+ " creador por " +Autor+ " tiene " +Pags+ " p�ginas.";
	}
	
	
	
}
