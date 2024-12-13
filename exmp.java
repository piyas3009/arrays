public class exmp{
    public static void main(String args[]){
        BankAccount myAcc = new BankAccount();
        myAcc.username="piyas sasmal";
        myAcc.setpassword("putas123");
        System.out.println(" "+myAcc.username);
        // System.out.print("key is found("+i+","+j+")");
    }
}
    class BankAccount{
        public String username;
        private String password;
        public void setpassword(String pwd){
            password=pwd;

        }
      
        }