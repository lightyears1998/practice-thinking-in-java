package ch2.ex8;

@SuppressWarnings("static-access")
public class MyStatic {

	static int happy;
	
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++)
		{
			MyStatic t = new MyStatic();
			t.happy = i;
		}
		System.out.println(happy);
	}

}
