/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproblem1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class javaproblem6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      String passwd =sc.nextLine();
      String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{10,}";
      if(passwd.matches(pattern)==false){
          System.out.println("InValid password");
      }
      else
     {
              System.out.println("Valid password"); 
              };
   }
    
    
}
