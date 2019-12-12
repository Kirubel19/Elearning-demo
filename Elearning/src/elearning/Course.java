package elearning;

import .*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kirubel
 */
public class Course {
    private Integer courseId;
    private String courseName;
    private String courseDescription;
    private String courseCatagory;
    private String photoUrl;
    private String level;
    
    public Course(){
    }
    public void createCourse(){
        System.out.println("Course Created!");
    }
      public void updateCourse(){
        System.out.println("Course Updated!");
    }
       public void activateCourse(){
        System.out.println("Course Activated!");
    }
        public void deactivateCourse(){
        System.out.println("Course Deactivated!");
    }
        public void viewCourse(){
            System.out.println("Course viewed");
        }
       public void searchCourse(){
            System.out.println("Search result....");
        }
       
      
      
    
}
