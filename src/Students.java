/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khwaleed
 */
package StudentProgram;

public class Students {
    public static void main(String[] args) {
        StudentModel[] students = new StudentModel[5];
        
        students[0] = new StudentModel("Waleed Khan", "12345");
        students[1] = new StudentModel("John Doe", "45678");
        students[2] = new StudentModel("Keanu Reeves", "98756");
        students[3] = new StudentModel("Dwayne Johnson", "45216");
        students[4] = new StudentModel("Neil Armstrong", "44523");
        
        for (int i = 0; i < students.length; i++) {
            System.out.println("Name: " + students[i].getStudentName());
            System.out.println("ID: " + students[i].getStudentID());
            System.out.println();
        }//end for loop
    }//end main
}//end class Students