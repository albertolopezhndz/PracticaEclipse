package Password;

public class Programa {
	
	public static void main(String[] args) {
		Password p1=new Password("abcdef");
		Password p2=new Password("minecraft");
		
		p1.generarPassword("abcdef");
		p2.generarPassword("minecraft");
		
		System.out.println(p1);
		System.out.println(p2);
		
		if (p1.getLongitud()==p1.getContraseña().length()) {
			System.out.println("Contraseña 1: correcta.");
		}
		else {
			System.out.println("Contraseña 1: incorrecta.");
		}
		
		if (p2.getLongitud()==p2.getContraseña().length()) {
			System.out.println("Contraseña 2: correcta.");
		}
		else {
			System.out.println("Contraseña 2: incorrecta.");
		}
	}
}
