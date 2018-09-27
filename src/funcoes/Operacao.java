
package funcaoes;

import java.util.Scanner;


public class Operacao {
    
    
    public static void lerDados(){
      Scanner entrada = new Scanner(System.in);
      
        System.out.println("digite A");
        int A=entrada.nextInt();
        
        System.out.println("digite B");
        int B=entrada.nextInt();
        
        
        System.out.println("digite B");
        int C=entrada.nextInt();
        
        
         
    }
    
    public static double calcularR( double A ,double B){
       
      
     double R=Math.sqrt(A+B);
    
        
        
        
        
       return R;
    }
    
    public static double calcularS (double B, double C){
        
        double S=Math.sqrt(B+C);
        
        return S;
    }
    
    public static double calcularD(double R,double S){
         
        double D=R+S/2;
        
        
        return D;
    }
    
    
    public static void main(String args[]){
        
        
        double mostrar = calcularD(10,2);
        
        
        System.out.println(calcularD(1.0,11.9));
       
    }
}
