package practice;
import java.util.regex.*;
public class JavaRegex {
        public static void main(String args[]){
            System.out.println("metacharacters d....");

            System.out.println(Pattern.matches("\\d", "abc")); //false (non-digit)
            System.out.println(Pattern.matches("\\d", "1")); //true (digit and comes once)
            System.out.println(Pattern.matches("\\d", "4443")); //false (digit but comes more than once)
            System.out.println(Pattern.matches("\\d", "323abc")); //false (digit and char)

            System.out.println("metacharacters D...."); //D means non-digit

            System.out.println(Pattern.matches("\\D", "abc")); //false (non-digit but comes more than once)
            System.out.println(Pattern.matches("\\D", "1")); //false (digit)
            System.out.println(Pattern.matches("\\D", "4443")); //false (digit)
            System.out.println(Pattern.matches("\\D", "323abc")); //false (digit and char)
            System.out.println(Pattern.matches("\\D", "m")); //true (non-digit and comes once)

            System.out.println("metacharacters D with quantifier....");
            System.out.println(Pattern.matches("\\D*", "mak")); //true (non-digit and may come 0 or more times)

            System.out.println("Character Classes with quantifiers....");
            System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true
            System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)
            System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true
            System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)

            System.out.println("by character classes and quantifiers ...");
            System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true
            System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));//true

            System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)
            System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));//false (starts from 6)
            System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));//true

            System.out.println("by metacharacters ...");
            System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));//true
            System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));//false (starts from 3)
        }
}
