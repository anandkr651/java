class bank {
    String Accountname;
    public int AccountNumber;
    protected String AccountType;
    private int password;
}

public class encapulationBasic {
    public static void main(String args[]) {
        bank b1 = new bank();
        b1.Accountname = "anand";
        b1.AccountNumber = 235;
        b1.AccountType = "saving";
        // bank.password=3867;
        System.out.println(b1.Accountname);
        System.out.println(b1.AccountNumber);
        System.out.println(b1.AccountType);
        // System.out.println(bank.password);
    }
}
/*anand
235
saving
PS D:\java\oop\encapulation> */