package org.formation1.PetitTP;

import org.junit.Test;
import static org.junit.Assert.*;

public class RandomImplTest {

	@Test
	public void testLancer() {
		RandomImpl ran = new RandomImpl();
		boolean resultat = false;
		
		int result = ran.lancerD6();
		if (result > 0 && result < 7){
			resultat = true;
		}
		assertTrue(resultat);;
	}

}
