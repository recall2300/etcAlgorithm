import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P03 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int testCase = Integer.parseInt(br.readLine());
			for (int i = 0; i < testCase; i++) {
				String inputString = br.readLine();
				char[] isArray = inputString.toCharArray();
				String compareString = br.readLine();
				char[] csArray = compareString.toCharArray();
				Arrays.sort(isArray);
				Arrays.sort(csArray);
				boolean result = true;
				if(isArray.length == csArray.length){
					for(int j=0; j<isArray.length;j++){
						if(isArray[j] != csArray[j]){
							result = false;
							break;
						}
					}
				}else{
					result = false;
				}
				System.out.println(result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
