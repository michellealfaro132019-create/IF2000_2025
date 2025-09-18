package domain;

public class SavingAccount extends Account {
    private String initialDate; 
    private int months; 
    private float interest; 
public SavingAccount(String initialDate, int months, float interest){
    this.initialDate = initialDate; 
    this.months = months; 
    this.interest = interest;

}
public String getInitialDate() {
        return initialDate;
    }
    public void setInitialDate(String initialDate) {
        this.initialDate = initialDate;
    }
    public int getMonths() {
        return months;
    }
    public void setMonths(int months) {
        this.months = months;
    }
    public float getInterest() {
        return interest;
    }
    public void setInterest(float interest) {
        this.interest = interest;
    }

    @Override
    public void deposit(double amount) {
       super.setBalance(this.getBalance()+ amount);
    }

    @Override
    public void withdraw() {
       if (this.getBalance() >= amount){
        super.setBalance(this.getBalance()- amount); 
       }else{
        System.out.print("do you have enough money"); 
    }
    
    }

    @Override
    public void interestCalculation() {
      double total;  
      total = this.getMonths()
      *super.getBalance() 
      *this.getInterest();

      return getBalance() + total;


     @Override
    public String toString(){
        String result = "\nAccount Type: SAVING ACCOUNT"
        +"\n----------------------------------------------"
        +"\n Initial date of account:"+this.getInitialDate()
        +"\n Months of saving:"+this.getMonths()
        +"\n Interest:"+this.getInterest()
        + "\n Ganied interest:"+(this.getMonths()*super.getBalance()+this.getInterest()
        )
        +"\n Balance after interest; "+this.interestCalculation(); 
        return super.toString()+ result;
    }
    
}
}


