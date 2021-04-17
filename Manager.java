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
public class Manager {
    private String manager_name ;
    private int ManagerAge;
    public String ManagerEmail;
    private String ManagerID_no;

////////////////////////////////// GETTERS /////////////////////////////////////////    
    
    public String getManagerName()
    {
      return manager_name;
    }
    
    public int getMAnagerAge()
    {
       return ManagerAge;
    }
    
    public String getManagerEmail()
    {
        return ManagerID_no;
    }
    
    ///////////////////////////////////// SETTERS //////////////////////////////////////////////////
    
    public void setMManagerName(String m_name)
    {
        this.manager_name = m_name;
    }
    
    public void setManagerAge(int m_Age)
    {
        this.ManagerAge =m_Age;
    }
    
    public void setManagerEmail(String m_email)
    {
       this.ManagerEmail = m_email;   
    }
    
/////////////////////////////////////// VALIDATORS AND METHODS /////////////////////////////////////////

////////////////////////////////////////// VALIDATOR ///////////////////////////////////////////////
    
//////////////////////////////// NAME VALIDATOR //////////////////////////////////////////
/*public static boolean isNameValid(String name)
{
 boolean flag = false;
int name_length = name.length();
char [ ] name_arr;
        name_arr = name.toCharArray();
//char [ ] name_arr = new char [name_length + 1];
 //[] name_arr = name.toCharArrnameay();
for (int i=0 ; i < name_length ;  i++) 
       {
           flag = ((name_arr[i]) >= 65 && (name_arr[i]) <= 90) ||
                   ((name_arr[i]) >= 97 && (name_arr[i]) <= 122);
        }   
/*for (int i=0 ; i < name_length ;  i++) 
       {
               if  (((name_arr[i]) >= 65 && (name_arr[i]) <= 90) ||
                   ((name_arr[i]) >= 97 && (name_arr[i]) <= 122))
                   {
                      flag = true; 
            
                   }
                   else
                   {
                       flag = false;    
                   }
        }
return flag;
    
}*/

//////////////////////////////////// EMAIL VALIDATOR ///////////////////////////////////////////

public static boolean isEmailValid(String email)
{
boolean flag = false;
int email_length;
        email_length = email.length();
char [ ] email_arr ;
email_arr = email.toCharArray();
for (int i = 0 ; i < email_length ; i++)
{
    if(( email_arr [i] >= 'a' && email_arr [i] <= 'z') ||
       ( email_arr [i] >= 'A' && email_arr [i] <='Z')  &&
       ( email_arr [i] == '@') &&     
       ( email_arr [email_length] == 'm') &&
       ( email_arr [email_length - 1] == 'o') &&
       ( email_arr [email_length - 2] == 'c') &&
       ( email_arr [email_length - 3] == '.'))
         
    {
        flag =true;
    }
    
    else 
    {
        flag = false;
    }
}
return flag;
}

//////////////////////////////////////////// CNIC VALIDATOR /////////////////////////////////////////////////

public static boolean isCNICvalid(String cnic)
{
  boolean valid =false;
int cnic_length = cnic.length();
char [ ] cnic_arr ;
cnic_arr = cnic.toCharArray();

for(int i = 2 ; i< cnic_length ; i++ )
{
    if(( cnic_arr [0] == '3' ) &&
       ( cnic_arr [1] == '5' ) &&
       ( cnic_arr [i] >= '0' && cnic_arr [i] <= '9'))
    {
        valid = true;
    }
    
    else 
    {
        valid = false;
    }     
}
return valid;   
}

///////////////////////////////////////// MANAGER PASSWORD VALIDATOR //////////////////////////////////////////////////

public static boolean isNewManagerPasswordvalid(String mpass)
{
boolean passwordvalidation = false;

int mpass_length = mpass.length ();
char mpass_arr [];
mpass_arr = mpass.toCharArray();

for (int i= 0 ; i < mpass_length ; i++)
{
   if (( mpass_length >=8 && mpass_length <=20) &&
       ( mpass_arr [i] >= 'a' && mpass_arr [i] <= 'z' ) &&
       ( mpass_arr [i] >= 'A' && mpass_arr [i] <= 'Z' ) &&
       ( mpass_arr [i] == '.' || mpass_arr [i] == '_'))
   {
       passwordvalidation = true;
   }
   
   else 
   {
       passwordvalidation = false;
   }
}
return passwordvalidation;
}

/////////////////////////////////////////// METHODS /////////////////////////////////////////////

public void addEmployee(String name , String EmailID , String IDaddress , int age )
{ 
    
    
}

public void editdata(String name , int age , String emID ,String cnic_num  )
{
    
    
}
public String updatestatus(String stat)
{
    
    return stat;
}
public static void showAllitems()
{
    
}
public static void showAllavailableitems()
{
    
    
}
public static void DeleteUser()
{
    
    
}
public static void Request()
{
    
    
}
}
