package com.capgemini.discount;

public class BillingReport {

 public static int storePrice = 1000;

 public static int GROCERIES = 1;


 public static int getDiscount(int user) {

  if (user == 1) {
   int discountPrice = 30;
   int amount = (discountPrice * storePrice) / 100;

   int discountedAmt = storePrice - amount;

   System.out.println(discountedAmt);
   return discountedAmt;

  } else if (user == 2) {

   int discountPrice = 10;
   int amount = (discountPrice * storePrice) / 100;
   int discountedAmt = storePrice - amount;

   System.out.println(discountedAmt);
   return discountedAmt;
  } else if (user == 3) {

   int discountPrice = 5;
   int amount = (discountPrice * storePrice) / 100;
   int discountedAmt = storePrice - amount;

   System.out.println(discountedAmt);
   return discountedAmt;
  }

  return storePrice;
 }

 public static void getGroceries() {

 }
 public static void restOfGroceries() {

  int billingAmt = getDiscount(1);
  if (billingAmt >= 100) {

   int discountdPrice = (billingAmt * 5) / 100;
   int finalBillAmount = billingAmt - discountdPrice;

   System.out.println("finalBillAmount:-" + finalBillAmount);

  }

 }
 public static void main(String[] args) {
  if (GROCERIES != 1) {

   restOfGroceries();
  } else {
   int groceries = BillingReport.storePrice;
   System.out.println("Done..." + groceries);
  }
  System.out.println("Done...");

 }
}