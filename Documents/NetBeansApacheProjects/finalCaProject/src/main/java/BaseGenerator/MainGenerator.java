
package BaseGenerator;

import java.util.Random;

/**
 *
 * @author AplasQ
 */
public class MainGenerator {
    

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
