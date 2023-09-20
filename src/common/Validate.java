/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import model.Candidate;

/**
 *
 * @author DELL
 */
public class Validate {
    
    public static final String PHONE_VALID = "^\\d{10}\\d*$";
    
    public static final String EMAIL_VALID = "^[A-Za-z0-9.+-_%]+@[A-za-z.-]+\\.[A-Za-z]{2,4}$";
    // kiem tra lua chon hop le tu nguoi dung
    public static int checkInputChoice (int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt( new Scanner(System.in).nextLine().trim() );
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch( NumberFormatException e) {
                System.out.format("Please, enter number in range %d - %d \n",min, max );
                System.out.print("Let's try enter again:      ");
            }
        }
    }
    
    public static String checkInputString() {
        while (true) {
            String result = new Scanner(System.in).nextLine().trim();
            if (result.isEmpty() ) {
                System.out.println("Can not be empty");
                System.out.print("Let's try enter again:  ");
            } else {
                return result;
            }
        }
    }
    
    
    public static boolean checkInputYN() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y") ) {
                return true;
            } else if (result.equalsIgnoreCase("N") ) {
                return false;
            }
            System.out.println("Please input y/Y or n/N");
            System.out.print("Let's try enter again:  ");
        }
    }
    
    // check phone number
    public static String checkInputPhone() {
        while (true) {
            String result = checkInputString();
            if (result.matches(PHONE_VALID)) {
                return result;
            } else {
                System.out.println("Phone number with 10 characters");
                System.out.print("Let's try enter again:  ");
            }
        }
    }
    
    // check email account with format [account name]@[domain]. (eg space@apple.com)
    public static String checkInputEmail() {
        while (true) {
            String result = checkInputString();
            if (result.matches(EMAIL_VALID)) {
                return result;
            } else {
                System.out.println("Tip: Email account with format [account name]@[domain] ");
                System.out.print("Let's try enter again:  ");
            }
        }
    }
    
    // check user input graduation rank
    public static String checkInputGraduationRank() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Exellence") || result.equalsIgnoreCase("Good")
                  || result.equalsIgnoreCase("Fair") || result.equalsIgnoreCase("Poor")
                ) {
                return result;
            } else {
                System.out.println("Please input string: Excellence, Good, Fair, Poor");
                System.out.print("Let's try enter again:  ");
            }
        }
    }
    
    // check id exist or not 
    public static boolean checkIdExist(ArrayList<Candidate> candidates, String id) {
        for ( Candidate c : candidates) {
            if (c.getId().equalsIgnoreCase(id)) {
                System.out.println("Id already exist");
                return false;
            }
        }
        return true;
    }
    
    // check experience must be smaller than age
    public static int checkExperience( int birthDate) {
        int yearCurrent = Calendar.getInstance().get(Calendar.YEAR);
        int age = yearCurrent - birthDate;
        while (true ){
            int yearExperience = checkInputChoice(1,100);
            if(yearExperience > age) {
                System.out.println("Experience must be smaller than age");
            } else {
                return yearExperience;
            }
        }
    }
    
   
    
}
