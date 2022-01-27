package study.upcastingdowncasting;

public class UpcastDowncast {

	public static void main(String[] args) {
//		A obj =new B(); A-->runtime datatype //B-->complietypeDatatype
		
//		showObj1(new A());
//		showObj1(new B());//runtime datatype in arguments
//		showObj1(new C());
//		showObj1(new D());
//		showObj1(new E());
//		showObj1(new F());
		
		showObj2(new B());
		
	}

	private static void showObj1(B obj) {//complie time datatype in argument
		obj.fa();
		if (obj instanceof B) 
			((B)obj).fb();
		if (obj instanceof C) 
			((C)obj).fc();
//		if (obj instanceof D)		--> D is not in hirercy
//			((D)obj).fd();
		if (obj instanceof E) 
			((E)obj).fe();
		if (obj instanceof F) 
			((F)obj).ff();
	}
	
	private static void showObj2(A obj) {
		obj.fa();
		((B)obj).fb();
//		obj.fc();
//		obj.fd();
//		obj.fe();
//		obj.ff();
	}

}
class A{void fa(){System.out.println("fa");}}

class B extends A{void fb(){System.out.println("fb");}}

class C extends B{void fc(){System.out.println("fc");}}

class D extends A{void fd(){System.out.println("fd");}}

class E extends B{void fe(){System.out.println("fe");}}

class F extends C{void ff(){System.out.println("ff");}}
