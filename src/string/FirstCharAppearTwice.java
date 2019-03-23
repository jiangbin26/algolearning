package string;

import java.util.Arrays;

public class FirstCharAppearTwice {

    public int appearTwiceWithTwoTimesLoop(String input) {
        if (input == null || input.length() == 0) return -1;
        char[] store = new char[26];
        char[] elements = input.toCharArray();
        for (int i = 0;i<elements.length;i++) {
            ++store[elements[i] - 'a'];
        }
        for (int j = 0;j<elements.length;j++) {
            if(store[elements[j] - 'a'] == 2) return j;
        }
        return -1;
    }

    public int appearTwiceWithOneTimeLoop(String input){
        if (input == null || input.length() == 0) return -1;
        char[] store = new char[26];
        char[] index = new char[26];
        Arrays.fill(index,(char)-1);
        for(int i = 0;i<input.length();i++){
            ++store[input.charAt(i) - 'a'];
            if (index[input.charAt(i) - 'a'] == (char)-1) index[input.charAt(i) - 'a'] = (char)i;
        }
        int firstIndex = Integer.MAX_VALUE;
        for(int j = 0; j<store.length;j++){
            if (store[j] == 2) firstIndex = Math.min(firstIndex,index[j]);
        }
        return firstIndex == Integer.MAX_VALUE ? -1 : firstIndex;
    }

    public static void main(String[] args) {
        //System.out.println(new FirstCharAppearTwice().appearTwiceWithTwoTimesLoop("acbded"));
        System.out.println(new FirstCharAppearTwice().appearTwiceWithOneTimeLoop("abcee"));
    }
}
