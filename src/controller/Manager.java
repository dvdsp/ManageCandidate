/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Validate;
import java.util.ArrayList;
import java.util.Calendar;
import model.Candidate;
import model.Experience;
import model.Fresher;
import model.Intern;

/**
 *
 * @author DELL
 */
public class Manager {
    
    public static int menu (){
        System.out.println("        MENU        ");
        System.out.println("[1]. Experience");
        System.out.println("[2]. Fresher");
        System.out.println("[3]. Intership");
        System.out.println("[4]. Searching");
        System.out.println("[5]. exit");
        System.out.print("Enter choice:     ");
        int choice = Validate.checkInputChoice(1,5);
        return choice;
    }
    // nhap thong tin co ban cua ung vien
    public static void createCandidate( ArrayList<Candidate> candidates, int type) {
        while (true) {
            System.out.print("\nEnter your ID:  ");
            String id = Validate.checkInputString();
            System.out.print("Enter your first name:  ");
            String firstName = Validate.checkInputString();
            System.out.print("Enter your last name:   ");
            String lastName = Validate.checkInputString();
            System.out.print("Enter your birth date:  ");
            int birthDate = Validate.checkInputChoice(1900, Calendar.getInstance().get(Calendar.YEAR) );
            
            System.out.print("Enter your address: ");
            String address = Validate.checkInputString();
            System.out.print("Enter your phone number:    ");
            String phone = Validate.checkInputPhone();
            System.out.print("Enter your email address:   ");
            String email = Validate.checkInputEmail();
            
            Candidate candidate = new Candidate( id, firstName, lastName, birthDate, address, phone, email, type);
            // Kiem tra ID cua ung vien co ton tai khong
            
            if (Validate.checkIdExist(candidates, id)) {
                switch (type) {
                    case 0: createExperience(candidates, candidate); break;
                    case 1: createFresher(candidates, candidate);    break;
                    case 2: createIntern(candidates, candidate);     break;
                }
            } else {
                return ;
            }
            System.out.print("Would you like to continue create new Candidate, type Y to continue - N to stop :    ");
            if (!Validate.checkInputYN() ){
                return;
            }
        }
    }
    
    // tiep tuc tao thong tin theo tung phan loai ung vien
    public static void createExperience(ArrayList<Candidate> candidates, Candidate candidate) {
        System.out.print("Enter your year of Experience:      ");
        int yearExperience = Validate.checkExperience(candidate.getBirthDate() );
        System.out.print("Enter your professinal skill:       ");
        String professionalSkill = Validate.checkInputString();
        //Experience ex = new Experience(yearExperience, professionalSkill);
        candidates.add(new Experience(yearExperience, professionalSkill,
                        candidate.getId(), candidate.getFirstName(), candidate.getLastName(),
                        candidate.getBirthDate(), candidate.getAddress(),candidate.getPhone(), 
                        candidate.getEmail(), candidate.getCandidateType() ) );
        
        System.out.println("* Create successful candidate");
    }
    
    
    public static void createFresher(ArrayList<Candidate> candidates, Candidate candidate) {
        System.out.print("Enter your graduation Date:     ");
        String graduationDate = Validate.checkInputString();
        System.out.print("Enter your graduation Rank:     ");
        String graduationRank = Validate.checkInputGraduationRank();
        System.out.print("Enter your education:       ");
        String education = Validate.checkInputString();
        
        candidates.add( new Fresher( graduationDate, graduationRank, education, 
                        candidate.getId(), candidate.getFirstName(), candidate.getLastName(),
                        candidate.getBirthDate(), candidate.getAddress(),candidate.getPhone(), 
                        candidate.getEmail(), candidate.getCandidateType()) );
        System.out.println("* Create successful candidate");
    }
    
    
    public static void createIntern(ArrayList<Candidate> candidates, Candidate candidate) {
        System.out.print("Enter your major:   ");
        String major = Validate.checkInputString();
        System.out.print("Enter your semester:     ");
        String semester = Validate.checkInputString();
        System.out.print("Enter your university name: ");
        String universityName = Validate.checkInputString();
        
        candidates.add( new Intern( major, semester, universityName,
                        candidate.getId(), candidate.getFirstName(), candidate.getLastName(),
                        candidate.getBirthDate(), candidate.getAddress(),candidate.getPhone(), 
                        candidate.getEmail(), candidate.getCandidateType() )  );
        System.out.println("* Create successful candidate");
    }
    
    
    public static void searchCandidate(ArrayList<Candidate> candidates) {
        printListNameCandidate(candidates);
        System.out.println("Enter an candidate name:    ");
        String nameSearch = Validate.checkInputString();
        System.out.println("Enter type of candidate:    ");
        int candidateType = Validate.checkInputChoice(0, 2);
        for ( Candidate c : candidates) {
            if (c.getCandidateType() == candidateType && 
                    c.getFirstName().contains(nameSearch) ||
                    c.getLastName().contains(nameSearch)
                ) {
                System.out.println(c.toString());
            } 
        }
    }
    
    
    
    public static void printListNameCandidate( ArrayList<Candidate> candidates) {
        System.out.println("========== EXPERIENCE CANDIDATE=============");
        for (Candidate c : candidates) {
            if (c instanceof Experience) {
                System.out.println(c.getFirstName() + " " + c.getLastName());
            }
        }
        System.out.println("========== FRESHER CANDIDATE   =============");
        for (Candidate c : candidates) {
            if (c instanceof Fresher) {
                System.out.println(c.getFirstName() + " " + c.getLastName());
            }
        }
        System.out.println("========== INTERN CANDIDATE    =============");
        for (Candidate c : candidates) {
            if (c instanceof Intern) {
                System.out.println(c.getFirstName() + " " + c.getLastName());
            }
        }
    }
    
    
    
    

}
