package komplex;

import org.junit.Assert;

import org.junit.Test;

public class NeptunCodeGeneratorTest {

	@Test
	public void test() {
		NeptunCodeGenerator ncg = new NeptunCodeGenerator();
	
		int valami = ncg.getNextCounter();
		int valami2 = ncg.getNextCounter();
		Assert.assertEquals(valami,0);
		Assert.assertEquals(valami2,1);
	}

}
