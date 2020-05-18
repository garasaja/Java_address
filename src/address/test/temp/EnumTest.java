package address.test.temp;

import org.junit.Test;

import address.model.GroupType;
import address.model.Member;

public class EnumTest {
	
	@Test
	public void 이넘_투스트링이_머지() {
		Member m = 
				new Member(1, "홍길동", "0102222", "부산시", GroupType.가족);
		System.out.println(m.getGroupType().toString());
	}
}
