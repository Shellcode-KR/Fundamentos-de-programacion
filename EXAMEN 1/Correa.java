import javax.swing.JOptionPane;
public class Correa{
	public String existe,si="si",no="no";
	public Correa(){
		try{
			
			existe=JOptionPane.showInputDialog("¿Tiene correa tu lampara? \n Solo escribe si o no");
			if( existe.equalsIgnoreCase(si)==false||existe.equalsIgnoreCase(no)==false) {
				System.out.println("Solo escribe si o no"); 
			}
		
		if(existe.equalsIgnoreCase(si)){
			existe="La lampara tiene Correa";
		}else{
			existe="La lampara no tiene correa";
		}
	}
	catch(Exception a){
	System.err.println("");
		}
	}
		
	public String toString(){
		return existe;
	}
}