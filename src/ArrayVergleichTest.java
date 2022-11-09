public class ArrayVergleichTest {

    public static void main(String[] args) {

        // Testarrays
        int[] a = {1,2,3,4};
        int[] b = {3,1,6,2};
        // int[] a = {3,5,1,3};
        // int[] b = {1,5,3,3};

        // Instanziierung eines neuen ArrayVergleich-Objektes
        ArrayVergleich arrayVergleich = new ArrayVergleich();

        // führt die Methode isEqual aus, übergibt zwei Arrays und printet das Ergebnis
        System.out.println(arrayVergleich.isEqual(a, b));

    }

}