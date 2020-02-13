package mapper;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import po.Orders;
import po.OrdersCustom;

/** 

* @author 作者 : 张哲

* @date 创建时间：2020年2月10日 下午4:01:29 

* 类说明 

*/
public class OrdersMapperCustomTest {

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


	//查询订单关联查询用户信息，一对一
	@Test
	public void testFindOrdersUser() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//创建代理对象
		OrdersMapperCustom ordersMapperCustom = sqlSession.getMapper(OrdersMapperCustom.class);
		
		//调用mapper方法
		
		List<OrdersCustom> list = ordersMapperCustom.findOrdersUser();
		
		System.out.println(list);
		
		sqlSession.close();
	}

	//查询订单关联查询用户信息,使用resultMap
	@Test
	public void testfindOrdersUserResultMap() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//创建代理对象
		OrdersMapperCustom ordersMapperCustom = sqlSession.getMapper(OrdersMapperCustom.class);
		
		//调用mapper方法
		
		List<Orders> list = ordersMapperCustom.findOrdersUserResultMap();
		
		System.out.println(list);
		
		sqlSession.close();
	}
	
	//查询订单（关联用户）及订单明细，一对多
	@Test
	public void testfindOrdersAndOrderDetailResultMap() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//创建代理对象
		OrdersMapperCustom ordersMapperCustom = sqlSession.getMapper(OrdersMapperCustom.class);
		
		//调用mapper方法
		
		List<Orders> list = ordersMapperCustom.findOrdersAndOrderDetailResultMap();
		
		System.out.println(list);
		
		sqlSession.close();
	}
}
