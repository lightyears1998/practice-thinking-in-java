package ch2.ex10;

/**
 * In Eclipse,
 * navigate to File > Properties > Run/Debug Settings,
 * click "Edit..." on the right panel, and the switch to "arguments" tab
 * to set command line argument.
 * 
 */
public class Arguments {
	public static void main(String[] args)
	{
		for (int i=0; i<args.length; i++)
			System.out.println(args[i]);
	}
}
