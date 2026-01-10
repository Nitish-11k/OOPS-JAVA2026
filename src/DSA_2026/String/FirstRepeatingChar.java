public class FirstRepeatingChar {


  /*
  First we try to solve the problem using naive approach where we will use two loops to check for every character if it is repeating or not.
  If we find a repeating character we will return it.
  The time complexity of this approach is O(n^2) and space complexity is O(1).
  */

  public static String naiveApproach(String str){
    int n = str.length();

    for(int i = 0; i < n ; i++){
      for(int j = i + 1; j < n; j++){
        if(str.charAt(i) == str.charAt(j)){
          return Character.toString(str.charAt(i));
        }
      }
    }
    return "-1";
  }

  /*
  Now We are trying to solve the same problem with optimized approach using Frequency Counting.
  We will use an array to keep track of frequency of each character.
  1. We will traverse the string and for each character we will increase its frequency in the array.
  2. If we find that the frequency of a character is already 1, then we will return that character as it is the first repeating character.
  3. If we traverse the whole string and do not find any repeating character, we will return "-1".
  4. The time complexity of this approach is O(n) and space complexity is O(1) as we are using a fixed size array of 26 characters.
  */

  public static String optimizedApproach(String str){
    int[] freq = new int[26];

    for (int i = 0; i < str.length(); i++) {
        char ch = Character.toLowerCase(str.charAt(i));

        if (ch < 'a' || ch > 'z') continue;

        int index = ch - 'a';

        if (freq[index] != 0) {
            return Character.toString(ch);
        }
        freq[index]++;
    }
    return "-1";

  }

  public static void main(String[] args) {
    String str = "Nitish Kumar";
    System.out.println(naiveApproach(str));
    System.out.println(optimizedApproach(str));

  }

}
