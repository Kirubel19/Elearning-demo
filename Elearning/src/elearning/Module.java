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
public class Module extends Lesson {
    private String moduleObjective;
    private String moduleDescription;
    private int moduleId;
    private String moduleTitle;
    private ArrayList module;
    private ArrayList singleModule;
   
    
    public Module(){
    }
    
    public boolean createModule(String moduleObjective,String moduleDescription,String moduleTitle){
        System.out.println("Module Created");
        return true;
    }
    
    public boolean updateModule(int moduleId,String moduleObjective,String moduleDescription,String moduleTitle){
        System.out.println("Module Updated");
        return true;
    }
    public boolean deleteModule(int moduleId){
        System.out.println("Module Deleted");
        return true;
    }
    public ArrayList viewModule(){
        System.out.println("View Module");
        return module;
    }
    public ArrayList viewsingleModule(){
        System.out.println("View Module");
        return singleModule;
    }
}
