package address.utils;

public class MyStringParser {
	
	public static int getId(String selectedList) {
		// .은 파싱이 안됨. \\ 혹은 [] 필요
		return Integer.parseInt(selectedList.split("[.]")[0]);
	}
}
