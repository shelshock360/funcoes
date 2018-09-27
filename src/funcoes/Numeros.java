
package funcoes;

import java.util.Scanner;


public class Numeros {
    
    public static void lerMaior(){
          Scanner entrada = new Scanner(System.in);
        
          System.out.println("escreva um numero");
          int n1=entrada.nextInt();
          
          System.out.println("escreva um numero");
          int n2=entrada.nextInt();
          
          System.out.println("escreva um numero");
          int n3=entrada.nextInt();
         
          if(n1>n2 && n1>n3){
              
            
              System.out.println("maior"+n1);
              
             
          }
          
           if(n2>n1 && n2>n3){
              
            
              System.out.println("maior"+n2);
            
          }
    
             if(n3>n1 && n3>n2){
              
              
              System.out.println("maior"+n3);
            
          }
    
          
      
    }
    public static void main(String args []){
        
        
        lerMaior();
    }
    
}
