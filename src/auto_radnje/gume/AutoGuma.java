package auto_radnje.gume;
/**
 * 
 * Predstavlja model gume i njene osobine
 * 
 * Guma ima osobine markaModel,precnik,sirina,visina
 * 
 * @author Dimitrije Jovanovic
 * 
 * 
 *
 */
public class AutoGuma {

	/**
	 * MarkaModel kao String 
	 */
	private String markaModel = null;
	/**
	 * precnik gume kao int
	 */
	private int precnik = -1;
	/**
	 * sirina gume kao int
	 */
	private int sirina = -1;
	/**
	 * visina gume kao int
	 */
	private int visina = -1;


	/**
	 * Inicijalizacija objekta klase AutoGuma
	 * 
	 */
	public AutoGuma() {
	}

	/**
	 * Inicijalizacija atributa klase AutoGuma
	 * 
	 * @param markaModel nova vrednost za markaModel
	 * @param precnik nova vrednost za precnik
	 * @param sirina nova vrednost za sirinu
	 * @param visina nova vrednost za visinu
	 */
	public AutoGuma(String markaModel, int precnik, int sirina, int visina) {
		super();
		setMarkaModel(markaModel);
		setPrecnik(precnik);
		setSirina(sirina);
		setVisina(visina);
	}

	/**
	 * Vraca markaModel gume
	 * 
	 * @return markaModel gume kao String
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Postavlja vrednost markaModel gume
	 * 
	 * @param markaModel nova vrednost markaModel gume
	 * 
	 * @throws NullPointerException ako je markaModel gume null
	 * @throws IllegalArgumentException ako je markaModel String duzine manji od 3
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel==null)
			throw new NullPointerException("Morate uneti marku i model");
		if (markaModel.length()<3)
			throw new IllegalArgumentException("Marka i model moraju sadrzati bar 3 znaka");
		this.markaModel = markaModel;
	}

	/**
	 * Vraca precnik gume
	 * 
	 * @return precnik kao int
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * postavlja precnik gume 
	 * 
	 * @param precnik nova vrednost za precnik gume
	 * 
	 * @throws IllegalArgumentException ako je precnik manji od 13 i veci od 22
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new IllegalArgumentException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * vraca sirinu gume
	 * 
	 * @return sirina kao int
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * postavlja sirinu gume
	 * 
	 * @param sirina nova vrednost za sirinu gume
	 * 
	 * @throws IllegalArgumentException ako je sirina veca od 355 i ako je sirina manja od 135 
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new IllegalArgumentException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * vraca visinu gume
	 * 
	 * @return visina gume kao int
	 */
	public int getVisina() {
		return visina;
	}

	/**
	 * postavlja visinu gume
	 * 
	 * @param visina nova vrednost za visinu gume 
	 * 
	 * @throws IllegalArgumentException ako je visina manja od 25 ili ako je visina veca od 95
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new IllegalArgumentException("Visina van opsega");
		this.visina = visina;
	}

	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina=" + visina + "]";
	}

	
	/**
	 * Poredi 2 objekta klase AutoGuma preko atributa markaModel,precnik,sirina,visina
	 * 
	 * @param obj objekat klase
	 * @return 
	 * <ul>
	 * <li> true - ako ta 2 objekta imaju istu referencu ili ako su im svi atributi isti </li>
	 * <li> false - ako je neki objekat null ili ako im bar jedan atribut nije isti</li>
	 * </ul>
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;

		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
}
