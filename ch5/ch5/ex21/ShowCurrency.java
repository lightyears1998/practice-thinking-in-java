package ch5.ex21;

public class ShowCurrency {
	public static void main(String[] args)
	{
		Currency cur = Currency.ONE;
		switch(cur)
		{
		case ONE:
		case TWO:
		case THREE:
			System.out.println("This is a simple usage of Currency");
		}
	}
}
