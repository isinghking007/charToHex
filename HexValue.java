import java.io.*;
import java.util.*;
public class HexValue {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the starting character");
		char start=in.next().toUpperCase().charAt(0);
		System.out.println("Enter the last character");
		char end=in.next().toUpperCase().charAt(0);
		for(char c=start;c<=end;c++)
		{
			System.out.println(Integer.toHexString((int)c));
		}
	}
}
