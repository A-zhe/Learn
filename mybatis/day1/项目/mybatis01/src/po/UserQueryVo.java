package po;

import java.util.List;

/** 

* @author 作者 : 张哲

* @date 创建时间：2020年2月9日 下午5:32:33 

* 类说明 ：用户包装类型

*/
public class UserQueryVo {
	
	//传入多个id
	private List<Integer> ids;
	
	public List<Integer> getIds() {
			return ids;
		}
	
	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}
	//在这里可以包装所需要的查询条件
	
	

	//用户查询条件
	private UserCustom userCustom;

	public UserCustom getUserCustom() {
		return userCustom;
	}

	public void setUserCustom(UserCustom userCustom) {
		this.userCustom = userCustom;
	}
	
	//可以包装其他的查询条件，订单、商品
	//....
	
	
}
