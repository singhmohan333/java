class ProtectedVar{
	public static void main(String arg[])
	{
	ProtectedVar2 obj = new ProtectedVar2();
	System.out.println(obj.a);
	}	

}

class ProtectedVar1{
protected int a=8;
//protected
}

class ProtectedVar2 extends ProtectedVar1{
	

} 