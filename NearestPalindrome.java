import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NearestPalindrome {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number to check whether it's prime or not! ");
		
		int n=Integer.parseInt(br.readLine());
		if(!checkPalin(String.valueOf(n)))
		{
			int t1=n, t2=n;
			while(true)
//				t1++)))
			{
				if(!checkPalin(String.valueOf(t1)))
					t1++;
				else
					break;
			}
			while(t2>0)
			{
				if(!checkPalin(String.valueOf(t2)))
					t2--;
				else
					break;
			}
			System.out.println(t1-n>n-t2?t2:t1);
		}
		else
			System.out.println("Number entered is Palindrome!");
	   
	}
	public static boolean checkPalin(String left) {
		int i = 0, j = left.length() - 1;
		while (i < j) {
			if (left.charAt(i) != left.charAt(j))
				return false;
			i++;
			j--;
		}
//		System.out.println(left+" is palindrome");
		return true;
	}

}
