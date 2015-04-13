package com.kademika.menu;

public abstract class AbstractMenuObjects {

	protected String name;
	protected Ingredients[] ingrids;

	public String getIngridients() {
		String result = "";
		for (Ingredients i : ingrids) {
			if (i != null) {
				result += i.toString() + " ";
			}
		}
		return result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		double price = 0;
			for (Ingredients i : ingrids) {
				if (i != null) {
				price += i.getPrice();
			}
		}
		return price;
	}

	public void addIngridients(Ingredients inr) {
		int length = ingrids.length;
		Ingredients[] newIngrids = new Ingredients[length + 1];
		for (int i = 0; i < length; i++) {
			newIngrids[i] = ingrids[i];
		}
		newIngrids[length] = inr;
		ingrids = newIngrids;
	}

	public void delIngredients(Ingredients inr) {
		for (int i = 0; i < ingrids.length; i++) {
			if (ingrids[i] != null && ingrids[i] == inr) {
				ingrids[i] = null;
				return;
			}
		}
	}

}
