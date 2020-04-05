package komplex;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

public class LengthValidatorTest {
	
	LengthValidator lv = new LengthValidator();

	@Test
	public void isUserNameIsLongEnough() {
		//mock
		User u = mock(User.class);
		//when
		when(u.getName()).thenReturn("doxxapap");
		//assert
		Assert.assertTrue(lv.isValid(u));

		
	}
	
	@Test
	public void isUserNameIsTooShort() {
		//mock
		User u = mock(User.class);
		//when
		when(u.getName()).thenReturn("Doxxa");
		//assert
		Assert.assertFalse(lv.isValid(u));
	}


}
