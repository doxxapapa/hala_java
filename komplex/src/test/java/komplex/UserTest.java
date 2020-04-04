package komplex;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;
public class UserTest {
	
	@Test
	public void UserConstructorTest(){	
		
	     String nameTest = "Zsolti";
	     boolean enabledTest = true;
	     String neptunkodTest = "ZMVJT8";
	     
	     User user = new User(nameTest, enabledTest, neptunkodTest);
	     
	     Assert.assertEquals(user.getName(), nameTest);

		Assert.assertEquals(user.getNeptunkod(), neptunkodTest);

		Assert.assertEquals(user.isEnabled(), enabledTest);
	}
	
	

	@Test
	public void testGetName() {
		User u = mock(User.class);
		when(u.getName()).thenReturn("Bela");
		Assert.assertEquals(u.getName(), "Bela");
	}

	@Test
	public void testIsEnabled() {
		User u = mock(User.class);
		when(u.isEnabled()).thenReturn(true);
		Assert.assertEquals(u.isEnabled(), true);
	}

	@Test
	public void testGetNeptunkod() {
		User u = mock(User.class);
		when(u.getNeptunkod()).thenReturn("abcd123");
		Assert.assertEquals(u.getNeptunkod(), "abcd123");
	}

}
