import javax.swing.JOptionPane;

public class Bateria{
	public int carga;
	public int carga1;

	public Bateria(){
		while (carga==0) {			
		  try {
			carga = Integer.parseInt(JOptionPane.showInputDialog("¿Que carga tendra la bateria?\nSolo numeros del 1 al 100"));
			 carga1=carga;
		  if(carga1==0){
			System.out.println("La Bateria que creaste no tiene carga");break;
		  }
		  if(carga1<0||carga1>100){
		  	System.err.println("¡SOLO NUMEROS DEL 1 AL 100!");carga=0;
		  }		      
		   }catch (Exception a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  	
		  }
		 
		}
		System.out.println("La Bateria tiene "+carga1+"% de carga");
	}
	public String toString(){
		return "La Bateria tiene "+carga1+"% de carga";
	}



	}
