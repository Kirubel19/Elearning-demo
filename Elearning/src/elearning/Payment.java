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
public class Payment extends Institution{
    private int paymentId;
    private String name;
    private int amount;
    private int cardNumber;
    
   
   
    
    public boolean pay(String name,String cardnumber){
        System.out.println("payed");
        return true;
    }
    
    private boolean createPayment(int amount){
        System.out.println("create Payment");
        
        return true;
    }
    
}
