/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.testerjunit;

/**
 *
 * @author Elev
 */
public class MyMath {
    
    public int add(String a, String b){       
        int tal1, tal2; 
        try {
            tal1 = Integer.parseInt(a);
            tal2 = Integer.parseInt(b);
            return tal1+tal2;
        } catch (Exception e) { //Vilket exceptions är det vi får här? kan förbättras.
            throw new NumberFormatException("Du måste ha siffror");
        }
    }
    
    public boolean isEqual(int a, int b){
        return a == b;
    }
    
    public int difference(int a, int b){
       if(a > b){
           return a - b;
       }
       else if(a < b){
           return b - a;
       }
        return 0;
    }
    
    public int difference(String a,String b){
        //skillnaden mellan a och b; 
        int i = Integer.parseInt(a);
        int j = Integer.parseInt(b);
        
        
        if( i > j){
            return i - j;
        }
        else if(i < j){
            return j - i;
        } 
        
        return 0;
        
        //om a = 4 och b = 2 -> 2
        
        //om a = 2 och b = 4 -> 2
        
        //talen skall även parsas 
        
        //Fel förväntas om man lägger in fel.
    }

}
