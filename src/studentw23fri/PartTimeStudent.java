/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentw23fri;

/**
 *
 * @author d3m0n
 */
public class PartTimeStudent extends StudentW23Fri {
    
    private int numOfcourse;
    
    public PartTimeStudent(int numOfcourse, String studentId, String studentName) {
        super(studentId, studentName);
        this.numOfcourse = numOfcourse;
    }

    
    public int getNumOfcourse {
        return numOfcourse;    
    }

}
