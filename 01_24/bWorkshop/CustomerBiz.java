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
		System.out.println("------------------------ 고객 정보 ------------------------" );

		//		for (Customer c : customers) {     //인덱스를 나타내려면 새로운 변수를 만들어서 새로 설정해줘야한다...
		//			System.out.println( "[이름]"+c.getName()+"[나이]"+c.getAge()+"[전화번호]"+c.getPhone() );
		//		} 

		for(int i=0;i<customers.size();i++) {
			System.out.print(i+1+".[이름]"+customers.get(i).getName()+"  [나이]"+customers.get(i).getAge()+"  [전화번호]"+customers.get(i).getPhone());
			System.out.println();
		
		}System.out.println("---------------------------------------------------------" );
	}

	@Override
	public void insertCustomer() {
		System.out.println("---------------------------------------------------------" );
		System.out.println(" 새로운 고객 정보를 추가합니다. ");
		System.out.println(" 새로운 고객의 정보를 입력하세요. ");
		System.out.println("---------------------------------------------------------" );
		System.out.print("이름:");
		String name=CustomerUtil.getUserInput();
		System.out.print("나이:");
		String age=CustomerUtil.getUserInput();
		System.out.print("전화번호:");
		String phone=CustomerUtil.getUserInput();
		customers.add(new Customer(name,Integer.parseInt(age),phone));
		System.out.println("@ 고객정보를 추가하였습니다");


	}

	@Override
	public void insertCustomer(Customer customer) {
		customers.add(customer); // 딱히 쓰지는 않음 그냥 .add를 활용함.

	}

	@Override
	public void deleteCustomer() {
		System.out.println("---------------------------------------------------------" );
		System.out.println(" 새로운 고객 정보를 삭제합니다. ");
		System.out.println(" 삭제할 고객의 번호를 입력하세요. ");
		System.out.println("---------------------------------------------------------" );
		System.out.print("> 번호 :");
		int cus=Integer.parseInt(CustomerUtil.getUserInput());
		customers.remove(cus-1);
		System.out.println("@ "+cus+"번 고객 정보를 삭제하였습니다.");

	}


}
