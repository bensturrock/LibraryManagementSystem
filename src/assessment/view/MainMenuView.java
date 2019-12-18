/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessment.view;

import java.util.Scanner;

/**
 *
 * @author j.oliver
 */
public class MainMenuView 
{
    
    public MainMenuView()
    {
        
    }
    
    public int displayMainMenu()
    {
        Scanner s = new Scanner(System.in);
        int menuChoice = 0;
        
        System.out.println("Main Menu");
        System.out.println("");
        System.out.println("1. Add item");
        System.out.println("2. View all items");
        System.out.println("3. View total cost of items");
        System.out.println("4. View Average student finance");
        System.out.println("5. Delete a user");
        System.out.println("6. Edit a Student");
        System.out.println("7. Quit");
        System.out.println("");
        System.out.println("Please enter your choice: ");
        
        menuChoice = s.nextInt();
        
        return menuChoice;
    }
    
}
