package first;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import po.User;

/** 

* @author ���� : ����

* @date ����ʱ�䣺2020��2��6�� ����5:25:31 

* ��˵�� �����ų���

*/
public class MybatiesFirst {

	//�����û�id��ѯ�û���Ϣ���õ�һ����¼���
	@Test
	public void findUserByIdTest() throws IOException {
		
		//mybaties�����ļ�
		String resource = "SqlMapConfig.xml";
		
		//�õ������ļ���
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		//�����Ự����������mybaties�������ļ���Ϣ
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		//ͨ�������õ�SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//ͨ��SqlSession�������ݿ�
		//��һ��������ӳ���ļ���statement��id������namespace+"."+statement��id
		//�ڶ���������ָ����ӳ���ļ�����ƥ���parameterType���͵Ĳ���
		//sqlSession.selectOne�������ӳ���ļ�����ƥ���resultType���͵Ķ���
		User user = sqlSession.selectOne("test.findUserById", 1);
		
		System.out.println(user.getUsername());
		System.out.println(user);
		
		//�ͷ���Դ
		sqlSession.close();
		
	}
	
	
	//�����û�����ģ����ѯ�û��б�
	@Test
	public void findUserByNameTest() throws IOException {
		
		//mybaties�����ļ�
		String resource = "SqlMapConfig.xml";
		
		//�õ������ļ���
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		//�����Ự����������mybaties�������ļ���Ϣ
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		//ͨ�������õ�SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//list�е�user��ӳ���ļ���resultType��ָ��������һ��
		List<User> list = sqlSession.selectList("test.findUserByName", "С��");
		System.out.println(list);
		
		sqlSession.close();
		
	}
	
	
	//����û���Ϣ
	@Test
	public void insertUserTest() throws IOException {
		
		//mybaties�����ļ�
		String resource = "SqlMapConfig.xml";
		
		//�õ������ļ���
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		//�����Ự����������mybaties�������ļ���Ϣ
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		//ͨ�������õ�SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//�����û�����
		User user =new User();
		user.setUsername("����a");
		user.setBirthday(new Date());
		user.setSex("1");
		user.setAddress("����֣��");
		
		sqlSession.insert("test.insertUser", user);
		
		//�ύ����
		sqlSession.commit();
		
		//��ȡ�û���Ϣ����
		System.out.println(user.getId());
		
		//�رջỰ
		sqlSession.close();
		
	}
	
	//ɾ���û���Ϣ
	@Test
	public void deleteUserTest() throws IOException {
		
		//mybaties�����ļ�
		String resource = "SqlMapConfig.xml";
		
		//�õ������ļ���
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		//�����Ự����������mybaties�������ļ���Ϣ
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		//ͨ�������õ�SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//����idɾ���û�
		sqlSession.delete("test.deleteUser",28);
		
		//�ύ����
		sqlSession.commit();
		
		//�رջỰ
		sqlSession.close();
		
	}
	
	//�����û���Ϣ
	@Test
	public void updateUserTest() throws IOException {
		
		//mybaties�����ļ�
		String resource = "SqlMapConfig.xml";
		
		//�õ������ļ���
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		//�����Ự����������mybaties�������ļ���Ϣ
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		//ͨ�������õ�SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//�����û���Ϣ
		User user =new User();
		//��������id
		user.setId(26);
		user.setUsername("�����");
		user.setBirthday(new Date());
		user.setSex("2");
		user.setAddress("����֣��");
		
		sqlSession.update("test.updateUser", user);
		
		//�ύ����
		sqlSession.commit();
		
		//�رջỰ
		sqlSession.close();
		
	}
		
	
}
