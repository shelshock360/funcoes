
package funcoes;

import java.util.Scanner;


public class Multiplos {
    
    public static void  calculoMultiplos(){
        Scanner entrada = new Scanner (System.in);
           
        System.out.println("digite numero a");
        int a=entrada.nextInt();
        
        System.out.println("digite numero b");
        int b=entrada.nextInt();
        
       if(a%b==0 || b%a==0) {
           
           System.out.println("são multiplos");
           
       }else{
           
          System.out.println(" não são multiplos");
       }
       
        
        
    }
    
    public static void main(String args []){
        
        calculoMultiplos();
        
    }
    
}
