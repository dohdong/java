package aCollectionFramework;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class XSetEx1 {

	public static void main(String[] args) { // �Ѵ� �ߺ��ȵ�.
		String[] groupA = {  "k7",  "K3", "k5","G80","G70", "G70","k9","G90"};
		HashSet<String> hs = new HashSet<String>(); // ����x , Iterator�� ��Ҹ� ����
		TreeSet<String> ts = new TreeSet<String>(); // ����  , Iterator�� ��Ҹ� ����
		
		for (String n : groupA) {
			hs.add(n);  
			ts.add(n);
		}
		System.out.println("hs�� ũ�� :"+hs.size() );
		System.out.println("ts�� ũ�� :"+ts.size() );
		System.out.println("hs :"+hs );
		System.out.println("ts :"+ts );
		
		// Iterator�� �ڹ��� �÷��������ӿ�ũ���� �÷��ǿ� ����Ǿ��ִ� ��ҵ��� �о���� ����� ǥ��ȭ�� ��ü�� �ϳ��̴�.
		// hasNext(), next(), remove()
		Iterator<String> iter = hs.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			iter.remove();
			
		}
		System.out.println("hs�� ũ�� :"+hs.size() );
		
		
	}

}
