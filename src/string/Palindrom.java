package string;

public class Palindrom {

    public boolean isPalindrom(String input){
        if (input == null || input.length() == 0) return false;
        char[] charArray = input.toCharArray();
        for (int i=0,j=charArray.length-1;i<j;++i,--j){
            while (i<j && !isAlpa(charArray[i])) ++i;
            while (i<j && !isAlpa(charArray[j])) --j;
            if(i<j && !isEqualIgnoreCase(charArray[i],charArray[j])) return false;
        }
        return true;
    }

    private boolean isAlpa(char element){
        return ('a' <= element && element <='z') || ('A' <= element && element <= 'Z') || (0 <= element && element <= 9);
    }

    private boolean isEqualIgnoreCase(char elementA,char elementB) {
        if('A' <= elementA && elementA <= 'Z') elementA += 32;
        if('A' <= elementB && elementB <= 'Z') elementB += 32;
        return elementA == elementB;
    }

    public static void main(String[] args){
        System.out.println(new Palindrom().isPalindrom("race a E-car"));
    }
}
