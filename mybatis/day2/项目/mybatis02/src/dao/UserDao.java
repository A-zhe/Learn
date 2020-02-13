package dao;

import po.User;

/** 

* @author 作者 : 张哲

* @date 创建时间：2020年2月7日 下午3:14:38 

* 类说明 :dao接口，用户管理

*/
public interface UserDao {

	//根据id查询用户信息
	public User findUserById(int id) throws Exception;
	
	//添加用户信息
	public void insertUser(User user) throws Exception;
	
	//删除用户信息
	public void deleteUser(int id) throws Exception;
	
}
