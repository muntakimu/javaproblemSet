/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproblem1;
class Area{
    public void area(float x){
        System.out.println("The area of Square is "+x*x);
    }
     public void area(float x,float y){
        System.out.println("The area of rectangle is "+x*y);
    }
      public void area(double x,double y){
        System.out.println("The area of triangle is "+.5*x*y);
    }
       public void area(double x){
        System.out.println("The area of circle is "+3.1416*x*x);
    }
    
    
    
    
}
public class javaproblem1 {

   public void calculation() {
        Area ar=new Area();
        ar.area(5);
        ar.area(10, 20);
        ar.area(20.0, 5.0);
        
    }
    
}
