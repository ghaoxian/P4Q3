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
   public static double contribution;
   public Student()
   {
       this("","");
   }
   // public Student(String id,String sname)
   //{
   //    studentID=id;
   //    name=sname;
  // }
    public Student(String studentID,String name)
   {
       this.studentID=studentID;
       this.name=name;
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

  public static void setContribution (double contribution){
    	Student.contribution = contribution;
    }
    public static double getContribution(){
    	return contribution;
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
        this.studentID =studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

  
   
 
    public double getAverageScore()
    {
        
        return totalQuizScore/(double)numOfQuizTake;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
