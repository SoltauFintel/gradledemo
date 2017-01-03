package tw;

/**
 * CowSay
 */
public class Cow {
	/*
	 * 'com.github.ricksbrown:cowsay:1.+' funktioniert nicht mit Gretty/Tomcat.
	 * Die Alternative 'at.yawk.cowsay:cowsay:1.0' erzeugt ein Memory Leak.
	 * Daher habe ich CowSay selbst (vereinfacht) entwickelt.
	 */
	
	public static String say(String text) {
		int length = text.length() + 2;
		String oben = makeString('_', length);
		String unten = makeString('-', length);
		String indent = makeString(' ', 6 - length / 2);
		return indent + " " + oben + "\r\n"
				+ indent + "< " + text + " >\r\n"
				+ indent + " " + unten + "\r\n"
				+ "        \\   ^__^\r\n"
				+ "         \\  (oo)\\_______\r\n"
				+ "            (__)\\       )\\/\\\r\n"
				+ "                ||----w |\r\n"
				+ "                ||     ||";	
	}
	
	private static String makeString(char c, int length) {
		if (length < 1) {
			return "";
		}
		return new String(new char[length]).replace("\0", "" + c);
	}
}
