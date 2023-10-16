import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] ABV = br.readLine().split(" ");

        double A = Integer.parseInt(ABV[0]);
        double B = Integer.parseInt(ABV[1]);
        double V = Integer.parseInt(ABV[2]);

        int X = (int)Math.ceil((V-B)/(A-B));

        bw.write(String.valueOf(X));

        br.close();
        bw.flush();
        bw.close();
    }
}
