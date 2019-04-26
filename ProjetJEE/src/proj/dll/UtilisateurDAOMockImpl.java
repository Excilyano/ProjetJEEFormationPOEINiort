package proj.dll;

import java.util.ArrayList;
import java.util.List;

import proj.bo.Utilisateur;
import proj.enums.Role;

public class UtilisateurDAOMockImpl {
	private static List<Utilisateur> users;
	private static int index;
	
	static {
		users = new ArrayList<Utilisateur>();
		Utilisateur user1 = new Utilisateur();
		user1.setId(0);
		user1.setMail("mail1");
		user1.setPassword(Utilisateur.encode(97,100,109,105,110));
		user1.setRole(Role.ADMIN);
		
		Utilisateur user2 = new Utilisateur();
		user2.setId(1);
		user2.setMail("mail2");
		user2.setPassword(Utilisateur.encode(101,109,112,108));
		user2.setRole(Role.EMPLOYE);
		
		Utilisateur user3 = new Utilisateur();
		user3.setId(1);
		user3.setMail("mail3");
		user3.setPassword(Utilisateur.encode(117,115,101,114));
		user3.setRole(Role.USER);
		
		users.add(user3);
		users.add(user2);
		users.add(user1);
		
		index = users.size();
	}

	public static List<Utilisateur> select() {
		return users;
	}
	
	public static Utilisateur select(int id) {
		Utilisateur result = null;
		for (Utilisateur user : users) {
			if(user.getId() == id) {
				result = user;
			}
		}
		return result;
	}
	
	public static Utilisateur selectByMail(String mail) {
		Utilisateur result = null;
		for (Utilisateur user : users) {
			if(user.getMail().equals(mail)) {
				result = user;
			}
		}
		return result;
	}
	
	public static int getId() {
		return index;
	}

	public static void insert(Utilisateur user) {
		users.add(user);
		index++;
	}
}
