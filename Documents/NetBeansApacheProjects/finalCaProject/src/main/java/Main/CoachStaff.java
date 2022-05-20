/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author AplasQ
 */
public class CoachStaff extends PoolStaff{

    public CoachStaff(String firstName, String lastName, int staff_Id, String department) {
        super(firstName, lastName, staff_Id, department);
    }
    private int licanceLevel;
    private String clubName;

    public CoachStaff(int licanceLevel, String clubName, String firstName, String lastName, int staff_Id, String department) {
        super(firstName, lastName, staff_Id, department);
        this.licanceLevel = licanceLevel;
        this.clubName = clubName;
    }

    public int getLicanceLevel() {
        return licanceLevel;
    }

    public void setLicanceLevel(int licanceLevel) {
        this.licanceLevel = licanceLevel;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    @Override
    public void showInfo() {
          System.out.println("Coach Licance : " + this.licanceLevel);
           System.out.println("Club Name : " + this.clubName);
    }
 
    
    
    
}
