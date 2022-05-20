/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.Random;

/**
 *
 * @author AplasQ
 */
public class MainGenerater {
    
    

	protected String[] firstNames = {"Melarue", "Lusha ", "Elincia ", "Leilatha ", "Braern ", "Zandro ", "Leojym ","Khidell ","Ravanala","Shanyrria "};
	
	protected String[] surnames = {"Advalur", "Yinjeon", "Sarphyra", "Petmenor", "Tracyne", "Farwraek", "Eldar ","Ravanala","Farwraek","Wynrora"};

        
	public String getRandomName() {
				
		Random r = new Random();
		
		//pick a firstname and surname based on length of array
		String fname = this.firstNames[r.nextInt(firstNames.length)];
		String sname = this.surnames[r.nextInt(surnames.length)];
		
		return ( fname + " " + sname);
		
}
}