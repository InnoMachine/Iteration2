package functionTest;

public class Main {


	public static void main(String args[]){
		Console console = new Console();
		//args[0] = "-team -all -total";
		String s[] = new String [2];
		s[0] ="--datasource  C:\\Users\\嘉祺\\Desktop\\文件\\软件工程与计算3\\CSEIII data\\迭代一数据"; 
		console.execute(System.out, s);
		s[0] ="-team -all -total";
		console.execute(System.out, s);
	}
	}
