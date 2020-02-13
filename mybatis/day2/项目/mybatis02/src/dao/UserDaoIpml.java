package dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import po.User;

/**
 * 
 * @author ���� : ����
 * 
 * @date ����ʱ�䣺2020��2��7�� ����3:17:29
 * 
 *       ��˵�� :dao�ӿ�ʵ����
 * 
 */
public class UserDaoIpml implements UserDao {

	// ��Ҫ��daoʵ������ע��SqlSessionFactory
	// ͨ�����췽��ע��
	private SqlSessionFactory sqlSessionFactory;

	public UserDaoIpml(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public User findUserById(int id) throws Exception {

		SqlSession sqlSession = sqlSessionFactory.openSession();

		User user = sqlSession.selectOne("test.findUserById", id);

		// �ͷ���Դ
		sqlSession.close();

		return user;
	}

	@Override
	public void insertUser(User user) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();

		sqlSession.insert("test.insertUser", user);

		//�ύ����
		sqlSession.commit();
		
		// �ͷ���Դ
		sqlSession.close();

	}

	@Override
	public void deleteUser(int id) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();

		sqlSession.delete("test.deleteUser", id);

		//�ύ����
		sqlSession.commit();
		
		// �ͷ���Դ
		sqlSession.close();


	}

}
