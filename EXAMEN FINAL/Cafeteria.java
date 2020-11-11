import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.io.*;

public class Cafeteria{
	public  ArrayList<Empleado>  c_Empleados = new ArrayList<Empleado>();
	public  ArrayList<Cliente>  c_Clientes = new ArrayList<Cliente>();

	public Cafeteria(){
		c_Empleados.add(new Empleado("El","Boss","THE HELL",6660006660L,666));
	}

	public void crearCliente(){
		int eleccion=9;
		while (eleccion!=0) {			
		  try {
			eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿ESTATUS DEL CLIENTE?\n 1.- GENERAL \n 2.- FRECUENTE \n 3.- PLATINO"));
		if (eleccion==1) {
			c_Clientes.add(new General());
			break;
		}
		if (eleccion==2) {
			c_Clientes.add(new Frecuente());
			break;
		}
		if (eleccion==3) {
			c_Clientes.add(new Platino());
			break;
		}
		if(eleccion!=1&&eleccion!=2&&eleccion!=3){
			System.err.println("Solo puedes elegir los tipos disponibles");
		}
		    
		  } catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  }
		  
		  }
		 System.out.println("Bienvenido cliente nuevo");
	}

	public void crearEmpleado(){
		c_Empleados.add(new Empleado());
	}

	public void mostrarClientes(){
		if(c_Clientes.size()==0){
			System.out.println("NO HAY CLIENTES");
		}
		for (int i =0;i<c_Clientes.size() ;i++ ) {
			System.out.println("\n\nCliente numero : "+ i +"\n");
			System.out.println(c_Clientes.get(i));
		}
	}

	public void mostrarEmpleados(){
		for (int i =0;i<c_Empleados.size() ;i++ ) {
			System.out.println("\n\nEmpleado numero : "+ i +"\n");
			System.out.println(c_Empleados.get(i));
		}
	}

	public void actualizarClientes(){
		mostrarClientes();
		int eleccion=9;
		if(c_Clientes.size()==0){
			System.out.println("NO HAY CLIENTES");
			eleccion=0;
		}
		while (eleccion!=0) {			
		  try {
			eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Que cliente desea actualizar"));
		      
		  } catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		 }
		}
		 int opciones=9;
		while (opciones!=0) {			
		  try {
			opciones = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea hacer?\n 1.- Actualizar Estatus del Cliente \n 2.- Actualizar Domicilio\n 0.- Salir"));
		      
		    } catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  }
		if(opciones==1){
			int op2=9;
			while(op2!=0){
				try{
					op2=Integer.parseInt(JOptionPane.showInputDialog("¿CUAL ES EL NUEVO ESTATUS?\n 1.- GENERAL \n 2.- FRECUENTE \n 3.- PLATNO \n 0.- Salir")); 
				}catch(Exception q){
		  		 System.err.println("¡SOLO PUEDES INSERTAR NUMEROS DE LIBROS EXISTENTES!");
		  		}

		  	if(op2==1){
		  		c_Clientes.get(eleccion).tipo = "General";
		  	}
		  	if(op2==2){
		  		c_Clientes.get(eleccion).tipo = "Frecuente";
		  	}
		  	if(op2==3){
		  		c_Clientes.get(eleccion).tipo = "Platino";
		  	}

			System.out.println("Cambiaste exitosamente el estatus del cliente");op2=0;opciones=0;
		  
			}
		}
		if(opciones==2){
			c_Clientes.get(eleccion).direccion=(JOptionPane.showInputDialog("¿CUAL ES LA NUEVA DIRECCION DEL CLIENTE?"));
			opciones=0;

		}

		}				
		  }
		 
	public void actualizarEmpleados(){
		mostrarEmpleados();
		int eleccion=9;
		while (eleccion!=0) {			
		  try {
			eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Que Empleado desea actualizar"));
		      
		  } catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		 }
		  try{
		  c_Empleados.get(eleccion).salario = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es el nuevo salario del empleado?"));
			 System.out.println("Cambiaste exitosamente el salario del empleado");break;}
		  catch(Exception q){
		  	 System.err.println("¡SOLO PUEDES INSERTAR EMPLEADOS EXISTENTES!");
		  }
		}
	}

	public void borrarCliente(){
		mostrarClientes();
		int eleccion=9;
		while (eleccion!=0) {			
		  try {
			eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Que Cliente desea eliminar?"));
		      
		    
		  } catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  }
		c_Clientes.remove(eleccion);
		System.out.println("POR LA SANTA INQUISICION DESAPARECIMOS ESTE CLIENTE");
		}
	}
	public void borrarEmpleado(){
		mostrarEmpleados();
		int eleccion=9;
		while (eleccion!=0) {			
		  try {
			eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Que Empleado desea eliminar?"));
		      
		    
		  } catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  }
		 if(eleccion==0){
		 	System.out.println("UN MORTAL NO PUEDE ELIMINAR AL BOOS");
		 	break;
		 }
		c_Clientes.remove(eleccion);
		System.out.println("POR LA SANTA INQUISICION DESAPARECIMOS ESTE EMPLEADO");
		}

	}
	

	public void nuevapersona(){
		int eleccion=9;
			while (eleccion!=0) {			
		  try {
			eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea crear?\n"+
				" 1.- Nuevo Cliente \n 2.- Nuevo Empleado"));
		      
		    } catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  }
		  if(eleccion==1){
		  	crearCliente();break;
		  }
		  if(eleccion==2){
		  	crearEmpleado();break;
		  }
		  System.err.println("SOLO PUEDES INSERTAR LAS OPCIONES DISPONIBLES");
		}
	}

	public void mostrartodo(){
		int eleccion=9;
			while (eleccion!=0) {			
		  try {
			eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿QUE DESEA VISUALIZAR?\n"+
				" 1.- Mostrar Empleados\n 2.- Mostrar Clientes"));
		      
		    } catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  }
		  if(eleccion==1){
		  	mostrarEmpleados();break;
		  }
		  if(eleccion==2){
		  	mostrarClientes();break;
		  }
		  System.err.println("SOLO PUEDES INSERTAR LAS OPCIONES DISPONIBLES");
		}
	}

	public void actualizarpersona(){
		int eleccion=9;
			while (eleccion!=0) {			
		  try {
			eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Que persona desea actualizar?\n"+
				" 1.- Actualizar Cliente \n 2.- Actualizar Empleado"));
		      
		    } catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  }
		  if(eleccion==1){
		  	actualizarClientes();break;
		  }
		  if(eleccion==2){
		  	actualizarEmpleados();break;
		  }
		  System.err.println("SOP PUEDES INSERTAR LAS OPCIONES DISPONIBLES");
		}
	}

	public void borrarpersona(){
		int eleccion=9;
			while (eleccion!=0) {			
		  try {
			eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea crear?\n"+
				" 1.- Borrar Cliente \n 2.- Borrar Empleado"));
		      
		    } catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  }
		  if(eleccion==1){
		  	borrarCliente();break;
		  }
		  if(eleccion==2){
		  	borrarEmpleado();break;
		  }
		  System.err.println("SOP PUEDES INSERTAR LAS OPCIONES DISPONIBLES");
		}
	}

	public void informeclientes(){
     File f = new File("clientes.txt");

     String s="";

   		for (int j =0;j<c_Clientes.size();j++){
		s+=c_Clientes.get(j).toString();
		s+="\n";
    	}

     try{
     FileWriter w = new FileWriter(f);
     BufferedWriter bw = new BufferedWriter(w);
     PrintWriter wr = new PrintWriter(bw);

     wr.write(s);//escribimos en el archivo

     //wr.append(" - y aqui continua"); //concatenamos en el archivo sin borrar lo existente
     //wr.append(s);

             //ahora cerramos los flujos de gcanales de datos, al cerrarlos el archivo quedará uardado con información escrita

             //de no hacerlo no se escribirá nada en el archivo

     wr.close();
     bw.close();
     }catch(IOException e){};

	}

	public void informeEmpleados(){
     File f = new File("Empleados.txt");

     String s="";

   		for (int j =0;j<c_Empleados.size();j++){
		s+=c_Empleados.get(j).toString();
		s+="\n";
   	 }

     try{
     FileWriter w = new FileWriter(f);
     BufferedWriter bw = new BufferedWriter(w);
     PrintWriter wr = new PrintWriter(bw);

     wr.write(s);//escribimos en el archivo

     //wr.append(" - y aqui continua"); //concatenamos en el archivo sin borrar lo existente
     //wr.append(s);

             //ahora cerramos los flujos de gcanales de datos, al cerrarlos el archivo quedará uardado con información escrita

             //de no hacerlo no se escribirá nada en el archivo

     wr.close();
     bw.close();
     }catch(IOException e){};

	}

	public void leerClientes(){
      File archivo ;
      FileReader fr ;
      BufferedReader br ;

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("clientes.txt");//("C:\\archivo.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null){
            System.out.println(linea);
         }
          br.close();
          fr.close();

      }
      catch(IOException e){};
 	}


 	public void leerEmpleados(){
      File archivo ;
      FileReader fr ;
      BufferedReader br ;

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("Empleados.txt");//("C:\\archivo.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null){
            System.out.println(linea);
         }
          br.close();
          fr.close();

      }
      catch(IOException e){};
 	}

 	public void informes(){
 		int eleccion=9;
			while (eleccion!=0) {			
		  try {
			eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea hacer?\n"+
				" 1.- Guardar Informes \n 2.- Leer Informes"));
		      
		    } catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  }
		  if(eleccion==1){
		  	int opc=9;
			while (opc!=0) {			
		  		try {
				opc = Integer.parseInt(JOptionPane.showInputDialog("¿Que informe desea guardar?\n"+
					" 1.- Clientes \n 2.- Empleados"));
		      
		    	} catch (NumberFormatException a){
		    	System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  		}
		  		if(opc==1){
		  			informeclientes();break;
		  		}
		  		if(opc==2){
		  			informeEmpleados();break;
		  		}
		  		if(opc!=1 && opc!=2){
		  		System.out.println("Solo puedes insertar las opciones disponibles");
		  		}
		  	}
		  }
		  if(eleccion==2){
		  	int opc2=9;
			while (opc2!=0) {			
		  		try {
				opc2 = Integer.parseInt(JOptionPane.showInputDialog("¿Que informe desea leer?\n"+
					" 1.- Clientes \n 2.- Empleados"));
		      
		    	} catch (NumberFormatException a){
		    	System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  		}
		  		if(opc2==1){
		  			leerClientes();break;
		  		}
		  		if(opc2==2){
		  			leerEmpleados();break;
		  		}
		  		if(opc2!=1 && opc2!=2){
		  	 		System.out.println("Solo puedes insertar las opciones disponibles");
				}
		  }
		  if(eleccion!=1 && eleccion!=2){
		  	System.err.println("SOLO PUEDES INSERTAR LAS OPCIONES DISPONIBLES");
		}
		}
 		}
 	}

 	public void guardarcliente_objeto(){
		try{
    		FileOutputStream fs = new FileOutputStream("cliente.cl");//Creamos el archivo
    		ObjectOutputStream os = new ObjectOutputStream(fs);//Esta clase tiene el método writeObject() que necesitamos
    		for (int i=0;i<c_Clientes.size();i++ ) {
				os.writeObject(c_Clientes.get(i));
				//El método writeObject() serializa el objeto y lo escribe en el archivo
    		}

    		os.close();//Hay que cerrar siempre el archivo
  		}catch(FileNotFoundException e){
    	e.printStackTrace();
  		}catch(IOException e){
    	e.printStackTrace();
  		}
	}

	public void guardarempleado_objeto(){
		try{
    		FileOutputStream fs = new FileOutputStream("empleado.em");//Creamos el archivo
    		ObjectOutputStream os = new ObjectOutputStream(fs);//Esta clase tiene el método writeObject() que necesitamos
    		for (int i=1;i<c_Empleados.size();i++ ) {
				os.writeObject(c_Empleados.get(i));
				//El método writeObject() serializa el objeto y lo escribe en el archivo
    		}

    		os.close();//Hay que cerrar siempre el archivo
  		}catch(FileNotFoundException e){
    	e.printStackTrace();
  		}catch(IOException e){
    	e.printStackTrace();
  		}
	}

	public void leercliente_objeto(){
		try{
  			FileInputStream fis = new FileInputStream("cliente.cl");
  			ObjectInputStream ois = new ObjectInputStream(fis);

  			//El método readObject() recupera el objeto
  			Object elemento;
			while((elemento=ois.readObject())!=null){
      		c_Clientes.add((Cliente) elemento);
   			}

  			ois.close();
  			fis.close();
		}catch(Exception e){
  		//e.printStackTrace();
		}
	}

	public void leerempleado_objeto(){
		try{
  			FileInputStream fis = new FileInputStream("empleado.em");
  			ObjectInputStream ois = new ObjectInputStream(fis);

  			//El método readObject() recupera el objeto
  			Object elemento;
			while((elemento=ois.readObject())!=null){
      		c_Empleados.add((Empleado) elemento);
   			}

  			ois.close();
  			fis.close();
		}catch(Exception e){
  		//e.printStackTrace();
		}
	}

 	public void objetoscm(){
 		int eleccion=9;
			while (eleccion!=0) {			
		  try {
			eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea hacer?\n"+
				" 1.- Guardar Objetos \n 2.- Leer Objetos"));
		      
		    } catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  }
		  if(eleccion==1){
		  	int opc=9;
			while (opc!=0) {			
		  		try {
				opc = Integer.parseInt(JOptionPane.showInputDialog("¿Que objetos desea guardar?\n"+
					" 1.- Clientes \n 2.- Empleados"));
		      
		    	} catch (NumberFormatException a){
		    	System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  		}
		  		if(opc==1){
		  			guardarcliente_objeto();break;
		  		}
		  		if(opc==2){
		  			guardarempleado_objeto();break;
		  		}
		  		if(opc!=1 && opc!=2){
		 	  		System.out.println("Solo puedes insertar las opciones disponibles");

		  		}
		  	}
		  }
		  if(eleccion==2){
		  	int opc2=9;
			while (opc2!=0) {			
		  		try {
				opc2 = Integer.parseInt(JOptionPane.showInputDialog("¿Que objeto desea leer?\n"+
					" 1.- Clientes \n 2.- Empleados"));
		      
		    	} catch (NumberFormatException a){
		    	System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  		}
		  		if(opc2==1){
		  			leercliente_objeto();break;
		  		}
		  		if(opc2==2){
		  			leerempleado_objeto();break;
		  		}
		  		if(opc2!=1 &&opc2!=2){
		  			System.out.println("Solo puedes insertar las opciones disponibles");
		  		}
		  	}
		  }
		  if(eleccion!=1 && eleccion!=2){
		  	System.err.println("SOLO PUEDES INSERTAR LAS OPCIONES DISPONIBLES");
			}
			
 		}
 	}

	public void menuprincipal(){
		int eleccion=9;
			while (eleccion!=0) {			
		  try {
			eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea hacer?\n"+
				" 1.- Nuevo Cliente o Empleados \n 2.- Mostrar Clientes o Empleados \n"+" 3.- Actualizar Clientes o Empleados\n"+
				" 4.- Borrar Clientes o Empleados\n 5.- Guardar/Leer Informe de Empleados/Clientes\n"+
				" 6.-Guardar/Leer Objetos Clientes/Empleados\n 0.- Salir"));
		      
		    } catch (NumberFormatException a){
		    System.err.println("¡SOLO PUEDES INSERTAR NUMEROS!");
		  }
		
		
		 switch (eleccion) {

            	case 1: nuevapersona();	break;
            	case 2: mostrartodo(); break;
            	case 3: actualizarpersona();	break;
            	case 4: borrarpersona();	break;
            	case 5: informes(); break;
            	case 6: objetoscm(); break;
            	case 0: break;
        	    default: System.out.println ("Elige solo un numero de lo tipos disponibles"); break;
		}
	}
	}
	public static void main(String[] args){
		Cafeteria cf1 = new Cafeteria();
		cf1.leercliente_objeto();
		cf1.leerempleado_objeto();
		cf1.menuprincipal();
		
	
	}
}
