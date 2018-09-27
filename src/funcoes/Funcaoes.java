
package funcaoes;

import java.util.Scanner;


public class Funcaoes {

public static double calcular(double x1,double x2, double y1, double y2 ) {
double resultado = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
return resultado;
}
    
     
   
   
 
    
    public static void main(String[] args) {
    Scanner Entrada = new Scanner (System.in); 
       double x1,x2,y1,y2;
        System.out.println("informe x1:");
        x1=Entrada.nextDouble();
        
        System.out.println("informe x2:");
        x2=Entrada.nextDouble();
        
        System.out.println("informe y1:");
        y1=Entrada.nextDouble();
        
        System.out.println("informe y2:");
        y2=Entrada.nextDouble();
        
    double  resultado = calcular(x1,x2,y1,y2);
System.out.println("Resultado: " +resultado);
}

    }
    

