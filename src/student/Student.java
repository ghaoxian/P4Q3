/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;


        
public class Student {

   private String studentID;
   private String name;
   private int numOfQuizTake;
   private int totalQuizScore;
   
   public Student()
   {
       
   }
    public Student(String id,String sname)
   {
       this.studentID=id;
       this.name=sname;
   }
   public void addQuiz(int score)
    {
        if(score>= 0 && score <= 10)
        {
             totalQuizScore+=score ;
              numOfQuizTake++;
            
        }
        else
        {
           System.out.println("Invalid score!");
        }
    }
    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int getNumOfQuizTake() {
        return numOfQuizTake;
    }

    public int getTotalQuizScore() {
        return totalQuizScore;
    }

    public void setStudentID(String id) {
        studentID = id;
    }

    public void setName(String sname) {
        name = sname;
    }

  
   
 
    public double getAverageScore()
    {
        
        return totalQuizScore/(double)numOfQuizTake;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
