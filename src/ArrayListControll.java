package everland;

import java.util.ArrayList;

public class ArrayListControll {
	
	
	
	int realTotalPrice =0;
	int inputContinue;

	public ArrayList<dataClass> arrData = new ArrayList<dataClass>();
		
	public void saveDataClear() {
		arrData.clear();
	}
	
	public void saveDataInsert(String ticketKind, String ageText, int inputQuantity, int totalPrice, String pref, int inputCoupon) {
		
		dataClass item = new dataClass();
		item.saveTicketKind=ticketKind;
		item.saveAgeText=ageText;
		item.saveQuantity=inputQuantity;
		item.savePrice=totalPrice;
		item.savePref=pref;
		item.isCoupon=inputCoupon;
		arrData.add(item);
		
		
	}
	


	public void printResult() {

		System.out.println("=================EVERLAND=================");
		System.out.printf("총 가격은 %d원입니다. 감사합니다.\n",realTotalPrice);
		
		
		for (int i=0;i<arrData.size();i++) {
			System.out.printf("%s티켓 %s  %d장 총 %7d원 %s \n",arrData.get(i).saveTicketKind,arrData.get(i).saveAgeText,
															arrData.get(i).saveQuantity,arrData.get(i).savePrice,arrData.get(i).savePref);
			
			if (arrData.get(i).isCoupon==1) {
				System.out.println("쿠폰이 있습니다.");
			}
			else {
				System.out.println("쿠폰이 없습니다.");
			}
			
			
		}
			
		System.out.println("==========================================\n\n");
		
		
	}
	
	public void finalPrice() {
		for (int i=0; i<arrData.size();i++) {
			realTotalPrice=realTotalPrice+arrData.get(i).savePrice;
		}
		

	}
	
}
