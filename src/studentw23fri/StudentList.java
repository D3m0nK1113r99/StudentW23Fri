/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentw23fri;

/**
 *
 * @author d3m0n
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //StudentW23Fri s1 = new StudentW23Fri("s1", "TK");
        StudentW23Fri[] StudentList = new StudentW23Fri[3];
        StudentList[0] = new StudentW23Fri("s1", "TK");
        StudentList[1] = new StudentW23Fri("s2", "abc");
        StudentList[2] = new StudentW23Fri("s3", "xyz");
        
        for(int i = 0; i < StudentList.length; i++) {
            System.out.println(StudentList[i].getStudentName());
        }
    }
    
}
