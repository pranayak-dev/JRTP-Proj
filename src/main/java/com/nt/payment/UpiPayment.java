package com.nt.payment;

import com.nt.main.LifeCard;

public class UpiPayment {

	public void AccountHolderName(String AHN){
		System.out.println("Account Details:");
		System.out.println("Account Holder Name : "+ AHN);
		System.out.println("Account No.");
		System.out.println("Branch Name: );
		System.out.println("Branch Ifsc Code: );

	}
	
	
	public static void main(String[] args) {
		UpiPayment upi = new UpiPayment();
		upi.AccountHolderName("Pranaya Kumar Padhy");
		
		LifeCard lifecard = new LifeCard();
		lifecard.Card("sbi");
		System.out.println("Account Active");
		
	} 

}
