
//父类
class SuperClass {
	//静态变量value
	public static int value = 666;
	//静态块，父类初始化时会调用
	static{
		System.out.println("父类初始化！");
	}
}
 
//子类
class SubClass extends SuperClass{
	//静态块，子类初始化时会调用
	static{
		System.out.println("子类初始化！");
	}
}
 
//主类、测试类
public class NotInit {
	public static void main(String[] args) {


		long g=(int)3.9;
		System.out.println(g % 2);

		String s = "123";
		String s1 = new String("123");
		System.out.println(s == s1);
		String s2 = "12";
		String s3 = "3";
		String s4 = s2 + s3;
		String s5 = "12" + "3";
		System.out.println(s4 == s5);
		System.out.println(s == s1.intern());
		//	System.out.println(SubClass.value);
	//	SubClass[] subClasses = new SubClass[10];


	}

	public String translate(String str) {
		String tempStr = "";
		try {
			tempStr = new String(str.getBytes("ISO-8859-1"), "GBK");
			tempStr = tempStr.trim();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return tempStr;

	}
}