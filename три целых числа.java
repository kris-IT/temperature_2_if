package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int a = ad.nextInt();
        int b = ad.nextInt();
        int c = ad.nextInt();
        
            if (a==b && a==c && b==c) 
            System.out.println(a+ " " + b + " " +c);
                else if (a != b && a==c) 
                 System.out.println(a+ " " +c);
                    else if (a != c && a != b && b == c)
                     System.out.println(b+ " " +c);
                      else if (a == b) 
                       System.out.println(a+ " " +b); 
        
    } 
    
}
