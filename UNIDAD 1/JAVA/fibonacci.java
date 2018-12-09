import javax.swing.JOptionPane;
import java.lang.Math;
class fibonacci{
	public static void main(String[] args) {
		//si la serie fibonacci comienza en 0 nf1=0 si comienza en 1 nf1=1
		int nnumero = 0;
		long nf1 = 1;
		long nf2 = 1;
		long nf3 = 0;
		int contador = 0;

		contador = Integer.parseInt( JOptionPane.showInputDialog("¿Que numero de la sucesion fibonacci quieres?\nSolo numeros entre 1 y 100"));


		if(contador > 0 && contador < 101){
			for(nnumero = 0; nnumero < contador; nnumero++){
				if(nnumero<contador-1){
					nf3 = nf1 + nf2;
					nf1 = nf2;
					nf2 = nf3;

				}
				else{
					System.out.print(nf1);
				}

			}
			System.out.println("");
		}
		else{
			System.out.println("SOLO NUMEROS ENTRE 1 Y 100");
		}
}
}