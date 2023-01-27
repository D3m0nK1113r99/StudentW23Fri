/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentw23fri;

/**
 *
 * @author d3m0n
 */
public class StudentW23Fri {
    private String studentId;
    private String studentName;
    private String address;



    public StudentW23Fri(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
        public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
