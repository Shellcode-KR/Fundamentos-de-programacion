import java.util.*; 
 
public class NumeroFeliz { 
 
    public static void main(String[] args) { 
         
        Scanner entrada = new Scanner(System.in); 
         
        //PIDO UN VALOR AL USUARIO Y LO PASO COMO STRING PARA APLICARLE CADENAS Y CREO UNA COPIA PARA HACER USO DE ELLA YA QUE 
        //EL VALOR ORIGINAL CAMBIARA DURANTE LA EJECUCION DEL PROGRAMA. 
        System.out.println("Ingrese un numero : "); 
        String valor = entrada.nextLine(); 
        String copia = valor; 
         
        //CREO UN ARREGLO DE ENTEROS PARA GUARDAR LOS NUMEROS QUE ME VAYA ARROJANDO EL CICLO 
        ArrayList<Integer> Vector = new ArrayList<Integer>(); 
         
        int suma; 
         
        do { 
             
            suma = 0; 
            //RECORRO LA CADENA PARA TOMAR ELEMENTO POR ELEMENTO Y ELEVARLO AL CUADRADO Y SUMARLO COMO PIDE LA FORMULA 
            for(int i = 0; i < valor.length(); i++){ 
                 
                double numero = Double.parseDouble("" + valor.charAt(i)); //LO CONVIERTO DE CHAR A DOUBLE PARA  
                //PASARLO POR EL METODO POW Y SACAR SU CUADRADO 
                 
                suma = suma + (int)Math.pow(numero, 2); //SUMO  
                 
            } 
             
            //AHORA REVISO SI LA SUMA QUE HICE SE ENCUENTRA EN EL ARREGLO DE VALORES QUE ME VA ARROJANDO EL CICLO 
            //Y SI SE REPITE SIGNIFICA QUE CAYO EN UN CICLO INFINITO Y SI CAE EN UN CICLO  
            // INFINITO SIGNIFICA QUE NO ES UN NUMERO FELIZ, SINO EXISTE SIGUE AGREGANDO AL ARREGLO. 
            if(Vector.contains(suma)){ 
                suma = -1; 
            }else if(!Vector.contains(suma)){ 
                Vector.add(suma); 
                valor = String.valueOf(suma); 
            } 
             
            //SI LA SUMA LLEGA A DAR 1 O -1 ENTONCES SE SALE DEL CICLO DO. 
        } while (suma != 1 && suma != -1); 
         
         
        //Y POR FIN REVISA SI ES NUMERO FELIZ O INFELIZ 
        if(suma == 1){ 
        System.out.println("Numero " + copia + " es un numero feliz" ); 
        }else if(suma == -1){ 
        System.out.println("Numero " + copia + " es un numero infeliz" ); 
        } 
         
         
         
    } 
} 