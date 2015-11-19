
package fr.uvsq.coo.ex3_2;

import junit.framework.TestCase;

public class test_bowling_game extends TestCase {
	
	/*public void testGutterGame() throws Exception {
	The_bowling_game_kata g = new The_bowling_game_kata();
	for (int i=0; i<20;i++)
		g.roll(0);
	assertEquals (0,g.score());
	}
	public void testAllOnes() throws Exception {
		The_bowling_game_kata g = new The_bowling_game_kata();
		for (int i=0; i<20;i++)
			g.roll(1);
		assertEquals (20,g.score());
	}*/
	public class BowlingGameTest extends TestCase {
		private The_bowling_game_kata g;
		
		protected void setUp() throws Exception {
		g = new The_bowling_game_kata();
		}
		public void testGutterGame() throws Exception {
		for (int i = 0; i < 20; i++)
		g.roll(0);
		assertEquals(0, g.score());
		}
		public void testAllOnes() throws Exception {
		for (int i = 0; i < 20; i++)
		g.roll(1);
		assertEquals(20, g.score());
		}
}
}
