package luna_Class;


public class Command {
	//sdfghjk
	// - - DÉCLARATION DES ATTRIBUTS DE LA CLASSE "command" - - //
	private int id;
	private String libelle;
	private int idclient;
	private String datecommand;

	// CONSTRUCTEUR
	public Command(int id, String libelle, int idclient, String datecommand) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.idclient = idclient;
		this.datecommand = datecommand;
	}

	public Command() {
		// TODO Auto-generated constructor stub
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "id" - - //
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "libelle" - - //
	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "idclient" - - //
	public int getIdclient() {
		return idclient;
	}

	public void setIdclient(int idclient) {
		this.idclient = idclient;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "datecommand" - - //
	public String getDatecommand() {
		return datecommand;
	}

	public void setDatecommand(String datecommand) {
		this.datecommand = datecommand;
	}

}
