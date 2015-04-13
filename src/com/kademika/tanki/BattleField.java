package com.kademika.tanki;

import java.awt.Graphics;

public class BattleField implements Drawable {

	private int BF_WIDTH = 590;
	private int BF_HEIGHT = 590;

	// Brick B = new Brick();
	// Rock R = new Rock();
	// Water W = new Water();
	// Eagle E = new Eagle();
	//
	// private Object[][] battleField = new Object[][] {
	// { B, B, B, B, B, B, B, B, B },
	// { B, null, null, null, null, null, null, null, B },
	// { B, R, R, null, null, null, R, R, B },
	// { B, null, null, R, null, R, null, null, B },
	// { W, W, W, W, null, W, W, W, W },
	// { B, null, null, R, null, R, null, null, B },
	// { B, R, R, null, null, null, R, R, B },
	// { B, null, null, null, E, null, null, null, B },
	// { B, B, B, B, B, B, B, B, B } };

	private String[][] battleFieldString = new String[][] {
			{ "B", "B", "B", "B", "B", "B", "B", "B", "B" },
			{ "B", "", "", "", "", "", "B", "", "B" },
			{ "B", "", "R", "", "R", "", "", "", "B" },
			{ "B", "", "", "", "", "", "B", "", "B" },
			{ "B", "B", "", "", "R", "", "", "", "B" },
			{ "B", "", "", "W", "", "", "W", "B", "B" },
			{ "B", "B", "", "", "", "B", "", "", "B" },
			{ "B", "", "", "B", "E", "", "", "", "B" },
			{ "B", "B", "B", "B", "B", "B", "B", "B", "B" } };

	private int dimX = battleFieldString[0].length;
	private int dimY = battleFieldString.length;
	private Object[][] battleField = new Object[dimY][dimX];
	

	public BattleField() {

	}

	public void generateBattleField() {
		for (int j = 0; j < getDimentionY(); j++) {
			for (int k = 0; k < getDimentionX(); k++) {
				String XY = getQuadrantXY(j+1, k+1);
				int separator = XY.indexOf("_");
				int x = Integer.parseInt(XY.substring(separator + 1));
				int y = Integer.parseInt(XY.substring(0, separator));
				switch (battleFieldString[j][k]) {
				case "B":
					battleField[j][k] = new Brick(x, y);
					break;
				case "R":
					battleField[j][k] = new Rock(x, y);
					break;
				case "W":
					battleField[j][k] = new Water(x, y);
					break;
				case "E":
					battleField[j][k] = new Eagle(x, y);
					break;
				default:
					battleField[j][k] = null;
					break;

				}
			}
		}
	}

	public void draw(Graphics g) {
//		for (int j = 0; j < getDimentionY(); j++) {
//			for (int k = 0; k < getDimentionX(); k++) {
//				if (scanQuadrant(j, k) != null) {
//					String coordinates = getQuadrantXY(j + 1, k + 1);
//					int separator = coordinates.indexOf("_");
//					int y = Integer.parseInt(coordinates
//							.substring(0, separator));
//					int x = Integer.parseInt(coordinates
//							.substring(separator + 1));
//					AbstractObjects o = (AbstractObjects) scanQuadrant(j, k);
//					o.draw(g);
//				}
//			}
//		}
//		generateBattleField();
		for (Object[] objects : battleField) {
			for (Object object : objects) {
				if (object != null) {
				AbstractObjects o = (AbstractObjects) object;
				o.draw(g);
				}
			}
		}
	}

	String getQuadrantXY(int v, int h) {
		return (v - 1) * 64 + "_" + (h - 1) * 64;
	}

	// public BattleField(String[][] battleField) {
	// this.battleField = battleField;
	// }
	//
	// public String scanQuadrant(int x, int y) {
	// String value = battleField[y][x];
	// return value;
	// }
	//
	// public void updateQuadrant(int x, int y, String newValue) {
	// battleField[y][x] = newValue;
	// }

	public BattleField(Object[][] battleField) {
		this.battleField = battleField;
	}

	public Object scanQuadrant(int x, int y) {
		Object value = battleField[x][y];
		return value;
	}

	public void updateQuadrant(int x, int y, Object newValue) {
		battleField[x][y] = newValue;
	}

	public int getDimentionX() {
		int value = battleField[0].length;
		return value;
	}

	public int getDimentionY() {
		int value = battleField.length;
		return value;
	}

	public int getBF_WIDTH() {
		return BF_WIDTH;
	}

	public int getBF_HEIGHT() {
		return BF_HEIGHT;
	}

}
