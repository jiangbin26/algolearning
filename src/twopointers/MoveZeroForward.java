package twopointers;

import java.util.Arrays;

public class MoveZeroForward {

    public int[] moveWithAssignZero(int[] input) {
        if (input == null || input.length == 0) return input;
        int slow = 0;
        for (int fast = 0; fast < input.length; fast++) {
            if (input[fast] != 0) {
                input[slow] = input[fast];
                ++slow;
            }
        }
        for (int i = slow; i < input.length; i++) {
            input[i] = 0;
        }
        return input;
    }

    public int[] moveWithoutAssignZero(int[] input){
        if (input == null || input.length == 0) return input;
        for (int fast = 0, slow = 0; fast < input.length ; fast++){
            if (input[fast]!=0) {
                int tmp = input[fast];
                input[fast] = input[slow];
                input[slow] = tmp;
                slow++;
            }
        }
        return input;
    }

    public static void main(String[ ] args){
        //Arrays.stream(new MoveZeroForward().moveWithAssignZero(new int[]{0, 1, 2, 4, 0, 5})).forEach(e -> System.out.print(e));
        Arrays.stream(new MoveZeroForward().moveWithoutAssignZero(new int[]{0, 1, 2, 4, 0, 5})).forEach(e -> System.out.print(e));
    }
}
