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
 * @author 作者 : 张哲
 * 
 * @date 创建时间：2020年2月7日 下午4:35:57
 * 
 *       类说明:测试UserDao
 * 
 */
@SuppressWarnings("unused")
public class UserDaoIpmlTest {

	private SqlSessionFactory sqlSessionFactory;

	// 此方法在执行testFindUserById之前执行
	@Before
	public void setUp() throws Exception {
		// 创建sqlSessionFactory
		// mybaties配置文件
		String resource = "SqlMapConfig.xml";

		// 得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);

		// 创建会话工厂，传入mybaties的配置文件信息
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testFindUserById() throws Exception {
		// 创建UserDao对象
		UserDao userDao = new UserDaoIpml(sqlSessionFactory);

		// 调用UserDao方法
		User user = userDao.findUserById(1);
		
		System.out.println(user);
		
		
	}

}
