package com.example.helloworld;

import static java.lang.Integer.parseInt;

public class Helloworld {
    public static void main(String args[]) {
        int sum=0;
        int i;
        for(i = 40; i<250; i++)
        {
            if(i%5==0)
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
