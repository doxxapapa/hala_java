package komplex;

import org.junit.Test;
import org.junit.Assert;
import static org.mockito.Mockito.*;




public class UseRepositoryTest {
	
	UseRepository ur = new UseRepository();
	
	@Test
	public void saveTest() {
		User u = mock(User.class);
		
		when(u.getName()).thenReturn("Zsolti");
		
		ur.save(u);
		
		Assert.assertEquals(ur.findAll().get(0), u);
		Assert.assertEquals(ur.findAll().size(), 1);
	}
	
	@Test
	public void getByNeptunkodTest(){
		User u = mock(User.class);
		when(u.getNeptunkod()).thenReturn("ZMVJT8");
		
		ur.save(u);
		Assert.assertEquals(ur.getByNektunKod("ZMVJT8"), u);
		Assert.assertEquals(ur.getByNektunKod(""),null);
	}

	
	@Test
	public void findByEnabledIsTrueTest() {
		User u = mock(User.class);
		User u1 = mock(User.class);
		when(u.isEnabled()).thenReturn(true);
		when(u1.isEnabled()).thenReturn(false);
		ur.save(u);
		ur.save(u1);
		Assert.assertEquals(ur.findByEnabledIsTrue().get(0),u);
		Assert.assertEquals(ur.findByEnabledIsTrue().size(), 1);
		
		
		
	}
	
}
