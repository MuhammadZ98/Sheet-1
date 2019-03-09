package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int F1 = 0, F2 = 1, Fn = 0;
        int n = in.nextInt();
        if(n == 0){
            Fn = F1;
        } else if(n == 1){
            Fn = F2;
        } else if(n > 1) {
            for (int i = 1; i < n; i++) {
                Fn = F1 + F2;
                F1 = F2;
                F2 = Fn;
            }
        }
        System.out.println(Fn);
    }
}
