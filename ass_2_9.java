import java.util.Arrays;

public class ass_2_9 {
    public static void main(String[] args) {
        int[] m = {11, 65, 32, 7, 89, 5, 6};

        int[] sortedArray = Arrays.stream(m).sorted().toArray();

        System.out.println("Sorted elements: " + Arrays.toString(sortedArray));
    }
}
