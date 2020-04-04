package komplex;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SpaceValidatorTest {

	@Test
	public void testWithoutSpace() {
		SpaceValidator sv = new SpaceValidator();
		User u = mock(User.class);
		when(u.getName()).thenReturn("Evike");
		Assert.assertEquals(sv.isValid(u), true);
	}
	@Test
	public void testWithSpace() {
		SpaceValidator sv = new SpaceValidator();
		User u = mock(User.class);
		when(u.getName()).thenReturn("Evi ke");
		Assert.assertEquals(sv.isValid(u), false);
	}

}
