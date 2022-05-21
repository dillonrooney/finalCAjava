/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;
// in c/c++ you would have to #include swimclub.h
// in python you could import swimclub
// in java, you might get everything from the package for free



/**
 *
 * @author AplasQ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

	// you need a SwimClub somewhere. That class shouldn't be defined in main
	// but will need to be used here.
	// stuff like generator might be only used in the Club or staff implementations
	// e.g. 
/*
	SwimClub club = new SwimClub();
	club.addHeadCoach()
	for(i<nCoaches){
		club.addRandomcoach();
	}
	//OR
	SwimClub club = new SwimClub();
	Coach head = new Coach(5);
	club.addCoach(head)
	for(i<nCoaches){
		Coach coach = new Coach(generator.randomCoachLevel());
		club.addCoach(coach)
	}
	//OR
	SwimClub club = new SwimClub(nCoaches, nStaff, nClasses);
	
*/
       PoolStaff poolstaff = new PoolStaff();
       poolstaff.showInfo();
       
       
       
        
    }
    
}
