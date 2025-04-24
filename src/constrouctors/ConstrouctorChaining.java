package constrouctors;

public class ConstrouctorChaining {
	ConstrouctorChaining(String a){
		System.out.println("no parameter constructor");
		System.out.println("call no 1");
	}
	ConstrouctorChaining(char a,char b,String c){
		System.out.println("constructor colled by multi variables with diffrent type");
		System.out.println("call no 6");
	}
	ConstrouctorChaining(int a, char b){
		this('a','b',"hello");
		System.out.println("constructor colled by multi  variables with diffrent type");
		System.out.println("call no 5");
	}
	ConstrouctorChaining(int a,int b,int c){
		this(10,'A');
		System.out.println("constructor colled by same type of variables but no of variables are diffrent with same type");
		System.out.println("call no 4");
	}
	ConstrouctorChaining(int a,int b){
		this(10,20,30);
		System.out.println("constructor colled by multi variables with same type");
		System.out.println("call no 3");
	}
	ConstrouctorChaining(int a){
		this(10,10);
		System.out.println("constructor colled by single variables");
		System.out.println("call no 2");
	}
	ConstrouctorChaining(){
		this(10);
		System.out.println("no parameter constructor");
		System.out.println("call no 1");
	}
	/*ConstrouctorChaining(char a){
		System.out.println("no parameter constructor");
		System.out.println("call no 1");
		this("good");
	}*/ //this Should be use first line of the code to call contstuctor with construoctor
	public static void main(String[] args) {
		System.out.println("Constructor chaining ig begun");
		ConstrouctorChaining cc=new ConstrouctorChaining();
		
	}

}
