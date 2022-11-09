public class ArrayVergleich {

    // Methode zum Sortieren eines Arrays (Bubblesort Algorithmus)
    public void sortArrays(int[] array) {

        // Speicherung der Zwischenwerte
        int lower;
        int higher;

        // Speicherung des Status zur Beendigung
        boolean run = true;

        // iteriert über das übergebene Array
        for (int i = 0; i < array.length && run; i++) {
            run = false;

            // sortiert das Array nach der Größe der Integer
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j + 1]) {
                    higher = array[j];
                    lower = array[j + 1];
                    array[j] = lower;
                    array[j + 1] = higher;
                    run = true;
                }
            }

        }

    }

    // Methode zur Überprüfung zweier Arrays auf Übereinstimmung
    public boolean isEqual (int[] a, int[] b) {

        // prüft auf leere Arrays
        if (a == null || a.length == 0 || b == null || b.length == 0) {
            System.out.println("Mindestens eine null-Referenz oder ein leeres Array gefunden.");
            System.exit(0);
        }

        // ruft die Methode sortArrays auf und übergibt jeweils ein Array
        sortArrays(a);
        sortArrays(b);

        // wenn die Arrays unterschiedlich lang sind, wird false returnt
        if (a.length != b.length) return false;

        // iteriert über beide sortierten Arrays und prüft, ob die Arrays identisch sind
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }
        }

        return true;
    }
    
}
