package regex;

import java.util.regex.Pattern;

public class Regexex {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{1,}", "Vethsa"));
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{1,5}[ ]{1}[A-Z]{1}[a-z]{2}[ ]{1}[A-Z]{1}[a-z]{1,}[ ]{1}[A-Z]{1}[a-z]{1,}","Geetha Sai Lakshmi Pravanya"));
        System.out.println(Pattern.matches("[A-z]{1}[a-z1-9@.,*$]{1,}","Pravanya.vethsa19@gmail.com"));
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{1,}[ ]{1}[A-Z]{1}[a-z]{1,5}","Pravanya Vethsa"));
        System.out.println(Pattern.matches("[A-Za-z]{1}[A-Za-z1-9@!.$#?,]{1,15}","Pravanya@19"));
        System.out.println(Pattern.matches("[A-Za-z]{1}[A-Za-z1-9@!.$#?,]{1,15}","Pravanya@19"));
        System.out.println(Pattern.matches("[9]{1}[1]{1}[ ]{1}[0-9]{10}","91 7982321683"));

    }
}
