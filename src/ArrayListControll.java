package everland;

import java.util.ArrayList;

public class ArrayListControll {
	
	
	
	int realTotalPrice =0;
	int inputContinue;

//	public ArrayList<String> saveTicketKind = new ArrayList<String>();
//	public ArrayList<String> saveAgeText = new ArrayList<String>();
//	public ArrayList<Integer> saveQuantity = new ArrayList<Integer>();
//	public ArrayList<Integer> savePrice = new ArrayList<Integer>();
//	public ArrayList<String> savePref = new ArrayList<String>();
	
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
		System.out.printf("�� ������ %d���Դϴ�. �����մϴ�.\n",realTotalPrice);
		
		
		for (int i=0;i<arrData.size();i++) {
			System.out.printf("%sƼ�� %s  %d�� �� %7d�� %s \n",arrData.get(i).saveTicketKind,arrData.get(i).saveAgeText,
															arrData.get(i).saveQuantity,arrData.get(i).savePrice,arrData.get(i).savePref);
			
			if (arrData.get(i).isCoupon==1) {
				System.out.println("������ �����ó׿�");
			}
			else {
				System.out.println("������ �����ó׿�");
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
