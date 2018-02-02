package projekti.model;

public class Kayttaja {
	private int id;
	private String kayttajatunnus;
	private String salasana;
	private String rooli;
	
	public Kayttaja() {
		this.id = 0;
		this.kayttajatunnus = null;
		this.salasana = null;
		this.rooli = null;
	}
	
	public Kayttaja(int id, String kayttajatunnus, String salasana, String rooli) {
		super();
		this.id = id;
		this.kayttajatunnus = kayttajatunnus;
		this.salasana = salasana;
		this.rooli = rooli;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKayttajatunnus() {
		return kayttajatunnus;
	}

	public void setKayttajatunnus(String kayttajatunnus) {
		this.kayttajatunnus = kayttajatunnus;
	}

	public String getSalasana() {
		return salasana;
	}

	public void setSalasana(String salasana) {
		this.salasana = salasana;
	}

	public String getRooli() {
		return rooli;
	}

	public void setRooli(String rooli) {
		this.rooli = rooli;
	}

	@Override
	public String toString() {
		return "Kayttaja [id=" + id + ", kayttajatunnus=" + kayttajatunnus + ", salasana=" + salasana + ", rooli="
				+ rooli + "]";
	}
	
}

