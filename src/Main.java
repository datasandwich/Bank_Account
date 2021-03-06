import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Staff s1 = new Staff();
        s1.checkDate();

        //Creating StaffCredentialsChecker class and running login:
        StaffCredentialsChecker staffCredentialsChecker = new StaffCredentialsChecker();
        staffCredentialsChecker.RunLoginSystem();




//      Options Interface
        boolean exit=false;
        while (!exit){
            String userChoice  = Menu.main();
//          Choice checks
            switch (userChoice) {
                case "1" -> Account.inputDetails();
                case "2" -> s1.viewWhichDetails();
                case "3" -> Account.transferDetails();
                case "4" -> Business.chequeBook();
                case "5" -> Account.deposit();
                case "6" -> Account.withdraw();
                case "7" -> exit = true;
                default -> System.out.println("Invalid option");
            }
        }
    }
}

