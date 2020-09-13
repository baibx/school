import jdk.internal.jshell.tool.resources.l10n;

public class test {
  static String rotateRight(String input, int notNegative) {
    if (input == null) {
      return null;
    }
    
    if (notNegative == 0) {
      return input;
    }

    if (notNegative > input.length() && notNegative % input.length() == 0) {
        return input;
    }
    
    if (notNegative > input.length()) {
      int newNotNegative = notNegative % input.length();
      String theBackToDaFront = input.substring(input.length() - newNotNegative);
      String theFrontToDaBack = input.substring(0, input.length() - newNotNegative);
      return theBackToDaFront + theFrontToDaBack;
    }

    String theBackToDaFront = input.substring(input.length() - notNegative);
    String theFrontToDaBack = input.substring(0, input.length() - notNegative);
    return theBackToDaFront + theFrontToDaBack;
  }

  







    public static void main(String[] args) {
      System.out.println(rotateRight("CS125", 4));

      
      
      


      
      
      


    }
}
