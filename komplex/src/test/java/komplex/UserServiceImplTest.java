package komplex;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

import java.util.ArrayList;
import java.util.List;



public class UserServiceImplTest {

	UserModify um= mock(UserModify.class);
	Validator va = mock (Validator.class);
	List<Validator> vlist = new ArrayList<>();
	User u = mock(User.class);
	
	@Test
	public void testSave() {
		SpaceValidator spaceValidator = mock(SpaceValidator.class);
        LengthValidator lengthValidator = mock(LengthValidator.class);
        vlist.add(spaceValidator);
        vlist.add(lengthValidator);
        User user = mock(User.class);
        UserServiceImpl usimpl = new UserServiceImpl(um, vlist);
    	
        um.save(user);
        usimpl.save(user);
        verify(um, times(1)).save(user);

	}


}
