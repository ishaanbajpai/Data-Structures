import java.util.*;
import java.io.*;
public class BalancedBrackets {
    public static void main(String[] args) {
       FastReader s = new FastReader();
       String str = s.nextLine();
        Boolean ans = bracketCheck(str);
        if(ans)
            System.out.println("YESSS");
        else
            System.out.println("NOOOO");
    }
    static Boolean bracketCheck(String str)
    {
        if((str.length())%2==1)
            return false;
        else
        {
            Stack <Character> st = new Stack<>();
            for(char s: str.toCharArray())
            {
                switch (s) {
                    case '(':
                        st.push(')');
                        break;
                    case '{':
                        st.push('}');
                        break;
                    case '[':
                        st.push(']');
                        break;
                    default:
                        if(st.isEmpty() || s!=st.peek())
                            return false;
                        st.pop();
                        break;
                }
            }
            return true;
        }
    }
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}