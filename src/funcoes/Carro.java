package funcoes;


import java.util.Scanner;

public class Carro {

    public static double calcularCusto(double custoFabrica) {
      
     
      
 
  double distribuidor=(28./100)*custoFabrica;
   double  impostos= (45./100)*custoFabrica;
   double custoFinal=(custoFabrica+distribuidor)+impostos;
       
        System.out.println(custoFinal);
   
   return custoFinal;

    }

    public static void main(String Args[]) {
    Scanner entrada = new Scanner(System.in);
    
     double custoFabrica;
     System.out.println("informe custo de fabrica");
     custoFabrica=entrada.nextDouble();
     
     
     
     double custoFinal=calcularCusto(custoFabrica);
     
     
        System.out.println(custoFinal);
        
    
      
     

    }
}