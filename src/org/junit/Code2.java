package org.junit;

public class Code2 {
	@Test
	public void aTest()
	{
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
	@Ignore
	@Test
	public void btest()
	
	{
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
	@Test
	public void cTest()
	{
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(false);
	}
@Test
public void dTest()
{
	Assert.assertTrue(true);
	Assert.assertTrue(true);
	Assert.assertTrue(true);
}
}
