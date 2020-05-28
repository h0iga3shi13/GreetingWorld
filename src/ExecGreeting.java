

class Greeting { // スーパークラス
	public void greet() {
	}
}

class JapaneseGreeting extends Greeting { // サブクラス
	@Override
	public void greet() {
		System.out.println("こんにちは");
	}
}

class EnglishGreeting extends Greeting { // サブクラス
	@Override
	public void greet() {
		System.out.println("Hello");
	}
}

class ChineseGreeting extends Greeting {
	@Override
	public void greet() {
		System.out.println("你好");
	}
}

public class ExecGreeting {
	public static void main(String[] args) {
		JapaneseGreeting ja = new JapaneseGreeting();
		EnglishGreeting en = new EnglishGreeting();
		ChineseGreeting ch = new ChineseGreeting();
		anyGreeting(ja);
		anyGreeting(en);
		anyGreeting(ch);
	}

	public static void anyGreeting(Greeting g) {
		g.greet();
	}
}
