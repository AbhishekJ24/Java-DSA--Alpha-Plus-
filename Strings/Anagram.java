package Strings;

import java.util.Arrays;

public class Anagram{
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        char ss[]=s.toCharArray();
        char tt[]=t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        for(int i=0;i<ss.length;i++){
            if(ss[i]!=tt[i])
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("rat","tar"));
        System.out.println(isAnagram("a","ab"));
        System.out.println(isAnagram("cat","act"));
    }
}