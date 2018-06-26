
package javaproblem1;
class Calculate{
    public void cal(int x,int y){
        System.out.println("The Sum is "+(x+y));
    }
     public void cal(double x,int y){
        System.out.println("The Sub is "+(x-y));
    }
      public void cal(double x,double y){
        System.out.println("The div is "+(x/y));
    }
       public void cal(double x,float y){
        System.out.println("The multiplication is "+x*y);
    }
    
    
    
    
}
public class javaproblem2 {

    public void calculation() {
        
        Calculate cu=new Calculate();
        cu.cal(10, 20);
        cu.cal(20.0, 30);
        cu.cal(30.0,(float) 2.0);
        cu.cal(30.0,2.0);
        
    }
    
}
