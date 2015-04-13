package com.kademika.tanki;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import com.kademika.tanki.BattleField;

public class ActionField extends JPanel {

	final boolean COLORDED_MODE = false;
	private BattleField bf;
	// private Tank tank;
	private T34 defender;
	private Bullet bul;
	private Tiger agressor;
	private int[] randX = new int[] { 64, 192, 320 };
	private int[] randY = new int[] { 64, 256, 384 };
	Random randCoordinate = new Random();
	private int armor;

	public void runTheGame() throws Exception {

		defender.turn(Direction.DOWN);
		defender.move();
		defender.move();
		defender.move();
		defender.turn(Direction.UP);
		defender.move();
		defender.move();
		defender.turn(Direction.DOWN);
		defender.move();
		defender.move();
		defender.move();
		defender.move();
		defender.move();
		defender.move();
		
		// Thread.sleep(2000);
		// defender.fire();
		// Thread.sleep(2000);
		// defender.fire();
		// Thread.sleep(2000);
		// defender.fire();
		// Thread.sleep(2000);
		// defender.fire();
		// Thread.sleep(2000);
		// defender.fire();
		// Thread.sleep(2000);
		// defender.fire();
		// Thread.sleep(2000);
		// defender.fire();
		// Thread.sleep(2000);
		// defender.fire();
		// Thread.sleep(2000);
		// defender.fire();
		// Thread.sleep(2000);
		// defender.clean();
//		defender.moveRandom();
//		agressor.moveRandom();

	}

	public void processMove(AbstractTank tank) throws Exception {
		// this.defender = tank;
		int step = 1;
		int covered = 0;
		Direction direction = tank.getDirection();

		// check limits x: 0, 513; y: 0, 513
		if ((tank.getDirection() == Direction.UP && tank.getY() == 0)
				|| (tank.getDirection() == Direction.DOWN && tank.getY() >= 512)
				|| (tank.getDirection() == Direction.LEFT && tank.getX() == 0)
				|| (tank.getDirection() == Direction.RIGHT && tank.getX() >= 512)) {
			System.out.println("[illegal move] direction: "
					+ tank.getDirection() + " tankX: " + tank.getX()
					+ ", tankY: " + tank.getY());
			return;
		}

		tank.turn(direction);
		if (processTankInterception(tank) || processTanksInterception(tank)) {
			System.out.println("Illegal move");
			return;
		}
		// tank.fire();

		while (covered < 64) {

			if (tank.getDirection() == Direction.UP) {

				tank.updateY(-step);
				System.out.println("[move up] direction: "
						+ tank.getDirection() + " tankX: " + tank.getX()
						+ ", tankY: " + tank.getY());
			} else if (tank.getDirection() == Direction.DOWN) {

				tank.updateY(step);
				System.out.println("[move down] direction: "
						+ tank.getDirection() + " tankX: " + tank.getX()
						+ ", tankY: " + tank.getY());
			} else if (tank.getDirection() == Direction.LEFT) {

				tank.updateX(-step);
				System.out.println("[move left] direction: "
						+ tank.getDirection() + " tankX: " + tank.getX()
						+ ", tankY: " + tank.getY());
			} else {

				tank.updateX(step);
				System.out.println("[move right] direction: "
						+ tank.getDirection() + " tankX: " + tank.getX()
						+ ", tankY: " + tank.getY());
			}

			covered += step;
			repaint();
			Thread.sleep(tank.getSpeed());
		}
	}

	public void processTurn(AbstractTank tank) throws Exception {
		repaint();
	}

	public void processFire(Bullet bulllet) throws Exception {

		bul.destroy();
		bul.updateX(defender.getX() + 125);
		bul.updateY(defender.getY() + 125);
		int step2 = 1;

		while (bul.getBulletX() > 0 && bul.getBulletY() > 0
				&& bul.getBulletX() < 576 && bul.getBulletY() < 576) {

			int step = 0;

			while (step < 64) {

				if (defender.getDirection() == Direction.UP) {
					bul.updateY(-step2);
					System.out.println("[fire up] direction: "
							+ defender.getDirection() + " bulletY: "
							+ bul.getBulletY() + ", bulletX: "
							+ bul.getBulletX());
				} else if (defender.getDirection() == Direction.DOWN) {
					bul.updateY(step2);
					System.out.println("[fire down] direction: "
							+ defender.getDirection() + " bulletY: "
							+ bul.getBulletY() + ", bulletX: "
							+ bul.getBulletX());
				} else if (defender.getDirection() == Direction.LEFT) {
					bul.updateX(-step2);
					System.out.println("[fire left] direction: "
							+ defender.getDirection() + " bulletY: "
							+ bul.getBulletY() + ", bulletX: "
							+ bul.getBulletX());
				} else {
					bul.updateX(step2);
					System.out.println("[fire right] direction: "
							+ defender.getDirection() + " bulletY: "
							+ bul.getBulletY() + ", bulletX: "
							+ bul.getBulletX());
				}
				step++;
				if (processInterception() || bul.getBulletX() < 0
						&& bul.getBulletY() < 0 || bul.getBulletX() > 576
						|| bul.getBulletY() > 576) {
					bul.destroy();
				}
				repaint();
				Thread.sleep(bul.getSpeed());
			}
		}

	}

	public void proccessMoveRandom(AbstractTank tank) throws Exception {
		Random r = new Random();
		Direction direction = Direction.values()[0];
		while (true) {
			direction = Direction.values()[r.nextInt(5)];
			if (direction != Direction.NONE) {
				tank.turn(direction);
				tank.move();
			}
		}
	}

	public void processClean(AbstractTank tank) throws Exception {
		tank.moveRandom();
	}

	// public void processDestroy(Tank tank) throws Exception {
	// tank = null;
	// }

	public void proccessmoveToQuadrant(AbstractTank tank, int x, int y)
			throws Exception {

		if (tank.getX() < x) {
			while (tank.getX() != x) {
				tank.turn(Direction.RIGHT);
				tank.move();
			}
		} else {
			while (tank.getX() != x) {
				tank.turn(Direction.LEFT);
				tank.move();
			}
		}

		if (tank.getY() < y) {
			while (tank.getY() != y) {
				tank.turn(Direction.DOWN);
				tank.move();
			}
		} else {
			while (tank.getY() != y) {
				tank.turn(Direction.UP);
				tank.move();
			}
		}

	}

	private boolean processInterception() /* throws Exception */{

		String koordinate = getQuadrant(bul.getBulletX(), bul.getBulletY());
		String tankKoordinate = getQuadrant(agressor.getX(), agressor.getY());
		int delim = koordinate.indexOf("_");
		int elemY = Integer.parseInt(koordinate.substring(0, delim));
		int elemX = Integer.parseInt(koordinate.substring(delim + 1));
		int elemTankY = Integer.parseInt(tankKoordinate.substring(0, 1));
		int elemTankX = Integer.parseInt(tankKoordinate.substring(2));

		if (elemY >= 0 && elemX >= 0 && elemY < 9 && elemX < 9) {

			// if (!bf.scanQuadrant(elemY, elemX).trim().isEmpty()) {
			// bf.updateQuadrant(elemY, elemX, "");
			// return true;
			// }

			if (bf.scanQuadrant(elemY, elemX) != null) {
				AbstractObjects o = (AbstractObjects) bf.scanQuadrant(elemY,
						elemX);
				o.destroy();
				// o = null;
				bf.updateQuadrant(elemY, elemX, null);
				repaint();
				return true;
			}

			if (elemX == elemTankX && elemY == elemTankY) {

//				if (agressor instanceof Tiger) {
//					if (armor > 0) {
//						armor--;
//						bul.destroy();
//					} else {
//						bul.destroy();
//						agressor.destroy();
//						armor = agressor.getArmor();
//						agressor.setX(randX[randCoordinate.nextInt(3)]);
//						agressor.setY(randY[randCoordinate.nextInt(3)]);
//						return true;
//					}
//				} else {
					bul.destroy();
					agressor.destroy();
					// Thread.sleep(3000);
					agressor.setX(randX[randCoordinate.nextInt(3)]);
					agressor.setY(randY[randCoordinate.nextInt(3)]);
					return true;
			}
		}
		return false;

	}

	String getQuadrant(int x, int y) {

		int quadrantX = x / 64;
		int quadrantY = y / 64;
		String result = quadrantY + "_" + quadrantX;
		return result;
	}

	String getQuadrantXY(int v, int h) {
		return (v - 1) * 64 + "_" + (h - 1) * 64;
	}

	// Magic bellow. Do not worry about this now, you will understand everything
	// in this course.
	// Please concentrate on your tasks only.

	public ActionField() throws Exception {
		bf = new BattleField();
		bf.generateBattleField();
		defender = new T34(this, bf, 128, 448, Direction.UP);
		// agressor = new Tiger(this, bf, randX[randCoordinate.nextInt(3)],
		// randY[randCoordinate.nextInt(3)], Direction.DOWN);
		agressor = new Tiger(this, bf, 128, 512, Direction.DOWN);
		armor = agressor.getArmor();
		bul = new Bullet(-100, -100, Direction.LEFT);
		JFrame frame = new JFrame("BATTLE FIELD, DAY 2");
		frame.setLocation(750, 150);
		frame.setMinimumSize(new Dimension(bf.getBF_WIDTH(),
				bf.getBF_HEIGHT() + 22));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().add(this);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// int i = 0;
		// Color cc;
		// for (int v = 0; v < 9; v++) {
		// for (int h = 0; h < 9; h++) {
		// if (COLORDED_MODE) {
		// if (i % 2 == 0) {
		// cc = new Color(252, 241, 177);
		// } else {
		// cc = new Color(233, 243, 255);
		// }
		// } else {
		// cc = new Color(180, 180, 180);
		// }
		// i++;
		// g.setColor(cc);
		// g.fillRect(h * 64, v * 64, 64, 64);
		// }
		// }

		// for (int j = 0; j < bf.getDimentionY(); j++) {
		// for (int k = 0; k < bf.getDimentionX(); k++) {
		// if (bf.scanQuadrant(j, k).equals("B")) {
		// String coordinates = getQuadrantXY(j + 1, k + 1);
		// int separator = coordinates.indexOf("_");
		// int y = Integer.parseInt(coordinates
		// .substring(0, separator));
		// int x = Integer.parseInt(coordinates
		// .substring(separator + 1));
		// g.setColor(new Color(0, 0, 255));
		// g.fillRect(x, y, 64, 64);
		// }
		// }
		// }

		// for (int j = 0; j < bf.getDimentionY(); j++) {
		// for (int k = 0; k < bf.getDimentionX(); k++) {
		// if (bf.scanQuadrant(j, k) != null) {
		// String coordinates = getQuadrantXY(j + 1, k + 1);
		// int separator = coordinates.indexOf("_");
		// int y = Integer.parseInt(coordinates
		// .substring(0, separator));
		// int x = Integer.parseInt(coordinates
		// .substring(separator + 1));
		// AbstractObjects o = (AbstractObjects) bf.scanQuadrant(j, k);
		// g.setColor(o.getColor());
		// g.fillRect(x, y, 64, 64);
		// }
		// }
		// }
		bf.draw(g);
		agressor.draw(g);
		defender.draw(g);
		bul.draw(g);

		// g.setColor(new Color(255, 0, 0));
		// g.fillRect(defender.getX(), defender.getY(), 64, 64);
		//
		// g.setColor(new Color(0, 255, 0));
		// if (defender.getDirection() == Direction.UP) {
		// g.fillRect(defender.getX() + 20, defender.getY(), 24, 34);
		// } else if (defender.getDirection() == Direction.DOWN) {
		// g.fillRect(defender.getX() + 20, defender.getY() + 30, 24, 34);
		// } else if (defender.getDirection() == Direction.LEFT) {
		// g.fillRect(defender.getX(), defender.getY() + 20, 34, 24);
		// } else {
		// g.fillRect(defender.getX() + 30, defender.getY() + 20, 34, 24);
		// }
		//
		// g.fillRect(agressor.getX(), agressor.getY(), 64, 64);
		//
		// g.setColor(new Color(0, 155, 0));
		// if (agressor.getDirection() == Direction.UP) {
		// g.fillRect(agressor.getX() + 20, agressor.getY(), 24, 34);
		// } else if (agressor.getDirection() == Direction.DOWN) {
		// g.fillRect(agressor.getX() + 20, agressor.getY() + 30, 24, 34);
		// } else if (agressor.getDirection() == Direction.LEFT) {
		// g.fillRect(agressor.getX(), agressor.getY() + 20, 34, 24);
		// } else {
		// g.fillRect(agressor.getX() + 30, agressor.getY() + 20, 34, 24);
		// }
		//
		// g.setColor(new Color(255, 255, 0));
		// g.fillRect(bul.getBulletX(), bul.getBulletY(), 14, 14);
	}

	private boolean processTanksInterception(AbstractTank tank) {
		String koordinate = getQuadrant(tank.getX() + 32, tank.getY() + 32);
		int delim = koordinate.indexOf("_");
		int elemY = Integer.parseInt(koordinate.substring(0, delim));
		int elemX = Integer.parseInt(koordinate.substring(delim + 1));
		String koordinateDef = getQuadrant(defender.getX() + 32, defender.getY() + 32);
		int elemDefY = Integer.parseInt(koordinateDef.substring(0, delim));
		int elemDefX = Integer.parseInt(koordinateDef.substring(delim + 1));
		String koordinateAgr = getQuadrant(agressor.getX() + 32, agressor.getY() + 32);
		int elemAgrY = Integer.parseInt(koordinateAgr.substring(0, delim));
		int elemAgrX = Integer.parseInt(koordinateAgr.substring(delim + 1));
		
		if (tank.getDirection() == Direction.UP
					&& (elemX == elemAgrX && elemY-1 == elemAgrY || elemX == elemDefX && elemY-1 == elemDefY)) {
				return true;
			} else if (tank.getDirection() == Direction.DOWN
					&& (elemX == elemAgrX && elemY+1 == elemAgrY || elemX == elemDefX && elemY+1 == elemDefY)) {
				return true;
			} else if (tank.getDirection() == Direction.LEFT
					&& (elemX-1 == elemAgrX && elemY == elemAgrY || elemX-1 == elemDefX && elemY == elemDefY)) {
				return true;
			} else if (tank.getDirection() == Direction.RIGHT
					&& (elemX+1 == elemAgrX && elemY == elemAgrY || elemX+1 == elemDefX && elemY == elemDefY)) {
				return true;
			}
		
		return false;
}


	
	private boolean processTankInterception(AbstractTank tank) {

		String koordinate = getQuadrant(tank.getX() + 32, tank.getY() + 32);
		int delim = koordinate.indexOf("_");
		int elemY = Integer.parseInt(koordinate.substring(0, delim));
		int elemX = Integer.parseInt(koordinate.substring(delim + 1));

		if (elemY >= 0 && elemX >= 0 && elemY < 9 && elemX < 9) {

			if (tank.getDirection() == Direction.UP
					&& bf.scanQuadrant(elemY - 1, elemX) != null) {
				return true;
			} else if (tank.getDirection() == Direction.DOWN
					&& bf.scanQuadrant(elemY + 1, elemX) != null) {
				return true;
			} else if (tank.getDirection() == Direction.LEFT
					&& bf.scanQuadrant(elemY, elemX - 1) != null) {
				return true;
			} else if (tank.getDirection() == Direction.RIGHT
					&& bf.scanQuadrant(elemY, elemX + 1) != null) {
				return true;
			}

		}
		return false;
	}

}
