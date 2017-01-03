package tw;

import org.junit.Assert;
import org.junit.Test;

public class HelloGradleTest {

	@Test
	public void cowEyes() {
		Assert.assertTrue("Cow eyes missing!", new HelloGradle().getMessage().contains("oo"));
	}

	@Test
	public void udder() {
		Assert.assertTrue("Udder missing!", new HelloGradle().getMessage().contains("-w |"));
	}

	@Test
	public void sayMessage() {
		String message = new HelloGradle().getMessage();
		System.out.println(message);
		Assert.assertTrue("Say Message wrong!", message.contains("< Hello Gradle >"));
	}
}
