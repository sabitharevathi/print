import java.util.Scanner;


public class factorial {
	public static void main(String k[]){
		int j=1,s,i=1;
		Scanner abc=new Scanner(System.in);
		
		s=abc.nextInt();
		do{
			j=j*i;
			i++;
		}while(i<=s);
		System.out.println(j);
		}
		
	}


