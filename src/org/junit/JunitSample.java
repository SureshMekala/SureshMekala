package org.junit;

public class JunitSample {
	@BeforeClass
	public static  void beforeclass()
	{
		System.out.println("Before class");
	}
	@AfterClass
	public static void afterclass()
	{
		System.out.println("After class");
	}
	@Before
	public  void before()
	{
		System.out.println("Before");
	}
	@After
	public void after()
	{
		System.out.println("After");
	}
@Test
public void atest()
{
	System.out.println("Hello Junit");

}
}
