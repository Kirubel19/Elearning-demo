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
public class Instructor  extends Course {
    
    private String fullName;
    private int instructorId;
    private String worksIn;
    private String Bio;
    private String level;
    private String about;
    private int rating;
    public Instructor(){
       
        
    }
    
    public boolean createInstructor(String worksIn,String bio,String about,int rating , String fullName,String level){
        
        System.out.println("create instructor");
        
        return true;
    }
     public boolean updateInstructor(int instructorId,String worksIn,String bio,String about,int rating , String fullName,String level){
        
        System.out.println("create instructor");
        
        return true;
    }
    
    
    
}
