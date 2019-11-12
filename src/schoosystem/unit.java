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
public class unit {
    private int id;
    private String name;
    private String school;
    private int schoolid;
    private int lecturerid;
    private int studentid;
    
    public unit(int id,String name,String school,int schoolid,int lecturerid,int studentid){
        this.id=id;
        this.name=name;
        this.school=school;
        this.schoolid=schoolid;
        this.lecturerid=lecturerid;
        this.studentid=studentid;
    }
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSchool(){
        return school;
    }
    public int getSchoolid(){
        return schoolid;
    }
    public int getLecturerid(){
        return lecturerid;
    }
    public int getStudentid(){
        return studentid;
    }
            
    
}
