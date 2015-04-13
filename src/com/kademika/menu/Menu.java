package com.kademika.menu;

public class Menu {

	Object[] menu = new Object[30];

	public void generateMenu() {
		menu[0] = new BlackTee();
		menu[1] = new GreenTee();
		menu[2] = new TeeWithBergamot();
		menu[3] = new Coffee();
		menu[4] = new CoffeeWithMilk();
		menu[5] = new Americano();
		menu[6] = new Capuchino();
		menu[7] = new Mokachino();
	}

	public Menu() {
		generateMenu();
	}

	public String printMenu() {
		String result = "";
		for (Object o : menu) {
			if (o != null) {
				AbstractMenuObjects ob = (AbstractMenuObjects) o;
				result += "Name: \"" + ob.getName() + "\"\t"
						+ "Ingredients: \"" + ob.getIngridients().trim()
						+ "\"\t" + "Price: \"" + ob.getPrice() + "$\"\n";
			}
		}
		return result;
	}

	public String search(String name) {
		String result = "";
		for (Object i : menu) {
			AbstractMenuObjects o = (AbstractMenuObjects) i;
			if (o != null && o.getName().equals(name)) {
				result += "Name: \"" + name + "\"\t" + "Ingredients: \""
						+ o.getIngridients().trim() + "\"\t" + "Price: \""
						+ o.getPrice() + "$\"";
			}
		}
		return result;
	}

	public void delIngredients(String name, Ingredients inr) {
		for (Object i : menu) {
			AbstractMenuObjects o = (AbstractMenuObjects) i;
			if (o != null && o.getName().equals(name)) {
				o.delIngredients(inr);
			}
		}
	}

}
