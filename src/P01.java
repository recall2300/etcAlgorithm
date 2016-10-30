import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P01 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer("Welcome to my home!");
		try {
			int testCase = Integer.parseInt(br.readLine());
			for (int i = 0; i < testCase; i++) {
				String inputString = br.readLine();
				StringBuffer inputsb = new StringBuffer(inputString);
				for(int j=0;j<sb.length();j++){
					for(int k=0;k<inputsb.length();k++){
						if(sb.charAt(j) == inputsb.charAt(k)){
							sb.deleteCharAt(j);
							j--;
							inputsb.deleteCharAt(k);
							break;
						}
					}
				}
				int result=sb.length();
				if(sb.length()!=inputsb.length()){
					result += Math.abs(sb.length() - inputsb.length());
				}
				System.out.println(result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
