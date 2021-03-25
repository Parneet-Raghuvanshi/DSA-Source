import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Array_Reverse {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        final FastReader in = new FastReader();
        final PrintWriter out = new PrintWriter(System.out);

        out.println("Enter the number of elements in array");
        int len = in.nextInt();
        int tem=len;
        int arr[] = new int[len];
        int rev[] = new int[len];

        for(int i=0;i<len;i++){
            arr[i] = in.nextInt();
        }

        for (int i=0;i<len;i++)
        {
            rev[tem-i-1] = arr[i];
        }

        /*for (int i=0;i<len;i++){
            rev[tem-i-1] = in.nextInt();
        }*/

        for (int i=0;i<len;i++){
            out.print(rev[i]+" ");
        }

        out.close();
    }
}
