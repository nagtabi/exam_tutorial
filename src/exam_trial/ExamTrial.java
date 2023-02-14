package exam_trial;

/**
 * @author NagyMarton
 */
public class ExamTrial {

    public static void main(String[] args) {
        int bitCount = bitCount(31);
        System.out.println(bitCount);
    }

    private static int bitCount(int n) {
        //your solution here
        //how many 1 bit is in the attributte?
        int count = 0;
        for (int i = 0; i < 32; i++) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}
