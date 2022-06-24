package com.FirstProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Producer {
    FileReader file;

    {
        try {
            file = new FileReader("Score.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        String line = null;
        BufferedReader bReader = new BufferedReader(file);
        while (true) {
            try {
                if (!((line = bReader.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(line);
        }
        try {
            bReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
