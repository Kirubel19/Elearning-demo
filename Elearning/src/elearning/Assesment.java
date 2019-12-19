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
public class Assesment extends Quiz{
    private int assessment_id;
    private String weight;
   
    private int totalGrade;
    private int quizResult;
    private ArrayList grades;
   
    
    Assesment(){
        
        
          
         
          
    }
   
 
    
    public int calculateGrade(int quizResult){
        
        System.out.println("calculategrade");
        return quizResult;
        
    }
    public ArrayList viewGrade(){
        System.out.println("view grades");
        return grades;
    }
   
}
