package mapper;

import java.util.List;

import po.User;
import po.UserCustom;
import po.UserQueryVo;

/**
 * 
 * @author 作者 : 张哲
 * 
 * @date 创建时间：2020年2月7日 下午3:14:38
 * 
 *       类说明 :mapper接口，相当于dao接口，用户管理
 * 
 */
public interface UserMapper {

	// 用户综合信息查询
	public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;

	// 用户综合信息查询总数
	public int findUserCount(UserQueryVo userQueryVo) throws Exception;

	// 根据id查询用户信息
	public User findUserById(int id) throws Exception;
	
	// 根据id查询用户信息,使用resultMap输出
	public User findUserByIdResultMap(int id) throws Exception;
	

	// 根据用户名查询用户信息
	public List<User> findUserByName(String name) throws Exception;

	// 添加用户信息
	public void insertUser(User user) throws Exception;

	// 删除用户信息
	public void deleteUser(int id) throws Exception;

}
