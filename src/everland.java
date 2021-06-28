package everland;

import java.util.Scanner;
import java.util.stream.IntStream;


public class everland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int currentYear=2021;
		final int priceA=60000, priceB=56000, priceC=50000;
		final int priceA_age=48000, priceB_age=44000, priceC_age=40000;
		final int priceA_disabled=36000, priceB_disabled=33000, priceC_disabled=30000;
		final int priceA_disabled_age=28000, priceB_disabled_age=26000, priceC_disabled_age=24000;
		final int priceA_merit=30000, priceB_merit=28000, priceC_merit=25000;
		final int priceA_merit_age=24000, priceB_merit_age=22000, priceC_merit_age=20000;
		final int priceA_dadung=48000, priceB_dadung=44000, priceC_dadung=40000;
		final int priceA_dadung_age=38000, priceB_dadung_age=35000, priceC_dadung_age=32000;
		final int priceA_pregnant=51000, priceB_pregnant=47000, priceC_pregnant=42000;
		
		String ticketKind="", pref="", ageText="";
		String[] prefText= {"장애인 우대할인","국가유공자 우대할인","다자녀 우대할인","임산부 우대할인","우대없음"};
		
		int totalPrice=0, age=0, count=0;

		int priceSetADate[]= {20210904,20210905,20210911,20210912,20210918,2021919,20210920,20210921,20210922,20210925,20210926,20211002,20211003,2021109,20211010,20211016,20211017,20211023,20211024,20211030,20211031,20211106,20211107};
		int priceSetBDate[]= {20210601,20210602,20210603,20210604,20210605,20210606,20210607,20210608,20210609,20210610,20210611,20210612,20210613,20210619,20210620,20210626,20210627,20210703,20210704,20210710,20210711,20210717,20210718,20210724,20210725,20210729,20210730,20210731,20210801,20210802,20210803,20210807,20210808,20210814,20210815,20210821,20210822,20210828,20210829,20210903,20210906,20210907,20210908,20210909,20210910,20210913,20210914,20210915,20210916,20210917,20210923,20210924,20210927,20210928,20210929,20210930,20211001,20211004,20211005,20211006,20211007,20211008,20211011,20211012,20211013,20211014,20211015,20211018,20211019,20211020,20211021,20211022,20211025,20211026,20211027,20211028,20211029,20211101,20211102,20211103,20211104,20211105,20211108,20211109,20211110,20211111,20211112,20211113,20211114,20211120,20211121,20211127,20211128};
		int priceSetCDate[]= {20210614,20210615,20210616,20210617,20210618,20210621,20210622,20210623,20210624,20210625,20210628,20210629,20210630,20210701,20210702,20210705,20210706,20210707,20210708,20210709,20210712,20210713,20210714,20210715,20210716,20210719,20210720,20210721,20210722,20210723,20210726,20210727,20210728,20210804,20210805,20210806,20210809,20210810,20210811,20210812,20210813,20210816,20210817,20210818,20210819,20210820,20210823,20210824,20210825,20210826,20210827,20210830,20210831,20210901,20210902,20211115,20211116,20211117,20211118,20211119,20211122,20211123,20211124,20211125,20211126,20211129,20211130};


		String[] saveTicketKind = new String [10];
		String[] saveAgeText = new String [10];
		int[] saveQuantity = new int [10];
		int[] savePrice = new int [10];
		String[] savePref = new String [10];
		
		
		
		
		
		int inputContinue;
		do {
			Scanner myInput = new Scanner(System.in);
			
			System.out.println("이용날짜를 입력해주세요.(ex)20210605");
			int inputDate = myInput.nextInt();
			System.out.println("주민번호 앞자리를 입력하세요 (ex)900902");
			int inputIdfNum = myInput.nextInt();
			System.out.println("몇장을 주문하시겠습니까?");
			int inputQuantity = myInput.nextInt();
			System.out.println("우대사항을 선택하세요(숫자입력)\n1. 없음(나이 우대는 자동 처리)\n2. 장애인\n3. 국가유공자\n4. 다자녀\n5. 임산부");
			int inputPref = myInput.nextInt();
			
			
			
			
			if ( (inputIdfNum < 999999) && (inputIdfNum > 180000) ) {
				age=currentYear- ( (inputIdfNum/10000)+1900 );
			} else {
				age=currentYear- ( (inputIdfNum/10000)+2000 );
			}
			
			
			if (age>=65) {
				ageText="경로";
			}
			else if (age<=12) {
				ageText="소인";
			}
			else if (age>12 && age<19) {
				ageText="청소년";
			}
			else {
				ageText="대인";
			}
				
			
			
					
			if(IntStream.of(priceSetADate).anyMatch(x -> x == inputDate)) {
				ticketKind="A";
			}
			else if (IntStream.of(priceSetBDate).anyMatch(x -> x == inputDate)) {
				ticketKind="B";
			}
			else if (IntStream.of(priceSetCDate).anyMatch(x -> x == inputDate)) {
				ticketKind="C";
			}
			else {
				System.out.println("날짜를 다시 입력해주세요.");
				
			}
			
			
			
			
			
			if (inputPref==1) {
				pref=prefText[4];
				if ( (age>=65) || (age<=12) ) {
					switch(ticketKind) {
					case "A" : totalPrice=priceA_age*inputQuantity; break;
					case "B" : totalPrice=priceB_age*inputQuantity; break;
					default : totalPrice=priceC_age*inputQuantity;
					}
				}
				
				else {
					switch(ticketKind) {
					case "A" : totalPrice=priceA*inputQuantity; break;
					case "B" : totalPrice=priceB*inputQuantity; break;
					default : totalPrice=priceC*inputQuantity;
					}
					
				}}
			
				
			else if (inputPref==2) {
				pref=prefText[0];
				if ( (age>=65) || (age<=12) ) {
					switch(ticketKind) {
					case "A" : totalPrice=priceA_disabled_age*inputQuantity; break;
					case "B" : totalPrice=priceB_disabled_age*inputQuantity; break;
					default : totalPrice=priceC_disabled_age*inputQuantity;
					
				}}
				
				else {
					switch(ticketKind) {
					case "A" : totalPrice=priceA_disabled*inputQuantity; break;
					case "B" : totalPrice=priceB_disabled*inputQuantity; break;
					default : totalPrice=priceC_disabled*inputQuantity;
					}
				}}
	
	
			else if (inputPref==3) {
				pref=prefText[1];
				if ( (age>=65) || (age<=12) ) {
	
					switch(ticketKind) {
					case "A" : totalPrice=priceA_merit_age*inputQuantity; break;
					case "B" : totalPrice=priceB_merit_age*inputQuantity; break;
					default : totalPrice=priceC_merit_age*inputQuantity;
					}
				}
				else {
					switch(ticketKind) {
					case "A" : totalPrice=priceA_merit*inputQuantity; break;
					case "B" : totalPrice=priceB_merit*inputQuantity; break;
					default : totalPrice=priceC_merit*inputQuantity;
					}
				}}
	
				
				
			
			else if (inputPref==4) {
				pref=prefText[2];
				if ( (age>=65) || (age<=12) ) {
	
					switch(ticketKind) {
					case "A" : totalPrice=priceA_dadung_age*inputQuantity; break;
					case "B" : totalPrice=priceB_dadung_age*inputQuantity; break;
					default : totalPrice=priceC_dadung_age*inputQuantity;
					}
				}
				else {
					switch(ticketKind) {
					case "A" : totalPrice=priceA_dadung*inputQuantity; break;
					case "B" : totalPrice=priceB_dadung*inputQuantity; break;
					default : totalPrice=priceC_dadung*inputQuantity;
					}
				}
	
				
				
			}
				
			else if (inputPref==5) {
				pref=prefText[3];
				switch(ticketKind) {
				case "A" : totalPrice=priceA_pregnant*inputQuantity; break;
				case "B" : totalPrice=priceB_pregnant*inputQuantity; break;
				default : totalPrice=priceC_pregnant*inputQuantity;
				}
			}		
			
			
			
			
			
			saveTicketKind[count]=ticketKind;
			saveAgeText[count]=ageText;
			saveQuantity[count]=inputQuantity;
			savePrice[count]=totalPrice;
			savePref[count]=pref;
				
			count++;


			System.out.println("계속 구매하시려면 1을, 구매를 종료하시려면 2를 입력해주세요.");
			inputContinue = myInput.nextInt();
	
		

		} while (inputContinue==1);
		
		
		int realTotalPrice =0;
		for (int i=0; i<count;i++) {
			realTotalPrice=realTotalPrice+savePrice[i];
		}

		
		
		System.out.println("=================EVERLAND=================");
		System.out.printf("총 가격은 %d원입니다. 감사합니다.\n",realTotalPrice);
		
		
		for (int i=0;i<count;i++) {
			System.out.printf("%s티켓 %s X %d장 총 %7d원 %s 적용\n",saveTicketKind[i],saveAgeText[i],saveQuantity[i],savePrice[i],savePref[i]);
			
		}
			
		System.out.println("==========================================");
		

		
		
		
		
}
}
