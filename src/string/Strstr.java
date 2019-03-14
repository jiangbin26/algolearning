package string;

public class Strstr {

    public boolean isStrOfPartOfStr(String strA,String strB) {
        if (strB == null || strB.length() == 0) return false;
        int n = strA.length(),m = strB.length();
        for (int i=0; i< n-m+1;i++) {
            int k = i,j = 0;
            while( j < m && strA.charAt(k) == strB.charAt(j)) {
                k++;
                j++;
                i++;
            }
            if(j == m) return true;
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(new Strstr().isStrOfPartOfStr("I am a super man","men"));
    }
}
