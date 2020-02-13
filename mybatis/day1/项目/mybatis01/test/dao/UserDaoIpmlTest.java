package dao;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;

import po.User;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 
 * @author ���� : ����
 * 
 * @date ����ʱ�䣺2020��2��7�� ����4:35:57
 * 
 *       ��˵��:����UserDao
 * 
 */
@SuppressWarnings("unused")
public class UserDaoIpmlTest {

	private SqlSessionFactory sqlSessionFactory;

	// �˷�����ִ��testFindUserById֮ǰִ��
	@Before
	public void setUp() throws Exception {
		// ����sqlSessionFactory
		// mybaties�����ļ�
		String resource = "SqlMapConfig.xml";

		// �õ������ļ���
		InputStream inputStream = Resources.getResourceAsStream(resource);

		// �����Ự����������mybaties�������ļ���Ϣ
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testFindUserById() throws Exception {
		// ����UserDao����
		UserDao userDao = new UserDaoIpml(sqlSessionFactory);

		// ����UserDao����
		User user = userDao.findUserById(1);
		
		System.out.println(user);
		
		
	}

}
