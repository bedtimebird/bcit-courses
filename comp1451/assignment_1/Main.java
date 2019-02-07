class Main {
	 public static void main(String[] args) {
    //Create new dates for Customers
     Date cust1DOB = new Date(12,5,1966);
     Date cust2DOB = new Date(19,2,1967);
     Date cust3DOB = new Date(30,10,1957);
     Date cust4DOB = new Date(12,5,1950);

    //Create four Customers
     Customer cust1 = new Customer ("STePheN Baldwin", "1 Lodge Street, Asheville", cust1DOB);
     Customer cust2 = new Customer ("Benicio DEL TORO", "Raulino de Oliveira, Sao Paulo", cust2DOB);
     Customer cust3 = new Customer("Kevin POllAK", "924 Bel Air Road, Bel Air", cust3DOB);
     Customer cust4 = new Customer("GAbRiEl Byrne", "39 Highgate West Hill, Highgate", cust4DOB);

    //Create new dates for Account
     Date acco1Date = new Date(18, 4, 2013);
     Date acco2Date = new Date(17, 9, 2011);
     Date acco3Date = new Date(23, 12, 2015);
     Date acco4Date = new Date(12, 3, 2014);

    //Create four Accounts
    Account acco1 = new Account(cust1, acco1Date, 5000.34);
    Account acco2 = new Account(cust2, acco2Date, 96218.24);
    Account acco3 = new Account(cust3, acco3Date, 110.52);
    Account acco4 = new Account(cust4, acco4Date, 9000000.00);

    //Create bank
    Bank rbc = new Bank("RBC");

    //Add accounts to bank
    rbc.addAccount(acco1);
    rbc.addAccount(acco2);
    rbc.addAccount(acco3);
    rbc.addAccount(acco4);

    //Display account numbers
    rbc.displayAccountNumbers();

    //Make transaction
    rbc.makeTransaction();

	 }
	}
