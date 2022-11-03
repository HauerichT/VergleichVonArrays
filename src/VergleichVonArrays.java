public class VergleichVonArrays {

    public boolean isEqual(int[] a, int[] b) {

        boolean hatPaar = false;

        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (a[i] == b[j]) {
                        hatPaar = true;
                    }
                    else {
                        hatPaar = false;
                    }
                }
            }
        } else {
            return false;
        }

        return hatPaar;
    }
    
}
