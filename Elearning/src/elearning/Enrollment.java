/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elearning;

import java.util.ArrayList;


/**
 *
 * @author kirubel
 */
public class Enrollment {
    private String dateOfEnrollment;
    private ArrayList enrollment;
    private String enrollmentChoice;
   
   
    public Enrollment(){
    }
    
    
    public boolean enroll(String dateOfEnrollment,String enrollmentChoice){
        System.out.println("Enrolled!!");
       return true;
    }
    
     public ArrayList viewEnrollment(){
         
        System.out.println("View Enrollement!!");
      return  enrollment;
    }
}
