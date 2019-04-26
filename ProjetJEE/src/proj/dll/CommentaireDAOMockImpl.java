package proj.dll;

import java.util.ArrayList;
import java.util.List;

import proj.bo.Commentaire;

public class CommentaireDAOMockImpl {
	private static List<Commentaire> commentaires;
	private static int index;
	
	static {
		commentaires = new ArrayList<Commentaire>();
		
		Commentaire comment1 = new Commentaire();
		comment1.setId(0);
		comment1.setCom("A wonderful dish");
		comment1.setNote(3);
		comment1.setMenu_id(0);
		comment1.setMailUser("bidon");
		
		Commentaire comment2 = new Commentaire();
		comment2.setId(1);
		comment2.setCom("Un plat splendide");
		comment2.setNote(4);
		comment2.setMenu_id(0);
		comment2.setMailUser("bidon");
		
		Commentaire comment3 = new Commentaire();
		comment3.setId(2);
		comment3.setCom("Infect");
		comment3.setNote(0);
		comment3.setMenu_id(1);
		comment3.setMailUser("bidon");
		
		Commentaire comment4 = new Commentaire();
		comment4.setId(3);
		comment4.setCom("Le service était horrible");
		comment4.setNote(1);
		comment4.setMenu_id(1);
		comment4.setMailUser("bidon");
		
		Commentaire comment5 = new Commentaire();
		comment5.setId(4);
		comment5.setCom("Jamais rien mangé d'aussi mauvais");
		comment5.setNote(0);
		comment5.setMenu_id(1);
		comment5.setMailUser("bidon");
		
		Commentaire comment6 = new Commentaire();
		comment6.setId(5);
		comment6.setCom("TROP BON !!!");
		comment6.setNote(4);
		comment6.setMenu_id(1);
		comment6.setMailUser("bidon");
		
		commentaires.add(comment1);
		commentaires.add(comment2);
		commentaires.add(comment3);
		commentaires.add(comment4);
		commentaires.add(comment5);
		commentaires.add(comment6);
		
		index = commentaires.size();
	}
	
	public static List<Commentaire> select() {
		return commentaires;
	}
	
	public static Commentaire select(int id) {
		Commentaire result = null;
		for (Commentaire comment : commentaires) {
			if (comment.getId() == id) {
				result = comment;
				break;
			}
		}
		return result;
	}
	
	public static List<Commentaire> selectByMenu(int id) {
		List<Commentaire> result = new ArrayList<Commentaire>();
		for (Commentaire comment : commentaires) {
			if (comment.getMenu_id() == id) result.add(comment);
		}
		return result;
	}

	public static void insert(Commentaire com) {
		commentaires.add(com);
		index++;
	}
	
	public static int getIndex() {
		return index;
	}

	public static void supprimer(int id) {
		Commentaire comASupp = null;
		for(Commentaire com : commentaires) {
			if(com.getId()==id) {
				comASupp = com;
				break;
			}
		}
		if (comASupp != null) commentaires.remove(comASupp);
		
	}
	
}
