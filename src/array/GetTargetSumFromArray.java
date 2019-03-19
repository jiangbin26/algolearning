package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GetTargetSumFromArray {

    public int[] getTargetSumFromArrayWithForce(int[] array,int target){
        if(array == null || array.length == 0) return new int[]{-1,-1};

        for (int i = 0; i< array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) return new int[]{i+1,j+1};
            }
        }
        return new int[]{-1,-1};
    }

    public int[] getTargetSumFromArrayWithMap(int[] array,int target){
        if(array == null || array.length == 0) return new int[]{-1,-1};
        Map<Integer,Integer> store = new HashMap<>();
        for (int i = 0; i< array.length; i++) {
            store.put(array[i],i);
        }

        for (int j = 0; j< array.length; j++) {
            if (store.containsKey(target - array[j])) return new int[]{j+1,store.get(target - array[j])+1};
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args){
        Arrays.stream(new GetTargetSumFromArray().getTargetSumFromArrayWithForce(new int[]{1, 8, 3, 4, 2}, 10)).forEach(e->System.out.println(e));
        Arrays.stream(new GetTargetSumFromArray().getTargetSumFromArrayWithMap(new int[]{1, 8, 3, 4, 2}, 10)).forEach(e->System.out.println(e));
    }
}
