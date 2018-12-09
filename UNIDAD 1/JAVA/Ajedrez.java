import java.lang.Math;

class Ajedrez{
    
    public static void main(int[] args){
        int posicionPiezaX = (args[0]);
        int posicionPiezaY = (args[1]);
        int desMovX1 = (args[2]);
        int desMovY1 = (args[3]);
        int desMovX2 = (args[4]);
        int desMovY2 = (args[5]);
        Ajedrez aj = new Ajedrez();
        //SOLO TORRE
        System.out.println("TORRE:");
        int[] primerMovimiento = aj.mueveTorre(
                                    posicionPiezaX,posicionPiezaY,
                                    desMovX1, desMovY1
                                   );
        if(primerMovimiento[0] == -1)
            System.out.println("-1");
        else{
            int[] segundoMovimiento = aj.mueveTorre(
                                    primerMovimiento[0],primerMovimiento[1],
                                    desMovX2, desMovY2
                                   ); 
            if(segundoMovimiento[0] == -1)
                System.out.println("-1");
            else{
                System.out.println(segundoMovimiento[0]+","+segundoMovimiento[1]);
                
            }
        }   
        //SOLO ALFIL
        System.out.println("ALFIL:");
        int[] primerMovimientoA = aj.mueveAlfil(
                                    posicionPiezaX,posicionPiezaY,
                                    desMovX1, desMovY1
                                   );
        if(primerMovimientoA[0] == -1)
            System.out.println("-1");
        else{
            int[] segundoMovimientoA = aj.mueveAlfil(
                                    primerMovimientoA[0],primerMovimientoA[1],
                                    desMovX2, desMovY2
                                   ); 
            if(segundoMovimientoA[0] == -1)
                System.out.println("-1");
            else{
                System.out.println(segundoMovimientoA[0]+","+segundoMovimientoA[1]);
                
            }
        }   
             
    }   
    public int[] mueveTorre(int x0, int y0, int x1, int y1){
        int deltaX = x0 + x1;
        int deltaY = y0 + y1;
        int[] posicion = {-1};
        if(deltaX >=0 && deltaX <=7 && deltaY >=0 && deltaY <=7){
            if( x1 == 0 || y1 == 0){
                int[] aux = { deltaX , deltaY };
                posicion =  aux;
            } 
        }
        return posicion;       
    }
    public int[] mueveAlfil(int x0 , int y0 , int x1 ,int y1){
        int deltaX = x0 + x1;
        int deltaY = y0 + y1;
        int[] posicion = {-1};
        if(deltaX >=0 && deltaX <=7 && deltaY >=0 && deltaY <=7){
            if(Math.abs(x1) == Math.abs(y1)){
                int[] aux = { deltaX, deltaY };
                return aux;
            }
        }
        return posicion;
    }
}

        
        