package Libro;

public class Programa {

	public static void main(String[] args) {
		Libro l1=new Libro("9788408249849", "La bestia", "Carmen lola", 544);
		Libro l2=new Libro("9788420460499", "El italiano", "Arturo P�rez-Reverte", 400);
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		
		System.out.println("");
		if (l1.getPags()>l2.getPags()) {
			System.out.println("El libro " +l1.getT�tulo()+ " tiene m�s p�ginas");
		}
		else {
			System.out.println("El libro " +l2.getT�tulo()+ " tiene m�s p�ginas");
		}
	}
}
