package h2;

/**
 * Diese Klasse findet den kleinsten (Minimum) und den größten (Maximum)
 * Wert aus drei verschiedenen Ganzzahlen (i, j, k).
 */
public class H2_main {

    /**
     * Die main-Methode, der Startpunkt des Programms.
     *
     * @param args Kommandozeilenargumente (nicht verwendet)
     */
    public static void main(String[] args) {
        
        // Deklarieren und Initialisieren der fünf int-Variablen
        // Ändern Sie diese Werte, um verschiedene Szenarien zu testen
        int i = 11;
        int j = 42;
        int k = 58;
        
        // min und max werden deklariert, aber noch nicht initialisiert.
        // Sie bekommen ihren Wert erst durch die Logik unten zugewiesen.
        int min;
        int max;

        System.out.println("Starte Prüfung mit den Werten:");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);

        // --- Logik zum Finden des Minimums ---
        
        // 1. Wir treffen eine Annahme: 'i' ist das Minimum.
        min = i;

        // 2. Wir prüfen, ob 'j' kleiner ist als unser aktuelles Minimum ('min').
        if (j < min) {
            // Wenn ja, korrigieren wir unsere Annahme: 'j' ist das neue Minimum.
            min = j;
        }

        // 3. Wir prüfen, ob 'k' kleiner ist als unser *aktuelles* Minimum.
        //    (Das 'min' könnte jetzt 'i' oder 'j' sein).
        if (k < min) {
            // Wenn ja, korrigieren wir unsere Annahme: 'k' ist das neue Minimum.
            min = k;
        }

        // --- Logik zum Finden des Maximums ---
        
        // 1. Wir treffen eine Annahme: 'i' ist das Maximum.
        max = i;

        // 2. Wir prüfen, ob 'j' größer ist als unser aktuelles Maximum ('max').
        if (j > max) {
            // Wenn ja, korrigieren wir unsere Annahme: 'j' ist das neue Maximum.
            max = j;
        }

        // 3. Wir prüfen, ob 'k' größer ist als unser *aktuelles* Maximum.
        if (k > max) {
            // Wenn ja, korrigieren wir unsere Annahme: 'k' ist das neue Maximum.
            max = k;
        }

        // --- Ausgabe der Ergebnisse ---
        System.out.println("--------------------");
        System.out.println("Minimum gefunden: " + min);
        System.out.println("Maximum gefunden: " + max);
    }
}