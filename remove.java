import java.util.Scanner;


public class remove {
	public static void main(String ao[]){
		String s;
		Scanner a=new Scanner(System.in);
		s=a.next();
		StringBuffer br=new StringBuffer(s);
		br.reverse();
	
		String sa= new String(br);
		String ss=sa.replaceAll("[aeiouAEIOU]","");		
		System.out.println(ss);
		}
	}


