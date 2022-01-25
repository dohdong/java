package aCollectionFramework;

import java.util.LinkedList;


public class XLinkedListEx1 {

	public static void main(String[] args) {
		String[] groupA = { "K3", "k5", "k7","k9", "G70" ,"G80" ,"G90"};
		LinkedList<String> q = new LinkedList<String>();
		for (String n : groupA)
			q.offer(n);   //넣을때는 offer
		System.out.println("q의 크기 :"+q.size() );
		String data = " ";
		
		while((data = q.poll()) != null)  // 꺼낼 떄는 poll.
			System.out.println(data+"삭제!");
		System.out.println("q의 크기 : " +q.size());
		
		//먼저 들어간 요소가 먼저 나오는 FIFO 방식.
		
	}

}
