package h2;


public class H2_main {

    
    public static void main(String[] args) {
        
        
        int i = 11;
        int j = 42;
        int k = 58;
        
        
        int min;
        int max;

        System.out.println("Starte Prüfung mit den Werten:");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);

        
        min = i;

        
        if (j < min) {
            
            min = j;
        }

       
        if (k < min) {
           
            min = k;
        }

      
        max = i;

        
        if (j > max) {
            
            max = j;
        }

       
        if (k > max) {
            
            max = k;
        }

        
        System.out.println("--------------------");
        System.out.println("Minimum gefunden: " + min);
        System.out.println("Maximum gefunden: " + max);
    }
}