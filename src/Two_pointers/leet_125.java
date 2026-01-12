package Two_pointers;

public class leet_125 {
    public boolean isPalindrome(String s) {
           s = s.trim().toLowerCase();
           s = s.replaceAll("[^a-z0-9]","");
           int n = s.length();
          for (int i=0 ; i<n/2; i++){
              if (s.charAt(i) != s.charAt(n-1-i)){
                  return false;
              }
          }
              return true;
    }

    public static void main(String[] args) {
        leet_125 obj = new leet_125();
        boolean ans = obj.isPalindrome("abba");
        System.out.println(ans);
    }

}
