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
public class Institution extends Authentication {
    private String fullName;
    private ArrayList address;
    private String description;
    private String institutionId;
    
    
    public Institution(){
        
    }
    
    public void activateInstution(){
        System.out.println("Activate Instution");
    }
     public void deactivateInstution(){
        System.out.println("Deactivate Instution");
    }
        
    
}
