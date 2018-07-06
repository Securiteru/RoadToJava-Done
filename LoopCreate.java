package com.Securiter;

public class LoopCreate {

    int[] createLoop() {
        int[] a = new int[100];
        for (int i = 0; i < 100; ++i) {
            a[i] = i;
        }
        return a;
    }


    public static void main(String[] args) {

        LoopCreate loopy=new LoopCreate();
        int[] loopy2 = loopy.createLoop();

        for(int x=0;x<100;x++){
            System.out.println(loopy2[x]);
        }


    }

}
