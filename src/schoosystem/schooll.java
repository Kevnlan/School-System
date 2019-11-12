/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoosystem;

//import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 *
 * @author Hp
 */
class schooll {
    
    private int id;
    private String name;
    private String courses;
    private String lecturerid;
    private String studentid;
    
    public schooll(int id,String name,String courses,String lecturerid,String studentid){
        this.id=id;
        this.name=name;
        this.courses=courses;
        this.lecturerid=lecturerid;
        this.studentid=studentid;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the courses
     */
    public String getCourses() {
        return courses;
    }
    public String getLecturerid(){
        return lecturerid;
    }
    public String getStudentid(){
        return studentid;
    }

    
}
