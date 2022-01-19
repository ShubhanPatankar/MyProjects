///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Word Search
// Course:          CS 200, 1, 2021
//
// Author:          Shubhan Patankar
// Email:           spatankar2@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// Examples:
// Jane Doe; helped me with for loop in reverse method
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html;
//         counting for loop
// John Doe; I helped with switch statement in main method.
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        testReadDictionary();
        testReadWordSearch();
    }
    /**
     * Opens and reads a dictionary file returning a list of words.
     * Example:
     *  dog
     *  cat
     *  turtle
     *  elephant
     *
     * If there is an error reading the file, such as the file cannot be found,
     * then the following message is shown:
     *     Error: Unable to read file <dictionaryFilename>
     * with <dictionaryFilename> replaced with the parameter value.
     *
     * @param dictionaryFilename The dictionary file to read.
     * @return An ArrayList of words.
     */
    public static ArrayList<String> readDictionary(String dictionaryFilename) {
        //FILL IN BODY
        ArrayList<String> animals = new ArrayList<>();

        FileInputStream filestream;
        try{
            filestream = new FileInputStream(dictionaryFilename);
            BufferedReader b = new BufferedReader(new InputStreamReader(filestream));

            String s = b.readLine();
            while(s != null){
                animals.add(s);
                s = b.readLine();
            }
            b.close();
        }
        catch(FileNotFoundException e){
            System.out.println(" Unable to read file " + dictionaryFilename);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return animals;
    }

    /**
     * Opens and reads a wordSearchFileName file returning a block of characters.
     * Example:
     *  jwufyhsinf
     *  agzucneqpo
     *  majeurnfyt
     *
     * If there is an error reading the file, such as the file cannot be found,
     * then the following message is shown:
     *     Error: Unable to read file <wordSearchFileName>
     * with <wordSearchFileName> replaced with the parameter value.
     *
     * @param wordSearchFileName The dictionary file to read.
     * @return A 2d-array of characters representing the block of letters.
     */
    public static char[][] readWordSearch(String wordSearchFileName) {

        ArrayList<String> words = new ArrayList<>();

        FileInputStream filestream;
        try{
            filestream = new FileInputStream(wordSearchFileName);
            BufferedReader b = new BufferedReader(new InputStreamReader(filestream));

            String s = b.readLine();
            while(s != null){
                words.add(s);
                s = b.readLine();
            }
            b.close();
        }
        catch (FileNotFoundException e){
            System.out.println(" Unable to read file " + wordSearchFileName);
        }
        catch(IOException e){
            e.printStackTrace();
        }

        char[][] cWords = new char[words.size()][];
        for(int i = 0; i < words.size(); i++){
            cWords[i] = words.get(i).toCharArray();
        }

        return cWords;
    }

    public static void testReadDictionary() {
        //ADD TEST CASES
        ArrayList dictionaryWords;
        System.out.println("Positive Test Case for Dictionary Search");
        String dictionaryFilePath = "dictionary.txt";
        dictionaryWords = readDictionary(dictionaryFilePath);

        System.out.println("Number of words found: " + dictionaryWords.size());
        System.out.println("They are: " + dictionaryWords.toString());

        System.out.println("Negative Test Case for Dictionary Search");
        dictionaryFilePath = "dictionaryDummy.txt";
        dictionaryWords = readDictionary(dictionaryFilePath);
    }

    public static void testReadWordSearch() {
        //ADD TEST CASES
        char[][] wordList;

        System.out.println("\n\nPositive Test Case for Word Search");
        String wordFilePath = "wordsearch.txt";
        wordList = readWordSearch(wordFilePath);
        System.out.println("Number of words found: " + wordList.length);

        System.out.println("\nNegative Test CAse for Word Search");
        wordFilePath = "wordsearchDummy.txt";
        wordList = readWordSearch(wordFilePath);
    }

}





