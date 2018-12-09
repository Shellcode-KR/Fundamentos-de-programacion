import java.util.*; 

public class ConjeturaCollatz {
	/* para que esto funcione lo dividire en pasos
	para que le entiendas si lo vez en un blog, github o te vendi el codigo
	INTRODUCIR "N" NUMERO
	SI N ES PAR SE DIVIDE ENTRE DE 2
	SI N ES IMPAR SE MULTIPLICA POR 3 Y SE LE SUMA 1
	REPETIR HASTA QUE SEA 1
	(SERAN PUROS CICLOS Y RECICLADERA DE CODIGO)

	AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA MI PICHULA
	*/

//ME-ODO MAIN AQUI SE HACE LA MAGIA PRRO
	public static void main(String[] args) {
		ConjeturaCollatz conjetura =new ConjeturaCollatz();
		conjetura.imprimirConjetura();


		
	}

	//INTRODUIR NUMERO POR TECLADO-- metodo
	public int leerNumero(){
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		return n;

	}
//el metodo de la conjetura
	public int conjeturaCollatz(int n) {
		System.out.print(n);
		if(n != 0){
		while(n != 1) {
			if(n%2==0){
			n=n/2;

			//es para que salga impreso en una sola linea
			System.out.print(" "+n+" ");

			}else{
				n= (n*3)+1;
				System.out.print(" "+n);

			}

		}
		return n;
	}else{
		System.out.println("NO SE PUEDE CON CERO, ESTAS LOCO");
		return n;
	}

	}

	//metodo para imprimir
	public void imprimirConjetura(){
		ConjeturaCollatz numero = new ConjeturaCollatz();
		System.out.println("ingrese un numero para evaluar");
		//guardaremos el numero ingresado en n
		int n = leerNumero();
//el  numero sera parametro para realizar la conjetura
		numero.conjeturaCollatz(n);
		System.out.println(" ");

	}
}