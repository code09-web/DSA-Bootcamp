// https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
// here we need to find first uppercase in given string ..
public class Q2_UpperCase {
   static char first(String str, int i)
    {
    if (str.charAt(i) == '\0')
        return 0;
    if (Character.isUpperCase(str.charAt(i)))
            return str.charAt(i);
    return first(str, i + 1);
    }
    public static void main(String[] args) {
        String str="devendra";
        char res=first(str, 0);
        if(res==0)
        System.out.println("there is no any uppercase latter in this string ");
        else System.out.println(res);
    }
}
