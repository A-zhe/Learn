package po;
/** 

* @author ���� : ����

* @date ����ʱ�䣺2020��2��10�� ����3:16:57 

* ��˵�� :��������չ��

*/
//ͨ������ӳ�䶩�����û���ѯ������ô���̳а����ֶν϶��pojo��
public class OrdersCustom {

	//����û�����
//	user.username
//	user.sex
//	user.address
	
	private String username;
	private String sex;
	private String address;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "OrdersCustom [username=" + username + ", sex=" + sex + ", address=" + address + "]";
	}
	
	
}
