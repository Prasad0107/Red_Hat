import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    static void Anagram(String a, String b) {
    	if(a.length()!=b.length()) {
    		System.out.println(a.equals(b));
    	}else {
        
		a=a.toLowerCase();
		b=b.toLowerCase();
		char[] a1=a.toCharArray();
		char[] b1=b.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(b1);
		boolean result=Arrays.equals(a1, b1); 	
		System.out.println(result);
    	}
    }

  public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();
        Anagrams ang = new Anagrams();
        ang.Anagram(a, b);
    }
}
