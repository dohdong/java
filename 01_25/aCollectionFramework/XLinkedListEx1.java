package aCollectionFramework;

import java.util.LinkedList;


public class XLinkedListEx1 {

	public static void main(String[] args) {
		String[] groupA = { "K3", "k5", "k7","k9", "G70" ,"G80" ,"G90"};
		LinkedList<String> q = new LinkedList<String>();
		for (String n : groupA)
			q.offer(n);   //�������� offer
		System.out.println("q�� ũ�� :"+q.size() );
		String data = " ";
		
		while((data = q.poll()) != null)  // ���� ���� poll.
			System.out.println(data+"����!");
		System.out.println("q�� ũ�� : " +q.size());
		
		//���� �� ��Ұ� ���� ������ FIFO ���.
		
	}

}
