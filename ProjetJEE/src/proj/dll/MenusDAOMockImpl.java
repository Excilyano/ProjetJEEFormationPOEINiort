package proj.dll;

import java.util.ArrayList;
import java.util.List;

import proj.bo.Menu;

public class MenusDAOMockImpl {
	private static List<Menu> menus;
	
	static {
		menus = new ArrayList<Menu>();
		Menu menu1 = new Menu();
		menu1.setId(0);
		menu1.setNom("Salade de chèvre chaud");
		menu1.setIngredients("De la salade et du chèvre sherlock");
		menu1.setUri("img/salade_chevre_chaud.jpg");
		menu1.setPrix(12);
		
		Menu menu2 = new Menu();
		menu2.setId(1);
		menu2.setNom("Salade d'Automne aux champignons sautés");
		menu2.setIngredients("Brocolis champignons");
		menu2.setUri("img/salade_automne_champignons_sautes.jpg");
		menu2.setPrix(12);
		
		menus.add(menu2);
		menus.add(menu1);
	}
	
	public static List<Menu> select() {
		return menus;
	}
	
	public static Menu select(int id) {
		Menu result = null;
		for (Menu menu : menus) {
			if (menu.getId() == id) {
				result = menu;
				break;
			}
		}
		return result;
	}
}
