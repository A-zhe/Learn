package mapper;

import java.util.List;

import po.User;
import po.UserCustom;
import po.UserQueryVo;

/**
 * 
 * @author ���� : ����
 * 
 * @date ����ʱ�䣺2020��2��7�� ����3:14:38
 * 
 *       ��˵�� :mapper�ӿڣ��൱��dao�ӿڣ��û�����
 * 
 */
public interface UserMapper {

	// �û��ۺ���Ϣ��ѯ
	public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;

	// �û��ۺ���Ϣ��ѯ����
	public int findUserCount(UserQueryVo userQueryVo) throws Exception;

	// ����id��ѯ�û���Ϣ
	public User findUserById(int id) throws Exception;
	
	// ����id��ѯ�û���Ϣ,ʹ��resultMap���
	public User findUserByIdResultMap(int id) throws Exception;
	

	// �����û�����ѯ�û���Ϣ
	public List<User> findUserByName(String name) throws Exception;

	// ����û���Ϣ
	public void insertUser(User user) throws Exception;

	// ɾ���û���Ϣ
	public void deleteUser(int id) throws Exception;

}
