package org.formation1.PetitTP;

public class RandomImpl implements Random{

	public int lancerD6() {

		int result = (int) (Math.random() * 6 +1);
		return result;
	}

	public void action() {
		int CC = 8;
		int a = lancerD6();
		int b = lancerD6();
		
		int attaque = a + b;
//		if attaque
	}
}
