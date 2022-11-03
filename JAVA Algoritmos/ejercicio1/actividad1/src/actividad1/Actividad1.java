package actividad1;

import java.util.Scanner;

public class Actividad1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese un numero");
        
        int n1 = entrada.nextInt();
        
        int hs = n1/3600;
        
        int min = ;
        int seg = min-((hs*60)/1);
        
        
        
        
        System.out.println("Horas: "+hs+" minutos: "+min+" segundos: "+ seg);
        
        
    }
    
}
