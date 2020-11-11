import javax.swing.JOptionPane;
import java.io.*;
public class Cliente implements Serializable{
	public String nombre, apellido, direccion,tipo;

	public Cliente(String tipo){
		nombre = JOptionPane.showInputDialog("¿NOMBRE DEL CLIENTE?");
		apellido = JOptionPane.showInputDialog("¿APELLIDO DEL CLIENTE?");
		direccion = JOptionPane.showInputDialog("¿DIRECCION DEL CLIENTE?");
		this.tipo = tipo;
	}
	public String toString(){
		return "CLIENTE: "+tipo+"\n"+nombre+" "+apellido+"\n"+"Direccion: "+direccion+"\n";
	}
}