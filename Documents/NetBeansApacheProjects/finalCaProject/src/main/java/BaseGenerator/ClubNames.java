/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseGenerator;

/**
 *
 * @author AplasQ
 */
public class ClubNames extends MainGenerator{
        private String[] clubName = {"Jumbo", "Buccaneer", "Tomalley", "Bunkum", "Klutz", "Quaff"};
	
	private String[] clubLast = {"Gumshoe", "Tunic", "Copacetic", "Pseudonym", "Blimp","Shrubbery"};
	
	public ClubNames() {
		// change firstnames and surnames to dog equivalents
		
		this.firstNames = clubName;
		this.surnames = clubLast;
	}
}
