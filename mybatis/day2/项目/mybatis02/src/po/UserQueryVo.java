package po;

import java.util.List;

/** 

* @author ���� : ����

* @date ����ʱ�䣺2020��2��9�� ����5:32:33 

* ��˵�� ���û���װ����

*/
public class UserQueryVo {
	
	//������id
	private List<Integer> ids;
	
	public List<Integer> getIds() {
			return ids;
		}
	
	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}
	//��������԰�װ����Ҫ�Ĳ�ѯ����
	
	

	//�û���ѯ����
	private UserCustom userCustom;

	public UserCustom getUserCustom() {
		return userCustom;
	}

	public void setUserCustom(UserCustom userCustom) {
		this.userCustom = userCustom;
	}
	
	//���԰�װ�����Ĳ�ѯ��������������Ʒ
	//....
	
	
}
