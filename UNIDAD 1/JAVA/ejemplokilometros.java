class ejemplokilometros{
	public static void main(String[] args) {

		int kilometros = 0;
		int litros=0;


	int kilometros = 0;
	int litros=0;
	int veces=0;
    double totalkl = 0.0;

	kilometros = Integer.parseInt( JOptionPane.showInputDialog("Escriba los kilometros recorridos:"));

	while(kilometros>0){
		litros = Integer.parseInt( JOptionPane.showInputDialog("Escriba los litros usados:"));
		double kilometroslitro = kilometros/litros;
		totalkl= totalkl+kilometroslitro;
		veces = veces+1;
		System.out.println(" los kilometros por litro son: "+ kilometroslitro);
		kilometros = Integer.parseInt( JOptionPane.showInputDialog("Escriba los kilometros recorridos:"));
	}

		while(kilometros>0){
			litros = Integer.parseInt( JOptionPane.showInputDialog("Escriba los litros usados:"));
double kilometroslitro = kilometros/litros;


System.out.println(" los kilometros por litro son: "+ kilometroslitro);
kilometros = Integer.parseInt( JOptionPane.showInputDialog("Escriba los kilometros recorridos:"));
		}



double resultado = totalkl/veces;
System.out.println("el promedio total de kilometros recorridos es: "+ resultado);
	}
}
