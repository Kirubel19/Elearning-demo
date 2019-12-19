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
public class Discussion extends Course{
   
    private int discussionId;
    private String description;
    private String comment;
    private ArrayList comments;
    private String discussionTitle;
    private int commentId;
    Discussion(){
    }
    
    public boolean postComment(String comment){
        System.out.println("Comment Posted!");
        return true;
    }
    public ArrayList viewComment(){
        System.out.println("View Comment");
        return comments;
    }
    public boolean updateComment(int commentId){
         System.out.println("View Comment");
        return true;
        
    }
    public boolean createDiscussion(String description ,String discussionTitle){
         System.out.println("create Discussion");
        return true;
        
    }
    public boolean deleteDiscussion(int discussionId){
         System.out.println("delete discussion");
        return true;
        
    }
    
}
