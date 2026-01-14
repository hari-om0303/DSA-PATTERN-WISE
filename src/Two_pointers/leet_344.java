package Two_pointers;

public class leet_344 {
    public static void reverseString(char[] s) {
        int f = 0;
        int l = s.length-1;
       while (f<l){
           char temp = s[f];
           s[f] = s[l];
           s[l] = temp;
           f++;
           l--;
       }
    }

    public static void main(String[] args) {
        char[] array = {'h', 'e', 'l', 'l', 'o'};
                reverseString(array);
        System.out.println(array);
    }
}
