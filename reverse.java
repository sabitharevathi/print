import java.util.Scanner;


public class reverse {
	public static void main(String d[]){
	int s;
	Scanner abc=new Scanner(System.in);
		s=abc.nextInt();
		int a[]=new int[s];
		for(int i=0;i<s;i++){
			a[i]=abc.nextInt();
		}for(int i=s-1;i>=0;i--){
			System.out.print(a[i]);
		}
		

}}
