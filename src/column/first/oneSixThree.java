package column.first;

public class oneSixThree {

    public static void main(String[] args) {
        int SHIFT = 5;
        int MASK = 0x1F; //BITSPERWORD - 1;
        int BITSPERWORD = 32;
        int N = 10000000;
        int[] a = new int[1 + N / BITSPERWORD];
        int top = 1 + N / BITSPERWORD;

        // clear the array
        for (int i = 0; i < top; i++) {
            a[i] = 0;
        }

        // set the array
        for (int x = 0; x < a.length; x++) {
            a[x >> SHIFT] |= (1 << (x & MASK));
        }

        // test the array
        for (int j = 0; j < a.length; j++) {
            if ((a[j >> SHIFT] & (1 << (j & MASK))) != 0) {
                System.out.println(j);
            }
        }
    }
}

