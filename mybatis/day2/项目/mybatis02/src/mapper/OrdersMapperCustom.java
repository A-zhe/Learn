package mapper;

import java.util.List;

import po.Orders;
import po.OrdersCustom;

/** 

* @author ���� : ����

* @date ����ʱ�䣺2020��2��10�� ����3:25:58 

* ��˵�� :����mapper

*/

public interface OrdersMapperCustom {

	//��ѯ����������ѯ�û���Ϣ��һ��һ
	public List<OrdersCustom> findOrdersUser() throws Exception;
	
	//��ѯ����������ѯ�û���Ϣ,ʹ��resultMap
	public List<Orders> findOrdersUserResultMap() throws Exception;
	
	//��ѯ�����������û�����������ϸ��һ�Զ�
	public List<Orders> findOrdersAndOrderDetailResultMap() throws Exception;
	
}
