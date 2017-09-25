import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

public class AntesDepois {

	
	
	
	@Before
	public void before(){
		System.out.println("@Before");
	}
	@After
	public void after(){
		System.out.println("@After");
	}
	@BeforeClass
	public static void beforeClass(){
		System.out.println("@BeforeClass");
	}
	@AfterClass
	public static void AfterClass(){
		System.out.println("@AfterClass");
	}
	
	
	@Test
	public void test1() {
		System.out.println("Test 1");
	}

	@Test
	public void test2() {
		System.out.println("Test 2");
	}

	@Test
	public void tes3() {
		System.out.println("Test 3");
	}

}
