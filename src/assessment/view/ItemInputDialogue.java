/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment.view;

import Assessment.model.Item;
import java.util.Scanner;
import Assessment.model.Book;
import Assessment.model.Journal;

public class ItemInputDialogue 
{
    
    public ItemInputDialogue()
    {
        
    }
    
    public Item inputItemDetails()
    {
        Scanner s = new Scanner(System.in);
        Item item = null;
        int input = 0;
        
        while(input !=4)
        {
            System.out.println("What kind of item");
               System.out.println("");
               System.out.println("1. Books");
               System.out.println("2. Journals");
               System.out.println("3. Audio/Visual Items");
               System.out.println("4. Exit menu");

               input = s.nextInt();   
                
            switch(input)
            {
                case 1:
                    item = inputBook();
                    input = 4;
                    break;
                case 2:
                    item = inputJournal();
                    input = 4;
                    break;
                case 3:
                    item = inputAVItem();
                    break;
                case 4:
                    input = 4;
                    break;
                default:
                    System.out.println("Wrong input: Please enter valid option");
            }
        
        }
        return item;
    }
    public Book inputBook(){
        Scanner s = new Scanner(System.in);
        Book item;
        String name;
        String author;
        int itemID;
        String publisher;
        int noOfPages;
        String type;
        String location;
        float cost;
        
        System.out.println("Book Input");
        System.out.println("Please enter the following book details:");
        System.out.println("1. Name: ");
        name = s.nextLine();
        
        System.out.println("2. Author: ");
        author = s.nextLine();
        
        System.out.println("3. Item ID: ");
        itemID = s.nextInt();
        s.nextLine();
        
        System.out.println("4. Publisher: ");
        publisher = s.nextLine();
        
        System.out.println("5. Number of Pages:");
        noOfPages = s.nextInt();
        s.nextLine();
        
        System.out.println("6. Type");
        type = s.nextLine();
        
        System.out.println("7. Location:");
        location = s.nextLine();
        
        System.out.println("7. Cost:");
        cost = s.nextFloat();
        
        item = new Book(name, author, itemID, publisher, noOfPages, type, location, cost);
        
        return item;
    }
    
    public Journal inputJournal(){
        Scanner s = new Scanner(System.in);
        Journal item;  
        String name;
        String author;
        int itemID;
        String publisher;
        int noOfPages;
        String type;
        String location;
        float cost;
        return null;
        
    }
    
    public String inputStudentId()
    {
        return null;
    }
    
    public void editStudent(Item s)
    {
        
    }

    private Item inputAVItem() {
        return null;
    }
    
}
