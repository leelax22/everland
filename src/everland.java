package everland;

import java.util.Scanner;

public class everland {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			Scanner myInput = new Scanner(System.in);

			everland_process EverProcess = new everland_process();
			ArrayListControll ArrayProcess = new ArrayListControll();
			
			ArrayProcess.saveDataClear();
			
			do {

				EverProcess.inputDate();
				EverProcess.idfNumCheck();
				EverProcess.ticketKindCheck();
				EverProcess.priceCheck();
				
				EverProcess.couponCheck();
				ArrayProcess.saveDataInsert(EverProcess.ticketKind, EverProcess.ageText, EverProcess.inputQuantity, EverProcess.totalPrice, EverProcess.pref, EverProcess.inputCoupon);

				System.out.println("계속 구매하시려면 1을, 구매를 종료하시려면 2를 입력해주세요.");
				ArrayProcess.inputContinue = myInput.nextInt();
			} while (ArrayProcess.inputContinue==1);
			
			ArrayProcess.finalPrice();
			ArrayProcess.printResult();
	}
		
		
}
}
