import javax.swing.JOptionPane;
class ejemplokilometros{
	public static void main(String[] args) {

		int kilometros = 0;
		int litros=0;


		kilometros = Integer.parseInt( JOptionPane.showInputDialog("Escriba los kilometros recorridos:"));

		while(kilometros>0){
			litros = Integer.parseInt( JOptionPane.showInputDialog("Escriba los litros usados:"));
double kilometroslitro = kilometros/litros;


System.out.println(" los kilometros por litro son: "+ kilometroslitro);
kilometros = Integer.parseInt( JOptionPane.showInputDialog("Escriba los kilometros recorridos:"));
		}



	}
}
