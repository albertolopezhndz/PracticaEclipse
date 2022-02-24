package Password;

public class Password {

	private String contraseña;
	private int longitud=8;


	//Métodos
	//Constructor
	public Password(String contraseña) {
		this.contraseña = contraseña;
	}
	//Getters y Setters
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
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
		return "Password [contraseña=" + contraseña + "]";
	}
	
	//Generar contraseña.
	public String generarPassword(String contraseña) {
		this.contraseña=(contraseña.substring(0, 2)).toUpperCase()+contraseña.substring(2, contraseña.length())+(int)(1+Math.random()*99);
			return contraseña;
		}

	
}

