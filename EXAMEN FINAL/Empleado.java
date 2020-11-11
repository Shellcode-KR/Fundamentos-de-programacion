import javax.swing.JOptionPane;
import java.io.*;


public class Empleado implements Serializable{

	private String nombre, apellido, direccion;
	private long telefono;
	public int salario;

	public Empleado(String nombre,String apellido,String direccion, Long telefono, int salario){
		this.nombre=nombre;
		this.apellido=apellido;
		this.direccion=direccion;
		this.telefono=telefono;
		this.salario=salario;
	}

	public Empleado(){
		nombre = JOptionPane.showInputDialog("¿NOMBRE DEL EMPLEADO?");
		apellido = JOptionPane.showInputDialog("¿APELLIDO DEL EMPLEADO?");
		direccion = JOptionPane.showInputDialog("¿DIRECCION DEL EMPLEADO?");
		while (telefono==0) {			
		  try {
			telefono = Long.parseLong(JOptionPane.showInputDialog("TELEFONO DEL EMPLEADO?"));
		      
		   }catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  
		  }
		}
		while (salario==0) {			
		  try {
			salario = Integer.parseInt(JOptionPane.showInputDialog("SALARIO DEL EMPLEADO?"));
		      
		   }catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  
		  }
		}

	}
	public String toString(){
		return "EMPLEADO: "+nombre+" "+apellido+"\n"+"Salario: $"+salario+".00\n"+telefono+"\n"+"Direccion: "+direccion+"\n";
	}

}