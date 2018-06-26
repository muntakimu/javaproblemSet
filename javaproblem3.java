
package javaproblem1;

import java.io.File;
import java.util.Scanner;


public class javaproblem3 {
 public static void main(String[]args)
    {
        System.out.print("Enter the directory : ");
        Scanner sc=new Scanner(System.in);
        String path=sc.nextLine();;
        
        
        File Dir = new File(path);
        getAllFiles(Dir);
    }
    private static void getAllFiles(File curDir) {

        File[] filesList = curDir.listFiles();
        for(File f : filesList){
            if(f.isDirectory()){
                getAllFiles(f);
                System.out.println("Directory : "+f.getName());
            }
                
            if(f.isFile()){
                System.out.println("File : "+f.getName());
            }
        }

    }
}
