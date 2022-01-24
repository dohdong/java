package bWorkshop;

import java.util.ArrayList;


public class CustomerBiz implements ICustomerBiz {

	ArrayList<Customer> customers = new ArrayList<Customer>();



	@Override
	public void initializeCustomer() {
		customers.add(new Customer("Lee",28,"010-5678-1234"));
		customers.add(new Customer("Park",31,"010-4567-9876"));
		customers.add(new Customer("Choi",25,"010-1111-2222"));

	}

	@Override
	public void printAllCustomer() {
		System.out.println("------------------------ �� ���� ------------------------" );

		//		for (Customer c : customers) {     //�ε����� ��Ÿ������ ���ο� ������ ���� ���� ����������Ѵ�...
		//			System.out.println( "[�̸�]"+c.getName()+"[����]"+c.getAge()+"[��ȭ��ȣ]"+c.getPhone() );
		//		} 

		for(int i=0;i<customers.size();i++) {
			System.out.print(i+1+".[�̸�]"+customers.get(i).getName()+"  [����]"+customers.get(i).getAge()+"  [��ȭ��ȣ]"+customers.get(i).getPhone());
			System.out.println();
		
		}System.out.println("---------------------------------------------------------" );
	}

	@Override
	public void insertCustomer() {
		System.out.println("---------------------------------------------------------" );
		System.out.println(" ���ο� �� ������ �߰��մϴ�. ");
		System.out.println(" ���ο� ���� ������ �Է��ϼ���. ");
		System.out.println("---------------------------------------------------------" );
		System.out.print("�̸�:");
		String name=CustomerUtil.getUserInput();
		System.out.print("����:");
		String age=CustomerUtil.getUserInput();
		System.out.print("��ȭ��ȣ:");
		String phone=CustomerUtil.getUserInput();
		customers.add(new Customer(name,Integer.parseInt(age),phone));
		System.out.println("@ �������� �߰��Ͽ����ϴ�");


	}

	@Override
	public void insertCustomer(Customer customer) {
		customers.add(customer); // ���� ������ ���� �׳� .add�� Ȱ����.

	}

	@Override
	public void deleteCustomer() {
		System.out.println("---------------------------------------------------------" );
		System.out.println(" ���ο� �� ������ �����մϴ�. ");
		System.out.println(" ������ ���� ��ȣ�� �Է��ϼ���. ");
		System.out.println("---------------------------------------------------------" );
		System.out.print("> ��ȣ :");
		int cus=Integer.parseInt(CustomerUtil.getUserInput());
		customers.remove(cus-1);
		System.out.println("@ "+cus+"�� �� ������ �����Ͽ����ϴ�.");

	}


}
