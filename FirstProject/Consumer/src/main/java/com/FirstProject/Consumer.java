package com.FirstProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Consumer  {




    File file = new File("Score.txt");

    boolean value;

    {
        try {
            value = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    Scanner input=new Scanner(System.in);

    String team1 = input.nextLine();
    String bosluk=" ";
    String score1  = input.nextLine();
    String imlec="-";
    String team2 = input.nextLine();
    String score2 = input.nextLine();


    FileWriter yazıcı;
        {


        try {
            yazıcı = new FileWriter("Score.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            yazıcı.write(team1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            yazıcı.write(bosluk);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            yazıcı.write(score1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            yazıcı.write(bosluk);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            yazıcı.write(imlec);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            yazıcı.write(bosluk);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            yazıcı.write(score2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            yazıcı.write(bosluk);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            yazıcı.write(team2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            yazıcı.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
