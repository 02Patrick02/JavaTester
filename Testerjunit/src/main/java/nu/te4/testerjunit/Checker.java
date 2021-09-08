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
public class Checker {
    public boolean isPalindrome(String input){
        if(input == null){
            throw new IllegalArgumentException("Argument can't be null");
        }
        
        if(input.equals(reverse(input))){
            return true;
        }
        else{
            return false;
        }
    }
    
    private String reverse(String input){
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }
        
        return reverse;
    }
    
    public boolean isPrimeNumber(int number) {
        if(number < 0) {
            throw new IllegalArgumentException("Argument cant be lower than zero");
        }
        for (int i = 0;i <= Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}