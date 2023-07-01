package org.example.java;

import java.util.Arrays;

public class NotQuiteLisp {
    public static void main(String[] args) {
        var floorCount =0;
        char[] seq = args[0].toCharArray();
        for (char item : seq){
            if(Character.compare(item,'(')==0){
                floorCount++;
            } else if (Character.compare(item,')')==0) {
                floorCount--;
            }
        }
        System.out.println(floorCount);
    }
}