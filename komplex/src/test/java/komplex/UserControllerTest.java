package komplex;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class UserControllerTest {

	
	UserService userService = mock(UserService.class);
	
    NeptunCodeGenerator neptunCodeGenerator = mock(NeptunCodeGenerator.class);
    
    UserController uc = new UserController(userService, neptunCodeGenerator);
	
	@Test
	public void UserControllerConstructorTest() {
		
		UserService userService = mock(UserService.class);
		
	    NeptunCodeGenerator neptunCodeGenerator = mock(NeptunCodeGenerator.class);
	    
	    UserController uc = new UserController(userService, neptunCodeGenerator);
	    
	}
	
	@Test
	public void UserControllerSaveTest() {
		UserDto udto = mock(UserDto.class);
		uc.save(udto);
		
		
		verify(userService, times(1)).save(Mockito.any(User.class));
		
	}

}
