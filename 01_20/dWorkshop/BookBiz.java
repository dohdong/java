package dWorkshop;

public class BookBiz {
	private Magazine[] magazines;
	private Novel[] novels;

	public BookBiz() {
		magazines = new Magazine[] {
				new Magazine("Cooking Light", 15000, "living, cooking", "America Cooking" ),
				new Magazine("Auto Bild    ", 16000, "science, car", "Germany Car")};


		novels = new Novel[] {
				new Novel("The Confession", 10500, "Grisham, John"),
				new Novel("Les Miserables", 17500, "Hugo, Victor"),
				new Novel("Breakthrough", 47200, "Ifill, Gwen"),
				new Novel("The Racketeer", 38000, "Grisham, John")};
	}


	public void printAllBooks() {
		for(Magazine m : magazines) {
			System.out.println(m.toString());
	}
		for(Novel n : novels) {
			System.out.println(n.toString());
		}
		//둘다.
	}

	public void printAllMagazines() {
		for(Magazine m : magazines) {
			System.out.println(m.toString());
	}
		//magazine 만
	}

	public void printAllNovels() {
		for(Novel n : novels) {
			System.out.println(n.toString());
		}
		//novel만

	}

	public void printMagazineOneYearSubcription() {
		System.out.println("1.Cooking Light : "+calculateOneYearSubcriptonPrice(15000));
		System.out.println("2.Auto Bild : "+calculateOneYearSubcriptonPrice(16000));
		//test에 들어가야 할 것 같은데 뭔가 애매하네. 흠.. 뭐지..
	}

	public void searchNovelByAuthor(String author) {
		for(Novel n : novels) {
			if(n.getAuthor().equals(author)) {
				System.out.println(n.toString());
			}
		}
		

	}

	public void searchNovelByPrice(int minPrice, int maxPrice) {
		for (Novel n : novels) {
			if(n.getPrice()<maxPrice && n.getPrice()>minPrice) {
				System.out.println(n.toString());
			}
		}

	}

	private int calculateOneYearSubcriptonPrice(int price) {
		int OneYearPrice;
		OneYearPrice = price * 12;
		
		return OneYearPrice ;
	}


}


