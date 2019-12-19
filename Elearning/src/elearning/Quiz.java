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
public class Quiz {
    private int questionId;
    private int questionNo;
    private String questionContents;
    private String questionChoice;
    private int questionPoint;
    private int quizPoint;
    private String quizTitle;
    private int quizId;
    private ArrayList quiz;
    private ArrayList question;
    private int result;
    
    
    
    
    
    public boolean addQuiz(String quizTitle,int quizPoint){
        System.out.println("add Quiz");
        return true;
    }
    public boolean addQuestion(String questionContent,String questionChoice,int questionPoint){
        System.out.println("add Question");
        return true;
        
    }
    public boolean deleteQuiz(int quizId){
        System.out.println("delete question");
        return true;
    }
    public boolean deleteQuestion(int questionId){
        System.out.println("delete question");
        return true;
    }
    public ArrayList viewQuiz(){
        System.out.println("view Quiz");
        return quiz;
    }
    public ArrayList viewQuestion(){
         System.out.println("view Question");
        return question;
    }
    public int calculateQuiz( int questionPoint){
        System.out.println("calculate Quiz");
        return result;
    }
    public boolean updateQuestion(int questionId,String questionContent,String questionChoice,int questionPoint){
        System.out.println("update Question");
        return true;
    }
    public boolean updateQuiz(int quizId,String quizTitle,int quizPoint){
        System.out.println("update Quiz");
        return true;
    }
    public int getResult(){
       
        return this.result;
        
    }
    public void setResult(int result){
        this.result=result;
        
    }
}
