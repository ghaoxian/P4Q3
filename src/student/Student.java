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
    public Student(String studentID,String name)
   {
       this.studentID=studentID;
       this.name=name;
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

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumOfQuizTake(int numOfQuizTake) {
        this.numOfQuizTake = numOfQuizTake;
    }

    public void setTotalQuizScore(int totalQuizScore) {
        this.totalQuizScore = totalQuizScore;
    }
   
    public int addQuiz(int score)
    {
       totalQuizScore= score * numOfQuizTake;
       
       return totalQuizScore;
    }
    public int getAverageScore()
    {
        
        return totalQuizScore/numOfQuizTake;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
