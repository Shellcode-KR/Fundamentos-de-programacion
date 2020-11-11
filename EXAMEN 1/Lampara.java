import javax.swing.JOptionPane;
public  abstract class Lampara implements Comparable{
	public int precio;
	public String marca,tipo;
	public Bateria duracell;
	public Correa correa;

	public Lampara(String tipo){
		while (precio==0) {			
		  try {
			precio = Integer.parseInt(JOptionPane.showInputDialog("¿Que precio tiene la lampara ?:"));
		      
		   }catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  
		  }
		}
		marca = JOptionPane.showInputDialog("¿Que marca es la lampara ?:");
		duracell =new Bateria();
		this.tipo = tipo;

	}
	public void iluminar(){
		if(duracell.carga1>=5){
			System.out.println("Estoy iluminando");
		}
		else{
			System.out.println("No tengo carga :(");
		}
	}
	public String toString(){
		return "MARCA: "+marca+"\nPRECIO: "+precio+"\n "+"TIPO: "+tipo+"\n"+correa;
	}

	public boolean equals(Object x){
	    boolean resultado= false;

    if (this.precio == ((Lampara)x).precio) {
    	resultado= true;
    }

    if (this.precio != ((Lampara)x).precio) {
    	resultado= false;
    }
	return resultado;
	}

	public int compareTo(Lampara x){
    int resultado = 0;
    if (this.precio < ((Lampara) x).precio ) {
     resultado= 1;
    }

    if (this.precio > ((Lampara) x).precio ) {
     resultado= -1;
    }

    if (this.precio == ((Lampara) x).precio ) {
     resultado= 0;
    }
    return  resultado;


}
}