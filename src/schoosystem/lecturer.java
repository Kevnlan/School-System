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
public class lecturer {
    private int id;
    private String name;
    private String lastname;
    private String school;
    private String course;
    private String gender;
    private String unit;
    
    public lecturer(int id, String name,String lastname,String school,String course,String gender,String unit){
        this.id=id;
        this.name=name;
        this.lastname=lastname;
        this.school=school;
        this.course=course;
        this.gender=gender;
        this.unit=unit;
    }
    public int getID(){
        return id;
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
    public String getUnit(){
        return unit;
    }
    
}
