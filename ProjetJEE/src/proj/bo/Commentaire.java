package proj.bo;

public class Commentaire {
	private int id;
	private String com;
	private double note;
	private int menu_id;
	private String mailUser;
	
	public Commentaire() {}

	public Commentaire(int id, String com, double note, int menu_id, String mailUser) {
		super();
		this.id = id;
		this.com = com;
		this.note = note;
		this.mailUser = mailUser;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCom() {
		return com;
	}

	public void setCom(String com) {
		this.com = com;
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	public int getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}

	public String getMailUser() {
		return mailUser;
	}

	public void setMailUser(String mail_user) {
		this.mailUser = mail_user;
	}
}
