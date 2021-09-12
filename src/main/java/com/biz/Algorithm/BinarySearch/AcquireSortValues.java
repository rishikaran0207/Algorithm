package com.biz.Algorithm.BinarySearch;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class AcquireSortValues {
    public static void main(String[] args) {
        try {
            File myfile = new File("File.txt");
            myfile.createNewFile();
            System.out.println("File created: " + myfile.getName());
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter filewrite = new FileWriter("File.txt");
            filewrite.write("orange apple pomogranite mosambi");
            filewrite.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

