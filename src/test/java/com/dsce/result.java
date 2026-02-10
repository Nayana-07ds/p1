package com.dsce;
import  org.testng.Assert;
import org.testng.annotations.Test;

public class result {
@Test

	public void testPass() {
		Assert.assertEquals(p1.display(55), "pass");
	}
    @Test
    public void testFail() {
		Assert.assertEquals(p1.display(35), "fail");
	}
    @Test
    public void testInvalid() {
		Assert.assertEquals(p1.display(-5), "invalid");
}
}