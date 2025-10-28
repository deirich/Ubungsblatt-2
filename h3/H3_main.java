package h3;

public class H3_main {

    public static void main(String[] args) {
        
        int i = 210;
        int j = 102;

        boolean ausdruck1 = (i > j);
        boolean ausdruck2 = (i > 200);
        boolean ausdruck3 = (j > 100);

        int k = -10;

        if (ausdruck1 && !ausdruck2 && !ausdruck3) {
            k = 1;
        } else if (ausdruck1 && ausdruck2 && !ausdruck3) {
            k = 2;
        } else if (ausdruck1 && ausdruck2 && ausdruck3) {
            k = 3;
        } else if (!ausdruck1 && !ausdruck2 && !ausdruck3) {
            k = 4;
        }
        
        System.out.println("Startwerte: i = " + i + ", j = " + j);
        System.out.println("Ausdruck 1 (i > j): " + ausdruck1);
        System.out.println("Ausdruck 2 (i > 200): " + ausdruck2);
        System.out.println("Ausdruck 3 (j > 100): " + ausdruck3);
        System.out.println("--------------------");
        System.out.println("Endwert von k: " + k);
    }
}