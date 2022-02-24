package Password;

public class Password {

	private String contrase�a;
	private int longitud=8;


	//M�todos
	//Constructor
	public Password(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	//Getters y Setters
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Password [contrase�a=" + contrase�a + "]";
	}
	
	//Generar contrase�a.
	public String generarPassword(String contrase�a) {
		this.contrase�a=(contrase�a.substring(0, 2)).toUpperCase()+contrase�a.substring(2, contrase�a.length())+(int)(1+Math.random()*99);
			return contrase�a;
		}

	
}

