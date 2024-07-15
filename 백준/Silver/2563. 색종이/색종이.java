import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[100][100];

        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for(int j=a;j<a+10;j++){
                for(int k=b;k<b+10;k++){
                    arr[j][k]=1;
                }
            }
        }
        int total=0;
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                total+=arr[i][j];
            }
        }
        bw.write(total+"\n");

        bw.close();
    }

}