package tw;

import com.github.ricksbrown.cowsay.Cowsay;

public class Multi2 {

	public String getMessage() {
		return Cowsay.say(new String[] { "hi by multi2" });
	}
}
