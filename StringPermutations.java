
/**
 * Write a description of class StringPermutations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringPermutations
{
    private static void StringPerm(String perm, String input){
        if(input.length() == 0) {
         System.out.println(perm);   
        } else {
         for(int i = 0; i<input.length(); i++) {
             StringPerm(perm+input.charAt(i), input.substring(0, i) + input.substring(i + 1, input.length())); 
            }
        }
    }
    public static void main(String[] args) {
        StringPerm("","ABC");
    }
}
