import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class StringExercisesMain
{   
     public static char exercise1() {
        String se1 = "StringExercise";
        char char1 = se1.charAt(0);
        return char1;
        
    }
    public static String exercise2() {
        String s1 = "String1";
        String s1sub = s1.substring(0,3);
        return s1sub;
    }
    public static char exercise3() {
        String s2 = "String2";
        String s2sub = s2.substring(2,5);
        return s2.charAt(0);
    }
    public static String exercise4() {
        String s1 = "String1";
        String s2 = "String1";
        String bComparison = "";
        if (s2.compareTo(s1) == 1)
            {
                bComparison = "not same";
            }
        else
            {
                bComparison = "same";
            }
        return "Compared to " + s1 + ", " + s2 + " is " + bComparison;
        
    }
    public static String exercise5() {
        String s1 = "String1";
        String s2 = "string1";
        String bComparison = "";
        if (s2.equalsIgnoreCase(s1))
            {
                bComparison = "same";
            }
        else
            {
                bComparison = "not same";
            }
        return "Compared to " + s1 + ", " + s2 + " is " + bComparison;
        
    }
    public static String exercise6() {
        String str1 = "String 1";
        String str2 = "String 2";
        return str1 + " " + str2;
    }
    public static String exercise7() {
     String str1 = "String Exercise 1";
     if (str1.contains("String")) {
         System.out.println("The text contains 'String'.");
         
        } else {
         System.out.println("The text does not contain 'String'.");
        }
     return " ";
    }
    public static String exercise8() {
        String str1 = "String Exercise 8";
        String charSequence = "SE9";
        if (str1.equalsIgnoreCase(charSequence)) {
            System.out.println("The string and the character sequence are the same");
        } else {
            System.out.println("The string and the character sequence are not the same");
        }
        return " ";
    }
    public static String exercise9() {
        char[] charArray = {'A', 'B', 'C', 'D'};
        String str = new String(charArray);
        return str;
    }
    public static String exercise10() {
        String sr1 = "String exercise";
        String sr2 = "String exercises";
        String sr3 = "es";
        boolean ends1 = sr1.endsWith(sr3);
        boolean ends2 = sr2.endsWith(sr3);
        System.out.println("String 1 ends with es: " + ends1);
        System.out.println("String 2 ends with es: " + ends2);
        return " ";
    }
    public static String exercise11() {
        String str1 = "String 1";
        String str2 = "String 2";
        boolean bool1 = str1.equals(str2);
        return "The two strings are the same: " + bool1;
    }
    public static String exercise12() {
        String str1 = "String exercise 12";
        String str2 = "string exercise 12";
        boolean bool1 = str1.equalsIgnoreCase(str2);
        return "The two strings are the same ignoring case difference: " + bool1;
    }
    public static String exercise13() {
     return " ";   
    }
    public static char[] exercise14() {
      String str1 = "Hello World";
      char[] stringtoCharArray = str1.toCharArray();
      return stringtoCharArray;
    }
    public static String exercise15() {
        String str1 = "String 1";
        String str2 = new String("String 2");
        return str2;
    }
    public static int exercise16() {
        String str1 = "String exercises 1";
        return str1.lastIndexOf("exercises");
    }
    public static int exercise17() {
        String str1 = "String exercise 17";
        return str1.length();
    }
    public static String exercise18() {
       String str1 = "String exercise: 18";
       String str2 = "String 18";
       String str1sub = str1.substring(0,6);
       String str2sub = str2.substring(0,6);
       if (str1sub.equals(str2sub)) {
           System.out.println("The first word in both is: " + str1sub);
        } else {
           System.out.println("The first words don't match");
        }
       return " ";
    }
    public static String exercise19() {
        String duck = "duck duck go";
        String duck1 = duck.replace("d", "f");
        return duck1;
    }
    public static String exercise20() {
        String fox = "The quick brown fox jumps over the lazy dog.";
        String new_cat = fox.replace("fox", "cat");
        return new_cat;
    }
    public static String exercise21() {
        String str1 = "Java string exercises";
        String str2 = "String exercises";
        System.out.println("String str1 starts with Java: " + str1.startsWith("Java"));
        System.out.println("String str2 starts with Java: " + str2.startsWith("String"));
        return " ";
    }
    public static String exercise22() {
        String str1 = "Java String exercises";
        String str1sub = str1.substring(0,5);
        return str1 + " " + str1sub;
    }
    public static char[] exercise23() {
        String str1 = "STRING";
        char[] charArray1 = str1.toCharArray();
        return charArray1;
    }
    public static String exercise24() {
        String str1 = "STRING";
        return str1.toLowerCase();
        
    }
    public static String exercise25() {
        String str1 = "string";
        return str1.toUpperCase();
    }
    public static String exercise26() {
        String s1 = "  String  Exercise  ";
        return s1.trim();
    }
    public static int exercise27() {
        String banana = "bananas";
        String bananasub = banana.substring(0,6);
        return bananasub.length();
    }
    public static void exercise28() {
        String banana = "bananas";
        System.out.println(banana);
    }
    public static void exercise32(String str, int n) {
        int strLength = str.length();
        int partLength;
        if (strLength % n != 0) {
            System.out.println("Can't be divided equally");
        }
        partLength = strLength / n;
        for (int i = 0; i< strLength; i++) {
            if (i % partLength == 0){
               System.out.println();
               System.out.print(str.charAt(i));
            
        }
    }
}
    public static void exercise33() {
        
    }
    public static void main() {
         System.out.println(exercise1());
         System.out.println(exercise2());
         System.out.println(exercise3());
         System.out.println(exercise4());
         System.out.println(exercise5());
         System.out.println(exercise6());
         System.out.println(exercise7());
         System.out.println(exercise8());
         System.out.println(exercise9());
         System.out.println(exercise10());
         System.out.println(exercise11());
         System.out.println(exercise12());
         System.out.println(exercise13());
         System.out.println(exercise14());
         System.out.println(exercise15());
         System.out.println(exercise16());
         System.out.println(exercise17());
         System.out.println(exercise18());
         System.out.println(exercise19());
         System.out.println(exercise20());
         System.out.println(exercise21());
         System.out.println(exercise22());
         System.out.println(exercise23());
         System.out.println(exercise24());
         System.out.println(exercise25());
         System.out.println(exercise26());
         System.out.println(exercise27());
         exercise28();
         exercise32("String", 5);
    }
    
    
    
    
    
    
    
   
}
