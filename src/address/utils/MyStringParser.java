package address.utils;

public class MyStringParser {
	
	public static int getId(String selectedList) {
		// .�� �Ľ��� �ȵ�. \\ Ȥ�� [] �ʿ�
		return Integer.parseInt(selectedList.split("[.]")[0]);
	}
}
