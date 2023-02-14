package exam_trial;

/**
 * @author --G--
 */
public class ExamTrial {

    public static void main(String[] args) {
        int bitCount = bitCount(31);
        System.out.println(bitCount);

    }

    private static int bitCount(int i) {
        int count = 0;
        while (i != 0) {
            if ((i & 1) == 1) {
                count++;
            }
            i >>>= 1;
        }
        return count;
    }
}
