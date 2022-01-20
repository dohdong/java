package aWorkshop3;

public class Travel {
	private String travelCode;
	private String cityName;
	private String flight;
	private int travelType;
	private int maxPeople;
	private int reserved;
	
	public final static int INDIVIDUAL = 0;
	public final static int PACKAGE = 1;
	
	public Travel(String travelCode, String cityName, String flight, int travelType, int maxPeople) {
		this.travelCode = travelCode;
		this.cityName = cityName;
		this.flight = flight;
		this.travelType = travelType;
		this.maxPeople = maxPeople;
	}
	
	public String getTravelCode() {
		return travelCode;
	}
	
	public String getCityName() {
		return cityName;
	}
	
	public String getFilght() {
		return flight;
	}
	
	public String getTravelType() {
		String book =null;
		
		if (travelType == INDIVIDUAL) {
			book = "개별자유여행";
		}else if (travelType == PACKAGE) {
			book = "패키지여행";
		}
		
		return book;
	}
	
	public int getMaxPeople() {
		return maxPeople;
	}
	
	public int getReserved() {
		return reserved;
	}
	
	public void setReserved(int reserved) { 
		this.reserved = reserved;
	}
	
	public void printTravelInfo() {
		
//		System.out.println("===== <메뉴> =====");
//		System.out.println("1. 전체 여행 상품 조회");
//		System.out.println("2. 개별 자유여행 상품 조회");
//		System.out.println("3. 패키지 여행 상품 조회");
//		System.out.println("4. 여행 상품 예약");
//		System.out.println("9. 종료");
		
		System.out.printf("%1$6s \t  %2$4s  \t %3$5s  \t %4$1s \t  %5$2d명 \t  %6$2d명\n", travelCode, cityName, flight, getTravelType(), maxPeople, reserved); 
		
	}
	
	
	
	

}
