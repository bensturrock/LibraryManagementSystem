/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessment.model;

/**
 *
 * @author 1623858
 */
public class Item
{
    protected String name;
    protected String author;
    protected String publisher;
    protected int noOfPages;
        
    public Item()
    {
        name = "";
        author = "";
        publisher = "";
        noOfPages = 0;
        
            }
    
    public Item(String name, String author, String publisher, int noOfPages)
    {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.noOfPages = noOfPages;
        
        }
    public void setName(String name)
    {
         this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setAuthor(String author)
    {
         this.author = author;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }
    
    public String getPublisher()
    {
        return publisher;
    }
    
    public void setnoOfPages(int noOfPages)
    {
        this.noOfPages = noOfPages;
    }
    
    public int getnoOfPages()
    {
        return noOfPages;
    }
    
    public void displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Name: " + author);
        System.out.println("No of Pages: " + noOfPages);
        System.out.println("Student Id: " + publisher);
    }

}
