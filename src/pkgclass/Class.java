/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass;

/**
 *
 * @author seane
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here]
        Student test= new Student();
        ArrayList<Student> array= new ArrayList<>();
        Scanner scan= new Scanner(System.in);
        System.out.println("Would you like to start a new class roll? Y/N");
        String answer= scan.next();
        if(answer.equalsIgnoreCase("Y")){
             test.start(array);
        }
        else
                {
        System.exit(0);
            }        
        int ans2;
       do{
        test.roll(array);
        ans2=scan.nextInt();

       }while (ans2==1);
        }
    }
    
    

