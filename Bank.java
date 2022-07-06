class Bank
{
           public static void main(String[] a)
           {
            BankTransactionApplication na=new BankTransactionApplication();
		    na.withdrawAmount();
		    na.depositAmount();
		    int cb = na.currentbalance;
	           cb+=1000;
	           System.out.println("After added Rs1000 bonus: "+cb);
	           System.out.println("CLO Index of 2... "+a[2]);

		}
}	
