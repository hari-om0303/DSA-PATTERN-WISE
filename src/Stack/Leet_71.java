package Stack;

import java.util.Stack;

public class Leet_71 {
    public static String simplifyPath(String path) {

        Stack<String> st = new Stack<>();
        String[] newpath = path.split("/");

        for (String s : newpath) {

            if (s.isEmpty() || s.equals(".")) {
                continue;
            } else if (s.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(s);
            }
        }

        if (st.isEmpty()) {
            return "/";
        }

        String result = "";
        for (String dir : st) {
            result = result + "/" + dir;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/user/Documents/../Pictures"));
    }

}
