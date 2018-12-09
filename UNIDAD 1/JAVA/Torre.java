import javax.swing.JOptionPane;
class Torre{
        public static void main(String[] args){

   int tablero [][] = new int [7][7];
      
       int fila_torre=Integer.parseInt(args[0]);
   int columna_torre=Integer.parseInt(args[1]);
   String puntofinal = "-01";


   for (int veces =0;veces<=1 ;veces++ ) {

        tablero[fila_torre][columna_torre]=9;

        tablero[fila_torre+1][columna_torre]=1;
        tablero[fila_torre+1][columna_torre]=1;
        tablero[fila_torre+3][columna_torre]=1;
        tablero[fila_torre+4][columna_torre]=1;
        tablero[fila_torre+5][columna_torre]=1;
        tablero[fila_torre+6][columna_torre]=1;

        tablero[fila_torre][columna_torre+1]=1;
        tablero[fila_torre][columna_torre+2]=1;
        tablero[fila_torre][columna_torre+3]=1;
        tablero[fila_torre][columna_torre+4]=1;
        tablero[fila_torre][columna_torre+5]=1;
        tablero[fila_torre][columna_torre+6]=1;

        tablero[fila_torre-1][columna_torre]=1;
        tablero[fila_torre-3][columna_torre]=1;
        tablero[fila_torre-4][columna_torre]=1;
        tablero[fila_torre-5][columna_torre]=1;
        tablero[fila_torre-6][columna_torre]=1;
        
        tablero[fila_torre][columna_torre-1]=1;
        tablero[fila_torre][columna_torre-2]=1;
        tablero[fila_torre][columna_torre-3]=1;
        tablero[fila_torre][columna_torre-4]=1;
        tablero[fila_torre][columna_torre-5]=1;
        tablero[fila_torre][columna_torre-6]=1;

      for (int fila=0;fila<8 ;fila++ ) {
        for (int columna=0;columna<8 ;columna++ ) {
            System.out.print(tablero[fila][columna]+" ");
        }
        System.out.print("\n");

      }
      System.out.print("\n");
      System.out.print("\n");

      int fila_movimiento=Integer.parseInt(args[2+(veces*2)]);
      int columna_movimiento =Integer.parseInt(args[3+(veces*2)]);


      //System.out.println("tablero["+fila_caballo+"+"+fila_movimiento+"]["+columna_caballo+"+"+columna_movimiento+"]"+tablero[fila_caballo+fila_movimiento][columna_caballo+columna_movimiento]);


       if (tablero[fila_torre+fila_movimiento][columna_torre+columna_movimiento]==1) {
            fila_torre +=fila_movimiento;
            columna_torre +=columna_movimiento;
            puntofinal= fila_torre+""+columna_torre;
            //System.out.println(puntofinal);
         }else{
            puntofinal= "-01";
            //System.out.println(puntofinal);
         }

      for (int fila=0;fila<8 ;fila++ ) {
            for (int columna=0;columna<8 ;columna++ ) {
               tablero[fila][columna]=0;
            }
         }
   }


      System.out.println(puntofinal);


    }
}