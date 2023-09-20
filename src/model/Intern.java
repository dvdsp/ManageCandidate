/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class Intern extends Candidate{
    
    private String major;
    private String semester;
    private String universityName;
    
    
    public Intern(){
        
    }
    public Intern(String major, String semester, String universityName,
                String id, String firstName, String lastName, int birthDate,
                String address, String phone, String email, int candidateType
                ) {
        super(id, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }
    
    // get
    public String getMajor() {
        return major;
    }

    public String getSemester() {
        return semester;
    }

    public String getUniversityName() {
        return universityName;
    }
    
    // set
    public void setMajor(String major) {
        this.major = major;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    
    
    
    
    
    

    
    
}
