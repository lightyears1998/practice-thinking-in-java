package ch2.ex9;

@SuppressWarnings("unused")
public class AutoBoxing {

	public static void main(String[] args) {
		boolean bool = new Boolean(true);
		char ch = new Character('c');
		byte b = new Byte((byte) 233);
		short sh = new Short((short) 23);
		int i = new Integer(47);
		long ln = new Long(2333);
		float ft = new Float(0.0f);
		double db = new Double(0.0d);
		
		Boolean myBoolean = true;
		Character myCharactrer = 'c';
		Byte myByte = (byte) 233;
		Short myShort = (short) 233;
		Integer myInteger = 233;
		Long myLong = 233L;
		Float myFloat = 0.0f;
		Double myDouble = 0.0d;
		
		// 不像C++，printf()使用的格式符十分有限
		// @link https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html#syntax
		System.out.printf("%b, %c, %d, %d, %d, %d, %f, %f\n",
				bool, ch, b, sh, i, ln, ft, db);
	}

}
