import javax.swing.JOptionPane;
public class telefono{

public String marca;
public int precio;
public teclado te;
public pantalla panta = new pantalla();
public audifonos audi;
public String tipo;

public telefono(String tipo){
	marca = JOptionPane.showInputDialog("¿Que marca es el telefono?:");
	precio = Integer.parseInt(JOptionPane.showInputDialog("¿Que precio es el telefono?:"));
	te = new teclado();
	this.tipo = tipo;
}



public void llamar(){
  System.out.println(panta.mensajemarcacion(te.marcar()));
}

public void usaraudifonos(){
	if (audi== null) {
		System.out.println("esta cosa no tiene audifonos");
	}else{
		audi.escucharmusica();
	}
}

public String toString(){
	return "el tipo de telefono es: "+tipo +"  la marca es: "+ marca+ " el precio es : $"+precio;
}


}
