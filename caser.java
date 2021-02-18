import java.util.Scanner;
class caser
{ 
     
    public static StringBuffer word(String str1, int n1) 
    { 
        StringBuffer text= new StringBuffer(); 
  
        for (int i=0; i<str1.length(); i++) 
       	{ 
                char ch = (char)(((int)str1.charAt(i) + 
                                  n1 - 97) % 26 + 97); 
                text.append(ch); 
        } 
        return text; 
    } 
  
    
    public static void main(String[] args) 
    { 
        Scanner in = new Scanner(System.in);
	System.out.print("Enter the message to be encrypted : ");
	String str = ""; 
	str = in.nextLine();
	str = str.toUpperCase();
        int n = 3;   
	int m = n - 3;
        System.out.println("encripted message: " + word(str, n));
       	System.out.println("Decriptrd message: " + word(str, m));
    } 
} 
