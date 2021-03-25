import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Array_Kthminmax {

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

        int len = in.nextInt();
        int[] arr = new int[len];

        for(int i=0;i<len;i++){
            arr[i] = in.nextInt();
        }

        int kthmin = in.nextInt();
        int kthmax = in.nextInt();

        for(int k=0;k<len-1;k++){
            int min_ind = k;
            for(int i=k+1;i<len;i++){
                if(arr[i]<arr[min_ind]){
                    min_ind = i;
                }
            }
            int temp = arr[min_ind];
            arr[min_ind] = arr[k];
            arr[k] = temp;
        }

        out.println("Min = "+ arr[kthmin-1]);
        out.print("Max = "+ arr[len-kthmax]);

        out.close();
    }

    /*
    * Input format
    * number of array elements
    * array elements
    * Kth min
    * Kth max
    * */
}
