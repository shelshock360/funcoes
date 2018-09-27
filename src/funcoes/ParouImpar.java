
package funcoes;

import java.util.Scanner;


public class ParouImpar {

 public static String ler(int numero){
     
     if(numero%2==0){
          
         System.out.println("par");
         
     }else{
         
         System.out.println("impar");
     }
     
     if(numero>0){
         
         String resultado="positivo";
             System.out.println(resultado);
            return "positivo";
            
         
     }else{
         String resultado="negativo";
             System.out.println(resultado);
             return "negativo";
     }
     
   
     
   
 }
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero");
        int numero=entrada.nextInt();
        
        String  mostrar= ler(numero);
        
          
        
        
    
        
    }
    
}
