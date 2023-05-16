/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khwaleed
 */
package StudentProgram;
        
public class StudentModel {
    private String studentName;
    private String studentID;
    
    public StudentModel(String studentName, String studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }
    
    public String getStudentName() {
        return studentName;
    }
    
    public String getStudentID() {
        return studentID;
    }
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}//end class StudentModel
