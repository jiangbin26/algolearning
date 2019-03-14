package string;

public class ReverseWordInString {

    public String reversion(String input) {
        if (input == null || input.length() == 0) return input;
        char[] elements = input.toCharArray();
        swapElements(elements,0,elements.length -1);
        swapElementInWord(elements);
        return new String(elements);
    }

    private void swapElements(char[] charArray, int start, int end) {
        for(int i = start, j = end; i < j; i++,j--) {
            char tmp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = tmp;
        }
    }

    private void swapElementInWord(char[] charArray) {
        int start=0,end=0;
        while(start < charArray.length) {
            while (end < charArray.length && charArray[end] != ' ') end++;
            swapElements(charArray,start,end - 1);
            end += 1;
            start = end;
        }
    }

    public static void main(String[] args) {
        System.out.println(new ReverseWordInString().reversion("I am a good boy."));
    }
}
