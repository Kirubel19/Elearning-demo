/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elearning;

import java.util.ArrayList;
import elearning.Authentication;

/**
 *
 * @author kirubel
 */
public class Student extends Course {
    private String fullName;
    private String email;
    private Integer studentId;
    private ArrayList address;
    private String gender;
    private String birthDay;
    private String occupation;
    private String educationalLevel;
    private ArrayList interestedCourse;
    
    
    public Student(){
        
       
    }
  public boolean  createStudent(String fullName,String gender,String occupation,String eductionLevel,ArrayList interestedCourse,ArrayList address){
      System.out.println("Student created");
      return true;
  }
   public boolean  updateStudent(int studentId,String fullName,String gender,String occupation,String eductionLevel,ArrayList interestedCourse,ArrayList address){
      System.out.println("Student created");
      return true;
  }
    public void isEligibale(){
        System.out.println("isEligibale");
    }
    
    
}
