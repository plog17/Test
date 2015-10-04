package ca.plog.jenkinstest;

import org.junit.Test;

public class MathHelperTest {

	private static final double delta = .001;

	@Test
	public void AddShouldWork() {
		MathHelper m = new MathHelper();

		double add = m.add(1, 2);

		org.junit.Assert.assertEquals(0, add, delta);
	}

	@Test
	public void AddShouldNotWork() {
		MathHelper m = new MathHelper();

		double add = m.add(1, 2);

		org.junit.Assert.assertEquals(3, add, delta);
	}
}
