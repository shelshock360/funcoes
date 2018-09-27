package funcoes;

import java.util.Scanner;

public class Nadador {

    public static int lerIdade() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("informe sua idade");
        int idade = entrada.nextInt();

        
        if(idade>=5 && idade<=7){
            
            System.out.println("infantil A");
        }
        
         if(idade>=8 && idade<=10){
            
            System.out.println("infantil B");
        }
         
           if(idade>=11 && idade<=13){
            
            System.out.println("juvenil A");
        }
           
               if(idade>=14 && idade<=17){
            
            System.out.println("juvenil B");
        }
               
          if(idade>=18){
            
            System.out.println("adulto");
        }
        return idade;
        
        
        
    }
    
    
     public static void main (String args []){
         
         int mostrar=lerIdade();
     }

}
