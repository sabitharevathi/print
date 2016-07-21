import java.util.Scanner;


public class three {
	public static void main(String k[]){
		int a,b,c;
		Scanner abc=new Scanner(System.in);
		a=abc.nextInt();
		b=abc.nextInt();
		c=abc.nextInt();
	
	if((a>b)&&(a>c)){
		System.out.println(a);
	}else if(b>c){
		System.out.println(b);
	}else
	{
		System.out.println(c);
	}

}}
