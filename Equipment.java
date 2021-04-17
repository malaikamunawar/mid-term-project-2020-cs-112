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
public class Equipment {
 
    private String eq_name;
    private String eq_ID;
    private String eq_type;
    private int eq_quantity;
    
////////////////////////////////////// GETTERS /////////////////////////////////////////////// 
    
    public String getEquipmentName ()
    {
        return eq_name;
    }
    
    public String getEquipmentID ()
    {
        return eq_ID;
    }
    
    public String getEquipmentType ()
    {
        return eq_type;
    }
    
    public int getEquipmentQuantity ()
    {
        return eq_quantity;
    }
    
/////////////////////////////////////////////// SETTERS ///////////////////////////////////////////////////////////

public void getEquipmentName ( String equipname )
{
    this.eq_name = equipname;
}

public void getEquipmentID ( String equipID )
{
    this.eq_ID = equipID;
}

public void getEquipmentType ( String equiptype)
{
    this.eq_type = equiptype;
}

public void getEquipmentQuantity ( int equipqtty)     
{
    this.eq_quantity = equipqtty;
}

}
