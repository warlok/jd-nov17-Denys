package com.kademika.menu;

public class Launcher {

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		System.out.println(menu.search("Black tee"));
		Ingredients.BLACK_TEE.setPrice(5);
		System.out.println(menu.search("Black tee"));
		menu.delIngredients("Black tee", Ingredients.SHUGAR);
		System.out.println(menu.search("Black tee"));
		Ingredients.BLACK_TEE.setPrice(1);
		
		System.out.println("\n\n" + menu.printMenu());
	}

}
