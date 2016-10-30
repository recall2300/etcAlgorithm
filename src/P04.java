import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P04 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		try {
			int testCase = Integer.parseInt(br.readLine());
			for (int T = 0; T < testCase; T++) {
				int repeat = sc.nextInt();
				String inputString = sc.nextLine();
				System.out.println(inputString);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
