import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class P05 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, String> toKorean = new HashMap<Integer, String>();
		toKorean.put(0, "");
		toKorean.put(1, "ÀÏ");
		toKorean.put(2, "ÀÌ");
		toKorean.put(3, "»ï");
		toKorean.put(4, "»ç");
		toKorean.put(5, "¿À");
		toKorean.put(6, "À°");
		toKorean.put(7, "Ä¥");
		toKorean.put(8, "ÆÈ");
		toKorean.put(9, "±¸");
		
		Map<Integer, String> unit = new HashMap<Integer, String>();
		unit.put(0, "");
		unit.put(1, "½Ê");
		unit.put(2, "¹é");
		unit.put(3, "Ãµ");
		
		Map<Integer, String> highUnit = new HashMap<Integer, String>();
		highUnit.put(1, "");
		highUnit.put(2, "¸¸");
		highUnit.put(3, "¾ï");
		highUnit.put(4, "Á¶");
		Iterator<String> it;
		try {
			int testCase = Integer.parseInt(br.readLine());
			for (int T = 0; T < testCase; T++) {
				int inputNumber = Integer.parseInt(br.readLine());
				int highUnitCount;
				int divide;
				ArrayList<Integer> unitArray = new ArrayList<>();
				LinkedList<String> resultNumber = new LinkedList<>();
				
				while(inputNumber %10000 != 0){
					divide = inputNumber %10000;
					unitArray.add(divide);
					inputNumber = inputNumber/10000;
				}
				for(int i=0;i<unitArray.size();i++){
					int unitCount = 0;
					int unitNumber = unitArray.get(i);
					
					StringBuffer sb = new StringBuffer();
					for(int j=0;j<4;j++){
						String koreanUnit = unit.get(unitCount);
						String transWord = toKorean.get(unitNumber%10);
						if(transWord == ""){
							koreanUnit = "";
						}
						String koreanWord = transWord+koreanUnit;
						StringBuffer sb2 = new StringBuffer(koreanWord).reverse();
						sb.append(sb2.toString());
						unitCount++;
						unitNumber /= 10;
					}
					resultNumber.push(sb.reverse().toString());
				}
				highUnitCount = resultNumber.size();
				it = resultNumber.iterator();
				while(it.hasNext()){
					System.out.print(it.next());
					System.out.print(highUnit.get(highUnitCount--));
					if(it.hasNext()){
						System.out.print(" ");
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
