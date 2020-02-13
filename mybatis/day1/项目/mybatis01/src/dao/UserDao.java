package dao;

import po.User;

/** 

* @author ���� : ����

* @date ����ʱ�䣺2020��2��7�� ����3:14:38 

* ��˵�� :dao�ӿڣ��û�����

*/
public interface UserDao {

	//����id��ѯ�û���Ϣ
	public User findUserById(int id) throws Exception;
	
	//����û���Ϣ
	public void insertUser(User user) throws Exception;
	
	//ɾ���û���Ϣ
	public void deleteUser(int id) throws Exception;
	
}
