import javax.swing.JOptionPane;

public class Laptop{
	public int precio,ram;
	public String marca,modelo,procesador,tipo;
	public Bateria duradura;

	public Laptop(String tipo){
		while (precio==0) {			
		  try {
			precio = Integer.parseInt(JOptionPane.showInputDialog("¿Que precio tendra la computadora ?:"));
		      
		   }catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  
		  }
		  while (precio==0) {			
		  try {
			ram = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanta Ram tendra la computadora ?:"));
		      
		   }catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  
		  }

		}
		marca = JOptionPane.showInputDialog("¿Que marca es la computadora ?:");
		procesador = JOptionPane.showInputDialog("¿Que procesador tiene la computadora ?:");
		duradura =new Bateria();
		this.tipo = tipo;
		}
	}
	public void usarcompu(){
		if(duradura.carga1>=5){
			System.out.println("Me estan usando");
		}
		else{
			System.out.println("No puedo prender\nNo tengo carga :");
		}
	}
	public String toString(){
		return marca+" "+modelo+"\nPROCESADOR: "+procesador+"\nRAM: "+ram+"\nPRECIO: "+precio+duradura;
	}
}