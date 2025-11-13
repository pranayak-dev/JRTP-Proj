package com.nt.payment;

import com.nt.main.LifeCard;

public class UpiPayment {

	public void AccountHolderName(String AHN){
		System.out.println("Account Details:");
		System.out.println("Account Holder Name : "+ AHN);
	}
	
	
	public static void main(String[] args) {
		UpiPayment upi = new UpiPayment();
		upi.AccountHolderName("Pranaya Kumar Padhy");
		
		LifeCard lifecard = new LifeCard();
		lifecard.Card("sbi");
		
	} 

}
