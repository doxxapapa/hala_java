package komplex;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class UserDtoTest {

	@Test
	public void testUserDto() {
		
		String uds= "valami";
		UserDto ud = new UserDto(uds);
		
		Assert.assertEquals(ud.getName(),"valami");
		
	}

	@Test
	public void testGetName() {
		UserDto u = mock(UserDto.class);
		when(u.getName()).thenReturn("asd");
		Assert.assertEquals(u.getName(), "asd");
	}

	@Test
	public void testSetName() {
		UserDto u = new UserDto("maki");
		String v = "zsiarff";
		u.setName(v);
		Assert.assertEquals(u.getName(), "zsiarff");
	}

}
