class SubStringCons {
public static void main(String args[]) {	
	byte ascii[] = {65, 66, 67, 68, 69, 70, 71, 72, 73 };
	
	String s1 = new String(ascii);
	System.out.println(s1);
	
	String s2 = new String(ascii, 3, 5);
	System.out.println(s2);
}
} 