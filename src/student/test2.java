/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Gan Hao Xian
 */
public class test2 
{
      public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("19WMD01909","HX");
        s1.setName("Ali");
        s1.setStudentID("WWE001");
        s1.addQuiz(10);
        s2.addQuiz(8);

        System.out.println("Name :"+s1.getName());
        System.out.println("Student ID :"+s1.getStudentID());
        System.out.println("Number Of Quiz Taken :"+s1.getNumOfQuizTake());
        System.out.println("Total Score :"+s1.getTotalQuizScore());
        System.out.println("Average score :"+s1.getAverageScore()+"\n");
        
        
        
        System.out.println("Name :"+s2.getName());
        System.out.println("Student ID :"+s2.getStudentID());
        System.out.println("Number Of Quiz Taken :"+s2.getNumOfQuizTake());
        System.out.println("Total Score :"+s2.getTotalQuizScore());
        System.out.println("Average score :"+s2.getAverageScore()+"\n");
          
    }
    
}
