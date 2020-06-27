package com.dubovik.array.reader;

import com.dubovik.array.entity.CustomArray;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayReader {
    public boolean arrayConsoleReader(CustomArray in_array){
        boolean is_operation_correct = false;
        Scanner in = new Scanner(System.in);
        int[] array = new int[in_array.getLength()];
        int index = 0;
        for(int i = 0; i < in_array.getLength(); i++){
            if(in.hasNextInt()){
                array[i] = in.nextInt();
                is_operation_correct = true;
            }
        }
        in_array.setArray(array);
        return is_operation_correct;
    }

    public boolean arrayFileReader(CustomArray in_array, String filename){
        boolean has_file_opened = false;
        int[] array = new int[in_array.getLength()];
        int index = 0;
        Path path = Paths.get("input/inputFile.txt");
        if(Files.exists(Paths.get(filename))){
            path = Paths.get(filename);
            has_file_opened = true;
        }
        try {
            List<String> file_strings = Files.readAllLines(path);
            for(String i : file_strings){
                StringTokenizer tokenizer = new StringTokenizer(i, " ");
                while(tokenizer.hasMoreTokens() && index < in_array.getLength()){
                    array[index++] = Integer.parseInt(tokenizer.nextToken());
                }
            }
            in_array.setArray(array);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return has_file_opened;
    }

    public void arrayRandomFill(CustomArray in_array){
        int[] array = new int[in_array.getLength()];
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt();
        }
        in_array.setArray(array);
    }
}
