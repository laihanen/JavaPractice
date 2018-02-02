package projekti.model;

public class Elokuva {
	private int id;
	private int star;
	private String genre;
	private String nimi;
	private String ohjaaja;
	
	public Elokuva() {
		this.id = 0;
		this.star = 0;
		this.genre = null;
		this.nimi = null;
		this.ohjaaja = null;
	}
	
	public Elokuva(int id, String nimi, int star, String genre, String ohjaaja) {
		super();
		this.id = id;
		this.star = star;
		this.genre = genre;
		this.nimi = nimi;
		this.ohjaaja = ohjaaja;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getOhjaaja() {
		return ohjaaja;
	}

	public void setOhjaaja(String ohjaaja) {
		this.ohjaaja = ohjaaja;
	}

	@Override
	public String toString() {
		return "Elokuva [id=" + id + ", star=" + star + ", genre=" + genre + ", nimi=" + nimi + ", ohjaaja=" + ohjaaja
				+ "]";
	}
	
}
