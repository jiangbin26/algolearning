package twopointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GetTargetSumFromSortedIntArray {

    public int[] getTargetSum(int[] array,int target){
        int i = 0, j = array.length -1;
        while(i<j){
            if(array[i]+array[j]>target) --j;
            else if(array[i]+array[j]<target) ++i;
            else return new int[]{i+1,j+1};
        }
        return new int[]{-1,-1};
    }

    public int[] getTargetSumWithMap(int[] array,int target){
        Map<Integer,Integer> store = new HashMap<>();
        for(int i = 0;i<array.length;i++){
            if(!store.containsKey(array[i])) store.put(array[i],i);
        }
        for (int j = 0;j<array.length;j++){
            if (store.containsKey(target - array[j])) return new int[]{j+1,store.get(target - array[j])+1};
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args){
        //Arrays.stream(new GetTargetSumFromSortedIntArray().getTargetSum(new int[]{1, 2, 3, 4, 8, 11}, 10)).forEach(e->System.out.println(e));
        Arrays.stream(new GetTargetSumFromSortedIntArray().getTargetSumWithMap(new int[]{1, 2, 3, 4, 8, 11}, 7)).forEach(e->System.out.println(e));
    }
}
