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
public class Journal extends Item
{
    protected double hoursOfAttendance;
    protected boolean financePaid;
    
    public Journal()
    {
         super();
         
         hoursOfAttendance = 0;
         financePaid = false;
    } 
    
    public Journal(String name, int age, String id, double hoursOfAttendance, boolean financePaid)
    {
        super(name, age, id, "");
        
        this.hoursOfAttendance = hoursOfAttendance;
        this.financePaid = financePaid;
        
    }
    
    public double getHoursAttendance()
    {
        return hoursOfAttendance;
    }
    
    public boolean getFinancePaid()
    {
        return financePaid;
    }
}