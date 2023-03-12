package beans;

public class Stockage {
	private int id;
	private String champ;
	
	public Stockage() {}
	
	public Stockage(String champ) {
		this.champ = champ;
	}

	public Stockage(int id, String champ) {
		this.id = id;
		this.champ = champ;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChamp() {
		return champ;
	}
	public void setChamp(String champ) {
		this.champ = champ;
	}
	
}
