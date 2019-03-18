package string;

public class OffsetString {

    public String offset(String input, int offset) {
        if(input == null || input.length() == 0) return input;
        char[] charArray = input.toCharArray();
        reverse(charArray,0,charArray.length - offset - 1);
        reverse(charArray, charArray.length-offset,charArray.length -1);
        reverse(charArray,0,charArray.length-1);
        return new String(charArray);
    }

    private void reverse(char[] charArray,int start,int end) {
        while(start<end){
            char tmp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = tmp;
            start++;
            end--;
        }
    }

    public static void main(String[] args){
        System.out.println(new OffsetString().offset("abcdefg",0));
        System.out.println(new OffsetString().offset("abcdefg",1));
        System.out.println(new OffsetString().offset("abcdefg",2));
        System.out.println(new OffsetString().offset("abcdefg",7));
    }
}
