/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elearning;

/**
 *
 * @author kirubel
 */
public class Lesson {
    private int lessonId;
    private String lessonTitle;
    private String lessonContent;
    private int lessonNo;
    public Lesson(){
    }
    
    public void getLesson(){
    
        System.out.println("Get Lesson");
    }
    
     public void addLesson(){
    
        System.out.println("Lesson added");
    }
     
      public void updateLesson(){
    
        System.out.println("Lesson Updated");
    }
       public void deletedLesson(){
    
        System.out.println("Lesson Deleted");
    }
}
