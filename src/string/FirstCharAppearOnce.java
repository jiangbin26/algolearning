package string;

import java.util.Arrays;

public class FirstCharAppearOnce {

    public int indexOfFirstCharAppearOnceTwoLoop(String input){
        if(input == null || input.length() == 0) return -1;
        char[] store = new char[26];
        for(int i=0;i<input.length();i++) {
            store[input.charAt(i) - 'a']++;
        }
        for(int j=0;j<input.length();j++){
           if(store[input.charAt(j) - 'a'] == 1) return j;
        }
        return -1;
    }

    public int indexOfFirstCharAppearOnceOneLoop(String input){
        if(input == null || input.length() == 0) return -1;
        char[] store = new char[26];
        char[] index = new char[26];
        Arrays.fill(index, (char) -1);
        for(int i=0;i<input.length();i++){
            store[input.charAt(i) - 'a']++;
            if (index[input.charAt(i) - 'a'] == -1) index[input.charAt(i) - 'a'] = (char)i;
        }
        int firstIndex = Integer.MAX_VALUE;
        for(int j=0; j< store.length;j++) {
            if (store[j] == 1 &&  firstIndex > index[j]) firstIndex = index[j];
        }
        return firstIndex == Integer.MAX_VALUE ? -1 : firstIndex;
    }

    public static void main(String[] args){
        System.out.println(new FirstCharAppearOnce().indexOfFirstCharAppearOnceOneLoop("bbzzcc"));
    }
}
