
package funcoes;

import java.util.Scanner;

public class media {
    
      public static double nota1;
      public static double nota2;
      public static double nota3;   
    public static void SolicitarNotas(){
    Scanner entrada = new Scanner(System.in);  
    
      
         System.out.println("digite 1° nota");
         nota1=entrada.nextInt();
        
         System.out.println("digite 2° nota");
         nota2=entrada.nextInt();
        
         System.out.println("digite 3° nota");
         nota3=entrada.nextInt();
        
     
    }
    
    public static double soma=nota1+nota2+nota3;
    public static  double media=soma/3;
    
    public static double apresentarStatus (){
      
        
        double soma=nota1+nota2+nota3;
        double media=soma/3;
        
        if(media>=60){
            
         
            System.out.println("aprovado");
            
        }else{
            
            System.out.println("reprovado");
           
            
        } 
        
       

        System.out.println("media final"+" "+media);
        
       
        
        return media;
    }
    
    public static void main (String args []){
        
     SolicitarNotas();
     double resultado =apresentarStatus();
      
    }
}
