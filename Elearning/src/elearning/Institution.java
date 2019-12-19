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
public class Institution extends Course {
    private String fullName;
    private ArrayList address;
    private String description;
    private String institutionId;
    
    Authentication auth = new Authentication();
    
    public Institution(){
      
        
        
    }
    
    public boolean activateInstructor(){
        System.out.println("Activate Instructor");
        auth.getId();
        return true;
    }
     public boolean deactivateInstructor(){
        System.out.println("Deactivate Instructor");
        auth.getId();
        return true;
    }
     
      public boolean activateCourse(){
          getCourseId();
        System.out.println("Course Activated!");
        return true;
    }
        public boolean deactivateCourse(){
            getCourseId();
        System.out.println("Course Deactivated!");
        return true;
    }
        
    
}
