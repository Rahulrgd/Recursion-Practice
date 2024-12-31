package Assignment_1;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

  public static void main(String[] args) {
    String str = "abcd";
    List<StringBuilder> ans = findPowerSet(str);
    System.out.println(ans);
  }

  private static List<StringBuilder> findPowerSet(String input) {
    StringBuilder output = new StringBuilder();
    List<StringBuilder> result = new ArrayList<>();
    find(input, 0, output, result);
    return result;
  }

  private static void find(
    String input,
    int i,
    StringBuilder output,
    List<StringBuilder> result
  ) {
    // System.out.println(result);
    if(i==input.length() && i>=0){
      result.add(new StringBuilder(output));
      return;
    }
    output.append(input.charAt(i));
    // System.out.println(output);
    find(input, ++i, output, result);
    output.deleteCharAt(output.length()-1);
    // System.out.println(output);
    find(input, i, output, result);

  }
}
