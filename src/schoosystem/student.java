/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoosystem;

/**
 *
 * @author Hp
 */
public class student {
    private int id;
    private String admno;
    private String name;
    private String lastname;
    private String school;
    private String course;
    private String gender;
    
    public student(int id,String admno,String name,String lastname,String school,String course,String gender){
        this.id=id;
        this.admno=admno;
        this.name=name;
        this.lastname=lastname;
        this.school=school;
        this.course=course;
        this.gender=gender;
    }
    public int getID(){
        return id;
    }
    public String getAdmno(){
        return admno;
    }
    public String getName(){
        return name;
    }
    public String getlastName(){
        return lastname;
    }
    public String getSchool(){
        return school;
    }
    public String getCourse(){
        return course;
    }
    public String getGender(){
        return gender;
    }
}
