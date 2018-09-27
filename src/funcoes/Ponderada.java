
package funcoes;

import java.util.Scanner;

public class Ponderada {
    
      public static double n1;
      public static double n2;
      public static double n3;
          public static String  nome;        
    public static void SolicitarNotas(){
    Scanner entrada = new Scanner(System.in);  
    
         System.out.println("nome");
         nome=entrada.nextLine();
    
         System.out.println("digite 1° nota");
         n1=entrada.nextInt();
        
         System.out.println("digite 2° nota");
         n2=entrada.nextInt();
        
         System.out.println("digite 3° nota");
         n3=entrada.nextInt();
        
     
    }
    
  
    public static  double media=(n3*4+n2*3+n1*3)/10;
    
    public static double apresentarStatus (){
      
       
        double media=(n3*4+n2*3+n1*3)/10;
        
        if(media>=50){
            
         
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