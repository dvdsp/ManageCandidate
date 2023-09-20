/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class Fresher extends Candidate{
    private String graduationDate;
    private String graduationRank;
    private String education;
    
    public Fresher() {
        super();
    }
    public Fresher(String graduationDate, String graduationRank, String education,
                    String id, String firstName, String lastName, int birthDate, 
                    String address, String phone, String email, int candidateType
                   ) {
        super(id, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }
    
    // get
    public String getGraduationDate() {
        return graduationDate;
    }
    public String getGraduationRank() {
        return graduationRank;
    }
    public String getEducation() {
        return education;
    }
    
    //set
    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public void setEducation(String education) {
        this.education = education;
    }
    
    
    
}
