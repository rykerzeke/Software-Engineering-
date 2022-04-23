package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		JUnitFunctions junit=new JUnitFunctions();
		String res=junit.addstring("Sarthak Sharma,","E20CSE164");
		assertEquals("Sarthak Sharma,E20CSE164",res);
	}

}
