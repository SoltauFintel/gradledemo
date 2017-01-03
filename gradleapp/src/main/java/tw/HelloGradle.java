package tw;

import com.github.ricksbrown.cowsay.Cowsay;

public class HelloGradle {

	public static void main(String[] args) {
		System.out.println(new HelloGradle().getMessage());
	}
	
	public String getMessage() {
		return Cowsay.say(new String[] { "Hello Gradle" });
	}
}
