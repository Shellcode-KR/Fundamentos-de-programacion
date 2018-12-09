import javax.swing.JOptionPane;
import java.lang.Math;
class formulageneral{
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;

		a= Integer.parseInt( JOptionPane.showInputDialog("Ingrese el valor de a:"));
		b= Integer.parseInt( JOptionPane.showInputDialog("Ingrese el valor de b:"));
		c= Integer.parseInt( JOptionPane.showInputDialog("Ingrese el valor de c:"));

int res1= 4*a*c;
int res2 = (b*b)-res1;
double res3 = Math.sqrt(res2);
double res4 = -b + res3;
double res5 = res4/(2*a);
System.out.println("El resultado es: "+res5);
	}
}