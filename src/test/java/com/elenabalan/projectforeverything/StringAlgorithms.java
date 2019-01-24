package com.elenabalan.projectforeverything;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class StringAlgorithms {

    static boolean compare(Collection set1, Collection set2){
        int sizeOfExpected = set1.size();
        int sizeOfDubles = set2.size();

        return (sizeOfDubles == sizeOfExpected) && set1.containsAll(set2);
    }
    @Test
    public void duplicates() {

        Set<Character> expected = new HashSet<>(Arrays.asList('a','b'));

        Set<Character> dubles =
                com.elenabalan.projectforeverything.StringAlgorithms.duplicates("Javabb");


        System.out.println(dubles);
        assertTrue(compare(expected,dubles));

        expected = new HashSet<>();

        dubles =  com.elenabalan.projectforeverything.StringAlgorithms.duplicates("");
        System.out.println(dubles);
        assertTrue(dubles.size()==0);
    }

    @Test
    public void reverse(){
        String str = "1234567";
        String compare = "7654321";
        String res = com.elenabalan.projectforeverything.StringAlgorithms.reverse(str);

        assertEquals(res,compare);
        System.out.println(res);
        res = com.elenabalan.projectforeverything.StringAlgorithms.reverseRecursive(str);
        System.out.println(res);
        assertEquals(res,compare);
    }

    @Test
    public void isNumeric(){
        String str = "12345";
        assertTrue(com.elenabalan.projectforeverything.StringAlgorithms.isNumeric(str));
        str = "ggreq21324a";
        assertTrue(!com.elenabalan.projectforeverything.StringAlgorithms.isNumeric(str));
        str = "1ggreq21324a1";
        assertTrue(!com.elenabalan.projectforeverything.StringAlgorithms.isNumeric(str));
    }

    @Test
    public void indexOf(){
        String str = "12312312234";
        String subStr = "2345";
        int res = com.elenabalan.projectforeverything.StringAlgorithms.indexOf(str,subStr);
        assertEquals(-1,res);
    }
}
