package address.test.temp;

import org.junit.Test;

import address.model.GroupType;
import address.model.Member;

public class EnumTest {
	
	@Test
	public void �̳�_����Ʈ����_����() {
		Member m = 
				new Member(1, "ȫ�浿", "0102222", "�λ��", GroupType.����);
		System.out.println(m.getGroupType().toString());
	}
}
