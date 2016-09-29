package Testing;

import static org.junit.Assert.*;

import org.junit.Test;
import Project_Package.Student;
public class UsernameTest {

	@Test
	public void test() {		
				String name="Frank";
				int id = 1346468;
				String expected = name+id;
				Student sid = new Student("Frank","14/08/1990",1346468);
				String actual = sid.getUserName();
				assertEquals(expected,actual);
			}
	}

