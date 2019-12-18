package Assessment.view;
import Assessment.model.Item;

import java.util.ArrayList;
import Assessment.model.Book;
import Assessment.model.Journal;

public class ItemView 
{
    public ItemView()
    {
        
    }
    
    public void displaySingleStudent(Item s)
    {
        System.out.println("Diplay Student Details");
        System.out.println("Name: " + s.getName());
        System.out.println("ID: " + s.getAuthor());
        System.out.println(s.getPublisher() + "Age: ");
        System.out.println("Number of Pages: " + s.getNoOfPages());
    }
    
    public void displayAllStudents(ArrayList<Item> sList)
    {
        if(sList.isEmpty())
        {
            System.out.println("Student list is empty");
        }else
        {
        System.out.println("Displaying Students");

            for(Item s : sList)
            {
                System.out.println("");
                System.out.println("Name: " + s.getName());
                System.out.println("ID: " + s.getId());
                System.out.println("Age: " + s.getAge());
                System.out.println("");
        
                
                if(s instanceof Book)
                {
                    System.out.println("Full Time Student");
                    System.out.println("Course Tutor: " + ((Book) s).getCourseTutor());
                    System.out.println("Course Loan:" + ((Book)s).getStudentLoan());
                }
                else if (s instanceof Journal)
                {
                    System.out.println("Part Time Student");
                    System.out.println("Fees Paid: " + ((Journal)s).getFinancePaid());
                    
                }
            }
        }
    }
    
    public void displayTotalItemCost(ArrayList<Item> itemList)
    {
        float runningTotal = 0;
        float totalCost = 0;
        System.out.println("Total Item Cost");
        
        for(Item s : itemList)
        {
            runningTotal += s.getAge();
        }
        
        totalCost = runningTotal / (float) itemList.size();
        
        System.out.println("Total cost of all items is: £" + totalCost);
    }
    
    public void displayAverageFullTimeFinance(ArrayList<Item> studentList)
    {
        double runningTotal = 0;
        double averageFinance = 0;
        int numberOfFTStudents = 0;
                
        for(Item s: studentList)
        {
            if(s instanceof Book)
            {
                runningTotal += ((Book) s).getStudentLoan();
                numberOfFTStudents++;
            }
        }
        
        averageFinance = runningTotal / (float) numberOfFTStudents;
        
        System.out.println("Average Student Loan is: " + averageFinance);

    }
    
    public void displayMessage(String message)
    {
        System.out.println("");
        System.out.println(message);
        System.out.println("");
    }
}

