package proj.bo;

import proj.enums.Role;

public class Utilisateur {
	private int id;
	private String mail;
	private String password;
	private Role role;
	
	public Utilisateur() {}

	public Utilisateur(int id, String mail, String password, Role role) {
		super();
		this.id = id;
		this.mail = mail;
		this.password = password;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public static String encode(Integer... chars) {
		StringBuilder builder = new StringBuilder();
		for (Integer car : chars) {
			builder.append((char)car.intValue());
		}
		return builder.toString();
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
}
