/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.setName("a");
		Child c2 = new Child();
		c2.setName("b");
		Child c3 = new Child();
		c3.setName("c");
		Child c4 = new Child();
		c4.setName("d");
		Child c5 = new Child();
		c5.setName("e");
		
		Mother m = new Mother();
		m.Child[0] = c1;
		m.Child[1] = c2;
		m.Child[2] = c3;
		m.Child[3] = c4;
		m.Child[4] = c5;
		m.show();
	}
}