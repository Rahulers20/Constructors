package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

//        Account lennysAccount = new Account("12345", 0.00, "Lenny Smith", "lenny@gmail.com", "(123) 456-7899");
//        System.out.println(lennysAccount.getNumber());
//        System.out.println(lennysAccount.getBalance());
//
//        lennysAccount.withdrawal(100.0);
//
//        lennysAccount.deposit(50.0);
//        lennysAccount.withdrawal(100.0);
//
//        lennysAccount.deposit(51.0);
//        lennysAccount.withdrawal(100.0);
//
//        Account rahulsAccount = new Account("Rahul", "rahul@gmail.com", "12345");
//        System.out.println(rahulsAccount.getNumber() + " name " + rahulsAccount.getCustomerName());



        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());


    }
}
