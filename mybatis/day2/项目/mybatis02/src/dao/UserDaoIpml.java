package dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import po.User;

/**
 * 
 * @author 作者 : 张哲
 * 
 * @date 创建时间：2020年2月7日 下午3:17:29
 * 
 *       类说明 :dao接口实现类
 * 
 */
public class UserDaoIpml implements UserDao {

	// 需要向dao实现类中注入SqlSessionFactory
	// 通过构造方法注入
	private SqlSessionFactory sqlSessionFactory;

	public UserDaoIpml(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public User findUserById(int id) throws Exception {

		SqlSession sqlSession = sqlSessionFactory.openSession();

		User user = sqlSession.selectOne("test.findUserById", id);

		// 释放资源
		sqlSession.close();

		return user;
	}

	@Override
	public void insertUser(User user) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();

		sqlSession.insert("test.insertUser", user);

		//提交事务
		sqlSession.commit();
		
		// 释放资源
		sqlSession.close();

	}

	@Override
	public void deleteUser(int id) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();

		sqlSession.delete("test.deleteUser", id);

		//提交事务
		sqlSession.commit();
		
		// 释放资源
		sqlSession.close();


	}

}
