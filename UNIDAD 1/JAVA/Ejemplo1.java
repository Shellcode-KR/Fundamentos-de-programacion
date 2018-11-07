import javax.swing.JOptionPane;
class ejemplo1{
	public static void main(String[] args) {

		int precioproducto = 3;
		int total=0;

		for (int contador=0; contador<4; contador=contador+1) {
			precioproducto = Integer.parseInt( JOptionPane.showInputDialog("Precio del producto:"));
			total=total+precioproducto;
			System.out.println(total);
		}

System.out.println("gracias por su compra");

	}
}
