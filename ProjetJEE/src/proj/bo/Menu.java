package proj.bo;

public class Menu {
	private int id;
	private String nom;
	private String ingredients;
	private double prix;
	private String uri;
	
	public Menu() {}

	public Menu(int id, String nom, String ingredients, double prix, String uri) {
		super();
		this.id = id;
		this.nom = nom;
		this.ingredients = ingredients;
		this.prix = prix;
		this.uri = uri;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
