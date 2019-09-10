package org.junit;

public class Code1 {
	@Test
	public void aTest()
	{
		Assert.assertTrue(true);
		Assert.assertTrue(false);
		Assert.assertTrue(false);
	}
	@Test
	public void cTest()
	{
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
	@Test
	public void bTest()
	{
		Assert.assertTrue(false);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
	@Test
	public void dTest()
	{
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}

}
