
package funcaoes;

import java.util.Scanner;


       
public class Notas {
    public static void solicitarNotas(){
    Scanner entrada = new Scanner(System.in); 

        System.out.println("insira nota 1° trimestre");
        double nota1=entrada.nextDouble();
        
          System.out.println("insira nota 2° trimestre");
    double nota2=entrada.nextDouble();
        

        System.out.println("insira nota 3° trimestre");
         double nota3=entrada.nextDouble();
         
         
        double soma=nota1+nota2+nota3;
        double media=soma/3;
   
        
     
}
    
    public static double apresentarStatus(double media){
     
        
        
        if(media>6.0){
            
            System.out.println("aprovado");
        }else{
            System.out.println("reprovado");
        }
        
     
        
       return media; 
    }
    
    
    public static void main(String args[] ){
        
        solicitarNotas();
     
        
       
        
       
        
       
    }
}
