/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author seane
 */
class Student {
    public Student(String name, int ID, int year, String con) {
        this.name = name;
        this.ID = ID;
        this.year = year;
        this.con = con;
    }
    private String name;
    private int ID;
    private int year;
    private String con;
    Scanner scan=new Scanner(System.in);
    public int ans2;
    public String answer2;

    

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", ID=" + ID + ", year=" + year + ", comment on Java=" + con + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCon() {
        return con;
    }

    public void setCon(String con) {
        this.con = con;
    }
    public void addStudent(){
        
        System.out.println("Enter your name: ");
        Scanner scan=new Scanner(System.in);
        String name=scan.next();
        this.setName(name);
        System.out.println("Enter your student ID number:");
        int ID = scan.nextInt(); 
        this.setID(ID);
        System.out.println("What is your academic year? ");
        int year = scan.nextInt();
        this.setYear(year);
        System.out.println("How comforable are you with object oriented programming? ");
        String con= scan.next();
        this.setCon(con);
        
    }
    public void roll (ArrayList<Student> array){
        int number;
        int counter;
        String lookup;
        System.out.println("Would you like to 1: end the program,2: add more students,3: remove a student, or 4: lookup a student? ");
         number=scan.nextInt();
         if (number==4){
         
             counter=0;
            System.out.println("Enter the name of the student you want to lookup: ");
                lookup=scan.next();
            for (int i=0; i<array.size();i++){
                if (array.get(i).getName().equalsIgnoreCase(lookup)){
                System.out.println(array.get(i));
            }else   {
            counter++;
                }
           }if(counter!=array.size()-1){System.out.println("Student not found...");}
        }if(number == 1){
            System.exit(0);
        }
        if(number==2){
             for(int i=0;i<1;i++){
                Student newS =new Student ("new", 1, 2, "new");
                newS.addStudent();
                array.add(newS);
                 System.out.println("Would you like to add another student? Y/N");
                 answer2=scan.next();
                 if (answer2.equalsIgnoreCase("Y")){
            i--;
                 }else{
                 }
        }
        }
        if(number==3){
            System.out.println("Enter the name of the student you want to remove: ");
                lookup=scan.next();
                 for (int i=0; i<array.size();i++){
            if (array.get(i).getName().equalsIgnoreCase(lookup)){
                array.remove(i);
            }}
        }else{}
            System.out.println("Would you like to end the program, or perform more actions? 1. More, 2. End ");
        
    }
    public void start(ArrayList<Student>array){
        for(int i=0;i<1;i++){
                Student newS =new Student ("new", 1, 2, "new");
                newS.addStudent();
                array.add(newS);
                 System.out.println("Would you like to add another student? Y/N");
                 answer2=scan.next();
                 if (answer2.equalsIgnoreCase("Y")){
                              i--;
                 }else{
                 }
             }
        
    }

    public Student() {
    }
    
}
