/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swimmingClub;

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
}
