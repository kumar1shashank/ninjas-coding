package Coding_ninjas;

import java.util.Scanner;

public class count_words {
	
	public static int countWords(String str) {
	    int count=0;
	    if(str.length()==0){
            return 0;
        }
	    else {
			for (int i=1;i<str.length();i++)
			{
				
				if (str.charAt(i)==' ')
				{
					count++;
				}
			}
			return count+1;
	    }
		}
		

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
				
		int x= countWords(str); 
		System.out.print(x);

	}

}
