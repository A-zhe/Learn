package mapper;

import java.util.List;

import po.Orders;
import po.OrdersCustom;

/** 

* @author 作者 : 张哲

* @date 创建时间：2020年2月10日 下午3:25:58 

* 类说明 :订单mapper

*/

public interface OrdersMapperCustom {

	//查询订单关联查询用户信息，一对一
	public List<OrdersCustom> findOrdersUser() throws Exception;
	
	//查询订单关联查询用户信息,使用resultMap
	public List<Orders> findOrdersUserResultMap() throws Exception;
	
	//查询订单（关联用户）及订单明细，一对多
	public List<Orders> findOrdersAndOrderDetailResultMap() throws Exception;
	
}
