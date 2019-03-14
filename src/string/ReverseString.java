package string;


public class ReverseString {

    private static String reverse(String input) {
        if(input == null || input.length() == 0) return input;
        char[] elements = input.toCharArray();
        for(int start = 0,end = 0; start < elements.length;) {
            while (end < elements.length && elements[end] != ' ') end++;
            swapElements(elements, start, end - 1);
            end += 1;
            start = end;
        }
        return new String(elements);
    }

    private static void swapElements(char[] elements,int start,int end){
        for (int i = start, j = end; i<j;i++,j--) {
            char tmp = elements[i];
            elements[i] = elements[j];
            elements[j] = tmp;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse("I am busy."));
    }
}
