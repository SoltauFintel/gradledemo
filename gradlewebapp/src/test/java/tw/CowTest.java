package tw;

import org.junit.Assert;
import org.junit.Test;

public class CowTest {

	@Test
	public void say_1() {
		System.out.println(Cow.say("?"));
		Assert.assertTrue("Indent not ok!", Cow.say("?").startsWith("      _"));
	}

	@Test
	public void say_5() {
		//System.out.println(Cow.say("12345"));
		Assert.assertTrue("Indent not ok!", Cow.say("12345").startsWith("    _"));
	}

	@Test
	public void say_9() {
		//System.out.println(Cow.say("123456789"));
		Assert.assertTrue("Indent not ok!", Cow.say("123456789").startsWith("  _"));
	}

	@Test
	public void say_long() {
		System.out.println(Cow.say("Hello Gradle Web App!"));
		Assert.assertTrue("Indent not ok!", Cow.say("Hello Gradle Web App!").startsWith(" _"));
		Assert.assertTrue("Message missing!", Cow.say("Hello Gradle Web App!").contains("< Hello Gradle Web App! >"));
		Assert.assertTrue("Cow eyes missing!", Cow.say("Hello Gradle Web App!").contains("oo"));
	}
}
