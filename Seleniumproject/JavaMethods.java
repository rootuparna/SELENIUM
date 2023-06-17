package Seleniumproject;

public class JavaMethods {


	public static void main(String[] args) {
		
		callingMethod();
		callingMethod();
		
		passingData("kumar");
		passingData("sunitha");
		passingData("Amulya");
		int l=returnvalue();
		System.out.println(l);

	}
	static int returnvalue(){
		
		int x=5;
		return x;
	}
	
	static void callingMethod(){
		
		System.out.println("Welcome to Mehods");
	}
	
	static void passingData(String name){
		System.out.println("Sai" + name);
	}

}
