import javax.swing.JOptionPane;
class ejemplowhile{
	public static void main(String[] args) {

		int precioproducto = 3;
		int total=0;

		while(precioproducto>0) {
			precioproducto = Integer.parseInt( JOptionPane.showInputDialog("Precio del producto:"));
			total=total+precioproducto;
			
		}
		System.out.println("El total es de "+total);

System.out.println("  gracias por su compra");


	}
}
