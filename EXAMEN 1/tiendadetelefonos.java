import javax.swing.JOptionPane;
import java.util.ArrayList;
public class tiendadetelefonos{

public  ArrayList<telefono>  conjunto_telefonos = new ArrayList<telefono>();

public void creartelefono(){
int eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Que telefono desea crear?\n 1.- crear movil \n 2.- crear decalle \n 3.- crear telefono fijo"));
		if (eleccion==1) {
			conjunto_telefonos.add(new celular());
		}
		if (eleccion==2) {
			conjunto_telefonos.add(new decalle());
		}
		if (eleccion==3) {
			conjunto_telefonos.add(new fijo());
		}

}



public void mostrartelefonos(){

for (int i =0;i<conjunto_telefonos.size() ;i++ ) {
	System.out.println("indice : "+ i +"\n");
	System.out.println(conjunto_telefonos.get(i));
}

}

public void actualizartelefono(){
int eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Que telefono desea actualizar"));
conjunto_telefonos.get(eleccion).precio = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es el nuevo precio del telefono"));
}
public void eliminartelefono(){
int eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Que telefono desea eliminar"));
conjunto_telefonos.remove(eleccion);
}
public void usartelefono(){
int eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Que telefono desea usar"));
conjunto_telefonos.get(eleccion).llamar();
}


public void menuprincipal(){
	while(true){
		int eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea hacer?\n 1.- crear telefono \n 2.- actualizar telefono \n 3.- eliminar telefono \n 4.- usar un telefono\n 5.- mostrar los telefonos"));
		if (eleccion==1) {
			creartelefono();
		}
		if (eleccion==2) {
			actualizartelefono();
		}
		if (eleccion==3) {
			eliminartelefono();
		}
		if (eleccion==4) {
			usartelefono();
		}
		if (eleccion==5) {
			mostrartelefonos();
		}
}

}


public static void main( String args[] ){
tiendadetelefonos tiendita1 = new tiendadetelefonos();
tiendita1.menuprincipal();
}


}
