package DIT952.quiz;

/**
 * Created by Niklas on 2016-02-15.
 */
public class Mystery {

    /* Quiz: Vad gör koden? */
    public int x(int[] l) {
        int q = 0;
        int z = 0;
        for (int kk = 0; kk < 10; kk++) {
            if (l[z] == 10) {
                q += 10 + (l[z + 1] + l[z + 2]);
                z += 1;
            } else if (l[z] + l[z+ 1] == 10) {
                q += 10 + l[z + 2];
                z += 2;
            } else {
                q += l[z] + + l[z + 1];
                z += 2;
            }
        }
        return q;
    }
}