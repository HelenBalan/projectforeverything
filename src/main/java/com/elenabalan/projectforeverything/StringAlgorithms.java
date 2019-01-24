package com.elenabalan.projectforeverything;

import java.util.*;

public class StringAlgorithms {

    public static Set<Character> duplicates(String string){

        Set<Character> result = new HashSet<>();
        Set<Character> set = new HashSet<>();
        for(int i=0; i< string.length();i++){
            if(!set.add(string.charAt(i)))
                result.add(string.charAt(i));
        }
        return result;
    }

    public static boolean isAnagram(String str1, String str2){

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        return true;
    }

    public static String reverse(String str){

        StringBuilder strBuild = new StringBuilder();
        for(int i = str.length()-1; i>=0; i--)
            strBuild.append(str.charAt(i));
        return strBuild.toString();
    }

    public static String reverseRecursive(String str) {

        if(str.length() == 1) return str;

        str = new Character(str.charAt(str.length()-1)).toString().concat(reverseRecursive(str.substring(0,str.length()-1)));
        return str;
    }

    public static boolean isNumeric(String str){
        return str.matches("^\\d*$");
    }

    public static Map<Character,Integer> duplicateChars(String str){
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0; i<str.length(); i++) {
            Character c = str.charAt(i);
            Integer num = map.get(c);
            if(num==null)
                map.put(c,1);
            else
                map.put(c, num+1);
        }
        return map;
    }

    public static int indexOf(String string, String subString){

        char c = subString.charAt(0);
        for(int i=0; i <= string.length()-subString.length(); i++){
            if(c == string.charAt(i)) {
                int k = i+1;
                int j;
                for(j=1;j<subString.length();j++,k++)
                    if(subString.charAt(j) != string.charAt(k))
                        break;
                if(j==subString.length())
                    return i;
            }
        }
        return -1;
    }

    public static String remove(String str, char c){
        int index = str.indexOf(c);
        if(index == -1) return str;
        String strBefore = str.substring(0,index);
        String strAfter = str.substring(index+1);
        String result = strBefore.concat(strAfter);
        return result;
    }
}
