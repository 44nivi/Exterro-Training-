package com.exterro;

import java.util.Scanner;	


	abstract class Customer{ //creating an abstract class

		String customerName;

		int accountNumber;

		String branchName;

		int Balance;

		

		

		public Customer(String customername, int accNumb, String Branch){//creating a constructor

			customerName=customername;

			accountNumber =accNumb;

			branchName=Branch;

		}

		abstract void Deposit(String customername);

		abstract void Withdrawal(String customername);

		abstract void showBalance(String customername);

		

		 String getCustName() { // Method to get name

			return "Customer Name is "+customerName;

		}

		 void setName(String customername) { // Method to set a name

			customerName=customername;

		}

		 String getAccountNumber() { //Method to get place

			return "AccountNumber is " +accountNumber;

		}

		 void setAccountNumber(int accNumb) { //Method to set place

			accountNumber=accNumb;

		}

		 void setBranch(String Branch) { // Method to set a name

				branchName=Branch;

			}

		 String getBranchName() { //Method to get place

				return "Branch of the Bank is " +branchName;

		 }

		 	

	}

	class Customers extends Customer { //child class extends parent class customer

		

		 Customers(String customername,int accNumb,String Branch){

			super( customername, accNumb,Branch);

		}

		@Override

		void Deposit(String customername) {//Method to print depositted amount and available balance

			

			Scanner s = new Scanner(System.in);

			System.out.println("Enter Amount to be deposited :");

			int DepositAmt=s.nextInt();

			

			System.out.println(getCustName());

			System.out.println(getAccountNumber());

			System.out.println(getBranchName());

		

			System.out.println("Amount of Rs. "+DepositAmt+" is depositted successfully");

			int Balance =setBalance(customername);

			if( customername.equalsIgnoreCase(customer1)) {

				Balance+=DepositAmt;

				System.out.println("Available Balance is Rs." +Balance );

			}

			else if(customername.equalsIgnoreCase(customer2)) {

				Balance+=DepositAmt;

				System.out.println("Available Balance is Rs." +Balance );

			}

			else if(customername.equalsIgnoreCase(customer3)) {

				Balance+=DepositAmt;

				System.out.println("Available Balance is Rs." +Balance );

			}

			

		

		}

		@Override

		void Withdrawal(String customername) {//Method to perform withdrawal and display balance

			

			Scanner s = new Scanner(System.in);

			System.out.println("Enter the amount to withdraw :");

			int withdrawalAmount =s.nextInt();	

			System.out.println("Amount of Rs. "+withdrawalAmount+" withdrawed successfully");

			int Balance =setBalance(customername);

			if( customername.equalsIgnoreCase(customer1)) {

				Balance-=withdrawalAmount;

				System.out.println("Available Balance is Rs." +Balance );

			}

			else if(customername.equalsIgnoreCase(customer2)) {

				Balance-=withdrawalAmount;

				System.out.println("Available Balance is Rs." +Balance );

			}

			else if(customername.equalsIgnoreCase(customer3)) {

				Balance-=withdrawalAmount;

				System.out.println("Available Balance is Rs." +Balance );

			}

			

		}

			

		

			

		

		String customer1= "Monika";

		String customer2="Divya";

		String customer3="Tae";

		

		int setBalance(String customername) {// method to set balance to users

			

			 if(customername.equalsIgnoreCase(customer1))

			 return 50000;

			 else if(customername.equalsIgnoreCase(customer2))

			 return 80000;

			 else if (customername.equalsIgnoreCase(customer3))

			 return 40000;

			 else

				 return 0;

			

			

		 }

		@Override

		void showBalance(String customername) {//method to show balance

		

			if( customername.equalsIgnoreCase(customer1)) {

					System.out.println("Balance in Account is Rs."+setBalance(customername) );

			}

			else if( customername.equalsIgnoreCase(customer2)) {	

					System.out.println("Balance in Account is Rs."+setBalance(customername) );

			}

					else if( customername.equalsIgnoreCase(customer3)) {	

					System.out.println("Balance in Account is Rs."+setBalance(customername) );			

					}

		

	}

	}

	public class test {

		public static void main(String[] args) {

			for(int i =0; i<=4; i++) {

			String customername;

			int accNumb;

			String Branch;	

			Scanner s = new Scanner(System.in);

			System.out.println("Enter Customer Name: ");

			customername=s.next();

			System.out.println("Enter Account Number: ");

			accNumb= s.nextInt();

			System.out.println("Enter Branch of the Bank: ");

			Branch = s.next();

			// options to choose for deposit, withdrawal, and display balance

		 System.out.println("Enter the choice to perform 1-for Deposit 2- for Withdrawal 3- for showBalance");

			

		 int choice = s.nextInt();

		 Customers d = new 	Customers(customername,accNumb,Branch);

		 if(choice==1) {

			

			d.Deposit(customername);

		 }

			if (choice==2) {

				d.Withdrawal( customername);

				

			}

			if (choice ==3) {

				d.showBalance(customername);

			}

			

		}

		}

	}




