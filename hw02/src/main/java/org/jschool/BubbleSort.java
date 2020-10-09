package org.jschool;

import java.util.Arrays;
import java.util.Random;
 
public class BubbleSort {
    public static void main(String[] args) {
        int n=21,buf;
		int [] mas = new Random().ints(0,n+1).limit(n).toArray();
        System.out.println(Arrays.toString(mas));
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}