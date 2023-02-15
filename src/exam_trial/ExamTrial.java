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
        //your solution here
        //how many 1 bit is in the attributte?
        int count = 0;
        for (int j = 0; j < 32; j++) {
            count += (i >>> j) & 1;
        }
        System.out.println("something to write out!");
        System.out.println("something to write out!");
        return count;
    }

}
