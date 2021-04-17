/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author Malaika
 */
public class Employee {
    private String Status;
    private String Emp_name;
    private int emp_age;
    private String Employee_email;
    public String borrowed_equipment ;
    
    public String getStatus ()
    {
        return Status;
    }
    
    public String getEmpName ()
    {
        return Emp_name;  
    }
    
    public int getEmpage ()
    {
        return emp_age;
    }
    
    public void setStatus (String emp_status)
    {
         this.Status = emp_status;
    }
    
    public void setEmpage (int e_age)
    {
        this.emp_age = e_age;
    }
    
    public void setEmpName (String e_nam)
    {
        this.Emp_name = e_nam;
    }
}
