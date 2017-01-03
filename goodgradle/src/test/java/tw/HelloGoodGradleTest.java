package tw;

import org.junit.Assert;
import org.junit.Test;

import tw.HelloGoodGradle;

public class HelloGoodGradleTest {

	@Test
	public void say() {
		String text = HelloGoodGradle.say();
		Assert.assertTrue(text.contains("Gradle"));
	}
}
