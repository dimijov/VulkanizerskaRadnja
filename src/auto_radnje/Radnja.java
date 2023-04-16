package auto_radnje;

import java.util.List;

import auto_radnje.gume.AutoGuma;

public interface Radnja {

	
	void dodajGumu(AutoGuma a);


	List<AutoGuma> pronadjiGumu(String markaModel);

	
	List<AutoGuma> vratiSveGume();
	
	
}
