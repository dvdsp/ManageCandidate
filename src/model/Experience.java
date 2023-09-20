/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class Experience extends Candidate{
    private int yearExperience;
    private String professionalSkill;
    
    public Experience() {
        super();
    }
    
    public Experience(int yearExperience, String professionalSkill,
                      String id, String firstName, String lastName, int birthDate, 
                      String address, String phone,String email, int candidateType  
                    ){
        super(id, firstName, lastName, birthDate, address, phone, email, candidateType );
        this.yearExperience = yearExperience;
        this.professionalSkill = professionalSkill;
    }
    
    //get
    public int getYearExperience() {
        return yearExperience;
    }
    
    public void setYearExperience(int yearExperience) {
        this.yearExperience = yearExperience;
    }
    
    // set
    public String getProfessionalSkill() {
        return professionalSkill;
    }

    public void setProfessionalSkill(String professionalSkill) {
        this.professionalSkill = professionalSkill;
    }
    
    
    
    
    
    
 
    
    
}
