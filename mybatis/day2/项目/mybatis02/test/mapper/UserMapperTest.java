package mapper;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import po.User;
import po.UserCustom;
import po.UserQueryVo;

/** 

* @author ���� : ����

* @date ����ʱ�䣺2020��2��8�� ����9:32:39 

* ��˵�� 

*/
public class UserMapperTest {

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
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//����UserMapper����,mybatis�Զ�����mapper�������
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		//����UserMapper�ķ���
		User user = userMapper.findUserById(1);
		
		System.out.println(user);
		
	}
	
	// ����id��ѯ�û���Ϣ,ʹ��resultMap���
	@Test
	public void testFindUserByIdResultMap() throws Exception {
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//����UserMapper����,mybatis�Զ�����mapper�������
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		//����UserMapper�ķ���
		User user = userMapper.findUserByIdResultMap(1);
		
		System.out.println(user);
		
	}
	
	@Test
	public void testFindUserByName() throws Exception {
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//����UserMapper����,mybatis�Զ�����mapper�������
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		//����UserMapper�ķ���
		List<User> list = userMapper.findUserByName("С��");
		
		sqlSession.close();
		
		System.out.println(list);
		
	}
	
	
	//�û���Ϣ��������ѯ
	@Test
	public void testFindUserList() throws Exception {
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//����UserMapper����,mybatis�Զ�����mapper�������
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		//������װ�������ò�ѯ����
		UserQueryVo userQueryVo = new UserQueryVo();
		UserCustom userCustom = new UserCustom();
		
		//��������ʹ�ö�̬sql�����������ĳ��ֵ����������ƴ����sql��
//		userCustom.setSex("1");
		userCustom.setUsername("С��");
		//������id
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(1);
		ids.add(10);
		ids.add(22);
		//��idsͨ��userQueryVo����statement��
		userQueryVo.setIds(ids);
		userQueryVo.setUserCustom(userCustom);
		
		//����UserMapper�ķ���
		List<UserCustom> list = userMapper.findUserList(userQueryVo);
		
		sqlSession.close();
		
		System.out.println(list);
		
	}
	
	
	//�û���Ϣ���ܻ���ѯ
	@Test
	public void testFindUserCount() throws Exception {
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//����UserMapper����,mybatis�Զ�����mapper�������
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		//������װ�������ò�ѯ����
		UserQueryVo userQueryVo = new UserQueryVo();
		UserCustom userCustom = new UserCustom();
		userCustom.setSex("1");
		userCustom.setUsername("����");
		userQueryVo.setUserCustom(userCustom);
		
		//����UserMapper�ķ���
		int count  = userMapper.findUserCount(userQueryVo);
		
		sqlSession.close();
		
		System.out.println(count);
		
	}

}
