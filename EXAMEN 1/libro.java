import javax.swing.JOptionPane;
public class libro{
	String nombre, autor, editorial;
	int precio;
	public libro(){
	nombre = JOptionPane.showInputDialog("¿Cual es el nombre del libro?");
	autor = JOptionPane.showInputDialog("¿Quien es el autor del libro?");
	editorial = JOptionPane.showInputDialog("¿Que editorial imprimio el libro?:");
	while (precio==0) {			
		  try {
			precio = Integer.parseInt(JOptionPane.showInputDialog("¿Que precio es el libro ?:"));
		      
		   }catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  
		  }
		}
	System.out.println("Creaste un libro del demonio  \n!FELICIDADES!");
}
	public void leer(){
		System.out.println("ME ESTAN LEYENDO AYUDA!!");
	}
	public String toString(){
		return ("NOMBRE: "+nombre+ "\nAUTOR: "+autor+"\nEDITORIAL: "+editorial+"\nPRECIO: "+precio);

	}
}