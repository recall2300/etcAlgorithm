import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P02 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int testCase = Integer.parseInt(br.readLine());
			for (int i = 0; i < testCase; i++) {
				int a = Integer.parseInt(br.readLine());
				int b = Integer.parseInt(br.readLine());
				System.out.println(a+b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
