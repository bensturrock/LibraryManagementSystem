/**
 * The purpose of this class is to act as the main controller holding the
 * model and view classes.
 * 
 */
package assessment.controller;

import Assessment.view.MainMenuView;
import Assessment.view.Header;
import Assessment.model.Item;
import Assessment.view.ItemInputDialogue;
import Assessment.view.ItemView;

import java.util.ArrayList;

/**
 *
 * @author j.oliver
 */
public class Assessment 
{
    private MainMenuView mainMenu;
    private Header header;
    private ItemInputDialogue itemInput;
    private ItemView itemView;
    
    //Data Model
    private ArrayList<Item> itemList;
    
    /**
     *
     */
    public Assessment()
    {
        mainMenu = new MainMenuView();
        header = new Header();
        itemInput = new ItemInputDialogue();
        itemView = new ItemView();
        
        itemList = new ArrayList();
    }
    
    /**
     * 
     */
    public void runMainMenu()
    {
       int choice;
       boolean quit = false;

       while(!quit)
       {
            header.displayHeader("Arbroath Library", "Main Menu");
            choice = mainMenu.displayMainMenu();

            switch(choice)
            {
                case 1:
                    addItem();                    
                    break;
                case 2:
                    viewAllItems();
                    break;
                case 3:
                    viewStudentAverageAge();
                    break;
                case 4:
                    deleteItem();
                    break;
                case 5:
                    editItem();
                    break;
                default:
                    System.out.println("Please choose a valid option");           
            }
       }
    }
    
    /**
     *
     */
    public void addItem()
    {
        Item item;
        
        item = itemInput.inputItemDetails();
        
        itemList.add(item);
    }
    
    /**
     *
     */
    public void viewAllItems()
    {        
        itemView.displayAllItems(ItemList);        
    }
    
    public void viewStudentAverageAge()
    {
        itemView.displayTotalItemCost(ItemList);
    }
    
    public void deleteStudent()
    {
     String studentID;
     itemView.displayAllItems(ItemList);
     studentID = itemInput.inputName();
     int index = 0;
     
     
     for(Item s : ItemList)
        {
           if(name.equals(s.getName())) 
           {
        index = ItemList.indexOf(s);
        //studentList.remove(s);     
        }
    }
        ItemList.remove(index);
        
        
        ItemView.displayMessage("Item Deleted");
                
       
    }
    
    
    public void editStudent(){
        Item studentToEdit = null;
        String studentID;        
        studentView.displayAllStudents(ItemList);
        studentID = studentInput.inputStudentID();
       
        for(Item s : ItemList)
        {
            if(studentID.equals(s.getPublisher()))
            {
             studentToEdit = s;
            }
         }
        itemView.displaySingleItem(itemToEdit);
        itemInput.editStudent(itemToEdit);
        itemView.displayMessage("Item Edited");
    }
    /**
     *
     * @param args
     */
    public static void main(String[] args) 
    {
        Assessment lma = new Assessment();
        lma.runMainMenu(); 
        
        
        
    }
}
