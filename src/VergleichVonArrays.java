public class VergleichVonArrays {

    public void sortArrays(int[] array) {

        int lower;
        int higher;
        boolean run = true;

        for (int i = 0; i < array.length && run; i++) {
            run = false;

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

    public boolean isEqual (int[] a, int[] b) {

        sortArrays(a);
        sortArrays(b);

        if (a.length != b.length) return false;

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
