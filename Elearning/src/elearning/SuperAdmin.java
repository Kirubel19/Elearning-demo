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
public class SuperAdmin  extends Course{
    private Integer adminId;
    private String catagoryName;
    private int catagoryId;
    Authentication auth = new Authentication();
    
    public SuperAdmin(){
       
        
    }
    public boolean createCatagory(String catagoryName){
        System.out.println("Catagory Created!");
        return true;
    }
    public boolean deleteCatagory(int catagoryId){
        System.out.println("Catagory Deleted!");
        return true;
    }
    
    public boolean activateInstitution(){
          auth.getId();
              System.out.println("Institution Activated!");
              return true;
    }
     public boolean deactivateInstitution(){
         auth.getId();
              System.out.println("Institution deActivated!");
              return true;
      }
    
}
