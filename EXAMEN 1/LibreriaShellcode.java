import javax.swing.JOptionPane;
import java.util.ArrayList;

public class LibreriaShellcode{
	public  ArrayList<libro>  nLibros = new ArrayList<libro>();
	public void crearLibro(){
		nLibros.add(new libro());
	}

	public void mostrarlibros(){
		if(nLibros.size()==0){
			System.out.println("NO HAY LIBROS");
		}
		for (int i =0;i<nLibros.size() ;i++ ) {
			System.out.println("\n\nLibro numero : "+ i +"\n");
			System.out.println(nLibros.get(i));
		}
	}
	public void updatelibro(){
		mostrarlibros();
		int eleccion=9;
		if(nLibros.size()==0){
			System.out.println("NO SE PUEDE ACTUALIZAR NADA");
			eleccion=0;
		}
		while (eleccion!=0) {			
		  try {
			eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Que libro desea actualizar"));
		      
		    
		  } catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  }
		  try{
		  nLibros.get(eleccion).precio = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es el nuevo precio del libro"));
			 System.out.println("Cambiaste exitosamente el precio del libro");break;}
		  catch(Exception q){
		  	 System.err.println("¡SOLO PUEDES INSERTAR NUMEROS DE LIBROS EXISTENTES!");
		  }
		  }
		 
		}
	public void deletelibro(){
	
	mostrarlibros();
		int eleccion=9;
		while (eleccion!=0) {			
		  try {
			eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Que libro desea eliminar?"));
		      
		    
		  } catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  }
		nLibros.remove(eleccion);
	System.out.println("POR LA SANTA INQUISICION SE QUEMO ESTE LIBRO");
		}
	}
	public void leerlibro(){
		 mostrarlibros();
		int eleccion=9;
		while (eleccion!=0) {			
		  try {
			eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Que libro desea leer?"));
		      
		    
		  } catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  }
		  nLibros.get(eleccion).leer();

		}
	}
	public void menuprincipal(){
		int eleccion=9;
			while (eleccion!=0) {			
		  try {
			eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea hacer?\n 1.- crear libro \n 2.- actualizar libro \n 3.- eliminar libro \n 4.- leer libro\n 5.- mostrar los libros\n 0.- Salir"));
		      
		    } catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  }
		
		
		 switch (eleccion) {

            	case 1: crearLibro();	break;
            	case 2: updatelibro(); break;
            	case 3: deletelibro();	break;
            	case 4: leerlibro();	break;
            	case 5: mostrarlibros();	break;
            	case 0: break;
        	    default: System.out.println ("Elige solo un numero de lo tipos disponibles"); break;
		}
	}
	}
	
	public static void main( String args[] ){
		LibreriaShellcode shellcode = new LibreriaShellcode();
		shellcode.menuprincipal();
}
}





		

	

