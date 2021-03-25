import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Array_MaxMinelement {

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

        out.println("Enter length of an array");
        int len = in.nextInt();
        int arr[] = new int[len];

        for (int i=0;i<len;i++){
            arr[i] = in.nextInt();
        }

        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<len-1;i++){
            if (min>arr[i+1]){
                min=arr[i+1];
            }
            else if(max<arr[i+1]){
                max=arr[i+1];
            }
        }

        out.println("Max num = "+max);
        out.println("Min num = "+min);

        out.close();
    }
}
