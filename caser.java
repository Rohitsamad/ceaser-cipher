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
        String str = ""; 
        int n = 3;   
        System.out.println("encripted: " + word(str, n)); 
    } 
} 
