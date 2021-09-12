package com.biz.Algorithm.BinarySearch;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

    public class BinarySearch {
        public static String[] word;
        private static String words;

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            splitarray();
            sort();
            System.out.println("\n Enter the Text to Find:");
            String key=sc.next();
            int last= word.length-1;
            binarysearch(word,0,last,key);

        }
        public static void splitarray(){
            try
            {
                FileInputStream filestr = new FileInputStream("File.txt");
                DataInputStream data_input = new DataInputStream(filestr);
                BufferedReader buffer = new BufferedReader(new InputStreamReader(data_input));

                while ((words = buffer.readLine()) != null)
                {
                    words = words.trim();
                    if ((words.length()!=0))
                    {
                        word=words.split(" ");
                        for (String s : word) {
                            System.out.println(s);
                        }
                    }
                }
            }
            catch (Exception e)
            {
                System.err.println("Error: " + e.getMessage());
            }
        }

        public static void sort(){
            System.out.println("\n Before sorting");
            for (String s : word) {
                System.out.println(s);
            }
            Arrays.sort(word);
            System.out.println("\n After sorting");
            for (String s : word) {
                System.out.println(s);
            }
        }

        public static void binarysearch(String arr[], int first, int last, String key){
            int mid = (first + last)/2;
            while( first <= last ){
                if ( arr[mid].compareTo(key) < 0 ){
                    first = mid + 1;
                }else if (arr[mid].compareTo(key) == 0){
                    System.out.println("\nElement is found at index: " + mid);
                    break;
                }else{
                    last = mid - 1;
                }
                mid = (first + last)/2;
            }
            if ( first > last ){
                System.out.println("\nElement is not found!");
            }
        }
    }


