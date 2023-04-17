package auto_radnje;

import java.util.List;

import auto_radnje.gume.AutoGuma;


/**
 * Predstavlja radnju u kojoj mogu da se dodaju,pretrazuju gume
 * 
 * @author Dimitrije Jovanovic
 * @since 0.9.0
 *
 */

public interface Radnja {

	/**
	 * Dodaje gumu u radnju
	 * 
	 * @param a nova AutoGuma koju treba dodati
	 * 
	 * @throws NullPointerException ako je uneta guma null
	 * @throws IllegalArgumentException ako guma vec postoji u radnji
	 * 
	 */
	void dodajGumu(AutoGuma a);


	/**
	 * 
	 * Pronalazi i vraca gume iz radnje po kriterijumu markaModel
	 * 
	 * @param markaModel vrednost po kojoj se pretrazuje guma
	 * @return 
	 * <ul>
	 * <li> List svih AutoGuma koje odgovaraju kriterijumu pretrage</li>
	 * <li>null - ukoliko je uneti kriterijum markaModel jednak null</li>
	 * </ul>
	 * 
	 */
	List<AutoGuma> pronadjiGumu(String markaModel);

	/**
	 * Vraca sve gume iz radnje
	 * 
	 * @return List sa svim gumama
	 */
	List<AutoGuma> vratiSveGume();
	
	
}
