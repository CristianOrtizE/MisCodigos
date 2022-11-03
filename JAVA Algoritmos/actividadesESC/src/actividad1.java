
public class actividad1 {
    public static void main(String[] args) {
        //Designacion de numeros aleatorios
        double num1 = (int) (Math.floor(Math.random()*50 + 1));
        double num2 = (int) (Math.floor(Math.random()*50 + 1));
        
        
        //Operaciones
        double resum=num1+num2;
        double reres=num1-num2;
        double rediv;
        double remul;
        
        
        if (num1<num2) {
                    rediv=num2/num1;
                    remul=num2*num1;
        } else {
        rediv=num1/num2;
        remul=num1*num2;
        }
        
        //Salida
        System.out.println(+num1);
        System.out.println(+num2);
        
        System.out.println("La suma de num 1 y num 2 es: "+resum);
        System.out.println("La resta de num 1 y num 2 es: "+reres);
        System.out.println("La division de num 1 y num 2 es: "+rediv);
        System.out.println("La multiplicacion de num 1 y num 2 es: "+remul);
        
        
    }
    
}
