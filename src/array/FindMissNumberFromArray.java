package array;

public class FindMissNumberFromArray {

    public int getMissedNumber(int[] array){
        int length = array.length;
        int result = length;
        for(int i = 0;i<length;i++) result = result ^ array[i] ^ i;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new FindMissNumberFromArray().getMissedNumber(new int[]{4,2,0,1}));
    }
}
