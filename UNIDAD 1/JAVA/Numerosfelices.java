import javax.swing.JOptionPane;
public class Numerosfelices{
public static void main(String[] args) {
     
     int a=0,sum = 0,num,b,c;
     boolean d=false;
     num=Integer.parseInt(JOptionPane.showInputDialog ("INGRESE UN NUMERO PARA VER SI ES MISERABLE\n 0= MISERABLE; 1=FELIZ"));
     do{ if(num<=998){
        for(sum=0;num!=0;sum+=c){
            b=num%10;
            num/=10;
            c=b*b;
        }
        if(sum==1){
            d=true;}
            else{
                num=sum;
                a++;
                if(a==20)
                {sum=1;
                    d=false;
                }
            }
        }
        else{
                System.out.println("EL NUMERO NO ES VALIDO");
                System.exit(0); 


        }
    }
    while(sum!=1);
    if(d==true)
    JOptionPane.showMessageDialog(null, "1");
    else
    JOptionPane.showMessageDialog(null, "0");
}
}
            
        
    

    
    


