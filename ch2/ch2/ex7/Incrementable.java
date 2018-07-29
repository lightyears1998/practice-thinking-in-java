package ch2.ex7;

@SuppressWarnings("static-access")
public class Incrementable {

	public static void main(String[] args) {
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		st1.i++; st2.i++; increment();
		System.out.println(StaticTest.i);
	}

	static void increment()
	{
		StaticTest.i++;
	}
	
}
