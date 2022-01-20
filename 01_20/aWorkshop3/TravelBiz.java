package aWorkshop3;
//import aWorkshop3.Travel;

public class TravelBiz {
	private Travel[] travels;
	
	
	public TravelBiz() {
		
		 travels = new Travel[] {
				 new Travel("TRV001", "뮌헨", "독일항공", Travel.INDIVIDUAL, 10),
				 new Travel("TRV002", "프라하", "에어프랑스", Travel.INDIVIDUAL,7),
				 new Travel("TRV003", "LA", "델타항공", Travel.PACKAGE,12),
				 new Travel("TRV004", "후쿠오카", "대한항공",Travel.INDIVIDUAL,15),
				 new Travel("TRV005", "상해", "남방항공", Travel.PACKAGE,10) };
		
		
	}
	
	public void printAllTravles() {
		for(Travel t : travels) {
				t.printTravelInfo();
		}
		
	}
	
	public void printIndividualTravles() {
		for(Travel t : travels) {
			if(t.getTravelType().equals("개별자유여행")) {
				t.printTravelInfo();
			}
		}
		
	}
	
	public void printPackageTravels() {
		for(Travel t : travels) {
			if(t.getTravelType().equals("패키지여행")) {
				t.printTravelInfo();
			}
		}
		
	}
	
	public Travel reserveTravel(String travelCode, int reserveCount) {
		Travel t = null;
		for (Travel travel : travels) {
			if (travel.getTravelCode().equals(travelCode)) {
				int people = travel.getMaxPeople()-travel.getReserved();
				if(people > reserveCount  ) {
					travel.setReserved(travel.getReserved()+reserveCount);
					System.out.println("예약이 완료되었습니다.");
				}else {
					System.out.println("예약가능 인원 초과. (예약 가능인원 : "+people+"명)");
				}
			}//outer if end
		}//for end
		return t ;
	}
	
	public void printTravelListTitle() {
		System.out.println();
	}
	

}
