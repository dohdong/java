package qWorkshop;

//public class TestLotto {
//
//	public static void main(String[] args) {
//		Lotto l = new Lotto();
//		int[] lottoNumbers = l.generateLottoNumbers();
//		l.sortLottoNumbers(lottoNumbers);
//		l.displayLottoNumbers(lottoNumbers);
//	}
//
//}

public class TestLotto {

	public static void main(String[] args) {
		LottoTeacher l = new LottoTeacher();
		int[] lottoNumbers = l.generateLottoNumbers();
		l.sortLottoNumbers(lottoNumbers);
		l.displayLottoNumbers(lottoNumbers);
	}

}

