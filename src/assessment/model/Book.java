/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessment.model;

/**
 *
 * @author James
 */
public class Book extends Item
{
    protected String courseTutor; //protected
    protected double studentLoan; //protected
    
    public Book() //Constructor
    {
        super(); //goes to default constructor of Student class
        
        this.courseTutor = "Anonymous";
        this.studentLoan = 0;
    }
    
    public Book(String name, int age, String id, String courseTutor, double loan) //Constructor for student parameters
    {
        super(name, age, id, ""); //Sending the variables to the constructor with arguments
        
        this.courseTutor = courseTutor;
        this.studentLoan = loan;
    }

    private Book(String name, int age, String id, String string) {
    }
    
    public String getCourseTutor()
    {
        return courseTutor;
    }
    
    public double getStudentLoan()
    {
        return studentLoan;
    }

}