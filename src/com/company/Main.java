package com.company;

public class Main {

    public static void main(String[] args) {
        int fibUp2 = 1;

        int[] fib = new int[fibUp2+2];
        fib[0]=0;
        fib[1]=1;

        //System.out.println(fib[0]);
        //System.out.println(fib[1]);
        for(int i = 2; i<fibUp2+2; i++){
            fib[i] = fib[i-1] + fib[i-2];
            //System.out.println(fib[i]);
        }
        System.out.println(fib[fibUp2]);
    }
}
