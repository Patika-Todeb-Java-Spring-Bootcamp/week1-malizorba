package com.FirstProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Verileri Team 1 score 1 ,Score2 Team2 şeklinde giriniz!");
        System.out.println("Kaç adet veri girilecek?");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        for (int i=1;i<=k;i++){
            Consumer consumer=new Consumer();
            consumer.run();
            Producer producer=new Producer();
            producer.run();
        }

    }
}
