package exam_trial;

/**
 * @author --G--
 */
public class ExamTrial {

    public static void main(String[] args) {
        int bitCount = bitCount(31);

    }

    private static int bitCount(int i) {
        //your solution here
        //how many 1 bit is in the attributte?
        
        if (i == 0){
            return 0;
        }else{
            return (i & 1) + bitCount(i >> 1);
        }
        //throw new UnsupportedOperationException("exam failed.");
    }

}
