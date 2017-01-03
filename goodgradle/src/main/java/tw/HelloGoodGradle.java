package tw;

import com.github.ricksbrown.cowsay.Cowsay;

public class HelloGoodGradle {

	/**
	 * @param args --
	 */
	public static void main(String[] args) {
		System.out.println(say());
	}

	/**
	 * Liefert Kuhmeldung.
	 * 
	 * @return mehrzeiliger Text
	 */
	public static String say() {
		try {
			return Cowsay.think(new String[] { "Hello good Gradle !" });
		} catch (Exception e) {
			// FIXME Exception behandeln
		}
		return null;
	}
}
