///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Login And Sign Up
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
import java.util.Random;
import java.util.Scanner;
import java.io.PrintWriter;

public class LoginAndSignup {


    /**
     * readFromFile method will read from the database file and put all usernames,
     * encrypted passwords, and keys in the corresponding ArrayLists. If the file cannot open,
     * output error message: <dbName> cannot open!
     *
     * @param dbName The file name to read all users, passwords, and keys
     * @param users
     * @param pwds
     * @param keys
     */
    public static void readFromFile(String dbName, ArrayList<String> users, ArrayList<String> pwds, ArrayList<Integer> keys) {
        FileInputStream fileByteStream = null;
        Scanner inFS;
        try {
            fileByteStream = new FileInputStream(dbName);
            inFS = new Scanner(fileByteStream);
            while(inFS.hasNextLine()) {
                String userName = inFS.next();
                users.add(userName);
                String passWord = inFS.next();
                pwds.add(passWord);
                int keyNum = inFS.nextInt();
                keys.add(keyNum);
                if (inFS.hasNextLine()) {
                    inFS.nextLine();
                }
            }
            inFS.close();
        } catch (FileNotFoundException e) {
            System.out.println(dbName + " cannot open!");
        }

    }

    /**
     * writeToFile method write the usernames, encrypted passwords and keys back to the file.
     * The username and its corresponding encrypted password and key are written on the same line.
     * Use tab to separate each of them. If the file cannot open,
     * output error message: <fileName> cannot open!
     *
     * @param fileName
     * @param users
     * @param encryptedpwds
     * @param keys
     */
    public static void writeToFile(String fileName, ArrayList<String> users, ArrayList<String> encryptedpwds, ArrayList<Integer> keys) {
        PrintWriter writer = null;

        try {
            writer = new PrintWriter(fileName);
            for (int i = 0; i < users.size(); i++) {
                writer.println(users.get(i) + "\t" + encryptedpwds.get(i) + "\t" + keys.get(i));
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " cannot open!");
        }

    }


    /**
     * Encrypt the password - update each character in the password by adding key to the
     * character value For example, if key is 3, and password is "abc", the encrypted password
     * would be "def".
     *
     * @param password
     * @param key
     * @return an encrypted password
     */
    public static String pwdEncryption(String password, int key) {

        return null;
    }

    /**
     * Decrypt the password - update each character in the password by subtracting key to the
     * character value. For example, if key is 1, and encrypted password is "hi", the original
     * password would be "gh".
     *
     * @param encryptedPassword
     * @param key
     * @return the original password
     */
    public static String pwdDecryption(String encryptedPassword, int key){

        return null;
    }

    /**
     * Check whether the username and password are correct
     * if the username does not exist, return "Invalid username"
     * if the username exists but the password is incorrect, return "Invalid password"
     * if the username exists and password is correct, return "Successful login"
     *
     * @param users ArrayList contains all usernames
     * @param pwds ArrayList contains all passwords
     * @param keys ArrayList contains all keys to encrypt and decrypt
     * @param userName
     * @param password
     * @return a message to indicate the login result
     */
    public static String login (ArrayList<String> users, ArrayList<String> pwds, ArrayList<Integer> keys, String userName, String password) {

        return null;
    }

    /**
     * This method is used for signing up a new user.
     * If the newUser already exists, then the signup action fails and returns "Invalid username".
     * Else signup action succeeds with the username, encrypted password and the key are added to
     * the corresponding ArrayLists and return "Successful signup".
     *
     * @param rand Random instance to generate a random key. The key should in range of [1, 20]
     * @param users ArrayList contains all usernames
     * @param pwds ArrayList contains all passwords
     * @param keys ArrayList contains all keys to encrypt and decrypt
     * @param newUser new username
     * @param newPwd new password
     * @return a message to indicate the signup result
     */
    public static String signup(Random rand, ArrayList<String> users, ArrayList<String> pwds, ArrayList<Integer> keys, String newUser, String newPwd) {

        return null;
    }

    /**
     * Determine whether the new username exists.
     *
     * @param newUser
     * @param users
     * @return boolean true if the newUser doesn't exist
     * 				   false if the newUser already exists
     */
    public static boolean uniqueUser(String newUser, ArrayList<String> users) {
        return false;
    }

    public static void main(String[] args) {


    }

}

