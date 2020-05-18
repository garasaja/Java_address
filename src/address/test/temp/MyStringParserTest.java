package address.test.temp;

import org.junit.Test;

public class MyStringParserTest {
	
	@Test
	public void getId() {
		int memberId = Integer.parseInt("200.ȫ�浿".split("[.]")[0]);
		System.out.println(memberId);
	}
}
