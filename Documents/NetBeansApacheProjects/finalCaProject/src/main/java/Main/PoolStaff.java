/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author AplasQ
 */
public class PoolStaff {
    private String firstName;
    private String lastName;
    private int staff_Id;
    private String department;
    
    private static int stffId=50;

    
    
    
    public PoolStaff(String firstName, String lastName, int staff_Id, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.staff_Id = staff_Id;
        this.department = department;
    }
    
   

   
   
    
    public void showInfo(){
        System.out.println("*** Information ****");
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Staff ID: " + this.staff_Id);
        System.out.println("Department: " + this.department);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStaff_Id() {
        return staff_Id;
    }

    public void setStaff_Id(int staff_Id) {
        this.staff_Id = staff_Id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static int getStffId() {
        return stffId;
    }

    public static void setStffId(int stffId) {
        PoolStaff.stffId = stffId;
    }
    
}

