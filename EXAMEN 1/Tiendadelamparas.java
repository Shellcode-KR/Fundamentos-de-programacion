import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.*;
public class Tiendadelamparas{
	public  ArrayList<Lampara>  conjunto_lamparas = new ArrayList<Lampara>();

public void crearLampara(){
		int eleccion=9;
		while (eleccion!=0) {			
		  try {
			eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Que lampara desea crear?\n 1.- Lampara de mano \n 2.- Lampara de mesa \n 3.- Lampara matamosquitos"));
		if (eleccion==1) {
			conjunto_lamparas.add(new demano());
			break;
		}
		if (eleccion==2) {
			conjunto_lamparas.add(new demesa());
			break;
		}
		if (eleccion==3) {
			conjunto_lamparas.add(new matainsectos());
			break;
		}
		if(eleccion!=1&&eleccion!=2&&eleccion!=3){
			System.err.println("Solo puedes elegir los tipos de lamparas disponibles");
		}
		    
		  } catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  }
		  
		  }
		 System.out.println("Creaste una lampara del demonio");
		}


public void mostrarLamparas(){
		ordenarLamparas();
		if(conjunto_lamparas.size()==0){
			System.out.println("NO HAY LAMPARAS");
		}




		for (int i =0;i<conjunto_lamparas.size() ;i++ ) {
			System.out.println("\n\nLibro numero : "+ i +"\n");
			System.out.println(conjunto_lamparas.get(i));
		}
	}


public void updateLamparas(){
		mostrarLamparas();
		int eleccion=9;
		if(conjunto_lamparas.size()==0){
			System.out.println("NO SE PUEDE ACTUALIZAR NADA");
			eleccion=0;
		}
		while (eleccion!=0) {			
		  try {
			eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Que lampara desea actualizar"));
		      
		    
		  } catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  }
		  try{
		  conjunto_lamparas.get(eleccion).precio = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es el nuevo precio de la lampara"));
			 System.out.println("Cambiaste exitosamente el precio de la lampara");break;}
		  catch(Exception q){
		  	 System.err.println("¡SOLO PUEDES INSERTAR NUMEROS DE LIBROS EXISTENTES!");
		  }
		  }
		 
		}


public void deleteLamparas(){
	
	mostrarLamparas();
		int eleccion=9;
		while (eleccion!=0) {			
		  try {
			eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Que lampara desea eliminar?"));
		      
		    
		  } catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  }
		conjunto_lamparas.remove(eleccion);
	System.out.println("POR LA SANTA INQUISICION ELIMINAMOS ESTA LAMPARA DEL DEMONIO");
		}
	}

	public void ordenarLamparas(){
	for (int j=0;j<conjunto_lamparas.size();j++ ) {

	for (int i=0;i<conjunto_lamparas.size()-1;i++ ) {

		if (conjunto_lamparas.get(i).compareTo(conjunto_lamparas.get(i+1))== 1 ) {
		Lampara temporal = conjunto_lamparas.get(i);
		conjunto_lamparas.set(i,conjunto_lamparas.get(i+1));
		conjunto_lamparas.set(i+1,temporal);
	}
   }
}
}



	public void UsarLampara(){
		 mostrarLamparas();
		int eleccion=9;
		while (eleccion!=0) {			
		  try {
			eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Que libro desea leer?"));
		      
		    
		  } catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  }
		  conjunto_lamparas.get(eleccion).iluminar();

		}
	}
	public void menuprincipal(){
		int eleccion=9;
			while (eleccion!=0) {			
		  try {
			eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea hacer?\n 1.- crear lampara \n 2.- actualizar lampara \n 3.- eliminar lampara \n 4.- usar lampara\n 5.- mostrar las lamparas\n 0.- Salir"));
		      
		    } catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  }
		
		
		 switch (eleccion) {

            	case 1: crearLampara();	break;
            	case 2: updateLamparas(); break;
            	case 3: deleteLamparas();	break;
            	case 4: UsarLampara();	break;
            	case 5: mostrarLamparas();	break;
            	case 0: break;
        	    default: System.out.println ("Elige solo un numero de lo tipos disponibles"); break;
		}
	}
	}
	
	public static void main( String args[] ){
		Tiendadelamparas shellcode = new Tiendadelamparas();
		shellcode.menuprincipal();
}
}





		

	
