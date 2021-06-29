package everland;

import java.util.ArrayList;

public class ArrayListControll {
	
	
	
	int realTotalPrice =0;
	int inputContinue;

	public ArrayList<String> saveTicketKind = new ArrayList<String>();
	public ArrayList<String> saveAgeText = new ArrayList<String>();
	public ArrayList<Integer> saveQuantity = new ArrayList<Integer>();
	public ArrayList<Integer> savePrice = new ArrayList<Integer>();
	public ArrayList<String> savePref = new ArrayList<String>();

	
	
	public void saveDataClear() {
		saveTicketKind.clear();
		saveAgeText.clear();
		saveQuantity.clear();
		savePrice.clear();
		savePref.clear();
	}
	
	public void saveDataInsert(String ticketKind, String ageText, int inputQuantity, int totalPrice, String pref) {
		saveTicketKind.add(ticketKind);
		saveAgeText.add(ageText);
		saveQuantity.add(inputQuantity);
		savePrice.add(totalPrice);
		savePref.add(pref);
	}
	


	public void printResult() {

		System.out.println("=================EVERLAND=================");
		System.out.printf("총 가격은 %d원입니다. 감사합니다.\n",realTotalPrice);
		
		
		for (int i=0;i<saveTicketKind.size();i++) {
			System.out.printf("%s티켓 %s  %d장 총 %7d원 %s \n",saveTicketKind.get(i),saveAgeText.get(i),saveQuantity.get(i),savePrice.get(i),savePref.get(i));
			
		}
			
		System.out.println("==========================================\n\n");
		
	}
	
	public void finalPrice() {
		for (int i=0; i<saveTicketKind.size();i++) {
			realTotalPrice=realTotalPrice+savePrice.get(i);
		}

	}
	
}
