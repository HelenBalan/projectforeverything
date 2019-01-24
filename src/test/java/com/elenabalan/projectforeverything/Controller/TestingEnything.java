package com.elenabalan.projectforeverything.Controller;

import org.junit.Test;

import java.util.LinkedList;

public class TestingEnything {

    @Test
    public void searchLastVivant(){

        int j = 0;
        int living = 100;
        LinkedList<Integer> isVivantList = new LinkedList<>();
        for(int i=1; i<=100; i++)
            isVivantList.add(i);
        while(isVivantList.size() > 1){
            j = 1;
            while(j<5){
                Integer number = isVivantList.removeFirst();
                isVivantList.addLast(number);
                j++;
            }
            isVivantList.removeFirst();
            System.out.println(isVivantList);
        }
        System.out.println(isVivantList);

        j=0;
        for(int i=1; i<=100; i++){
            if(i%5!=0)
                j++;
        }
        System.out.println(j);
    }
}
