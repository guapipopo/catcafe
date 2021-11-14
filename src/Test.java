import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Cat> cats1=new ArrayList<>();
        cats1.add(new OrangeCat("橘猫1",4,'F',true));
        cats1.add(new OrangeCat("橘猫2",2,'M',false));
        cats1.add(new BlackCat("黑猫1",5,'M'));
        cats1.add(new BlackCat("黑猫2",6,'M'));
        List<Cat> cats2=new ArrayList<>();


        System.out.println("**********************登记啦**********************");
        List<Customer> customers=new ArrayList<>();
        Customer c1=new Customer("顾客1",2, LocalDate.of(2020,1,4),"134324");
        Customer c2=new Customer("顾客2",4, LocalDate.now(),"13459197399");

        System.out.println("**********************开店啦**********************");
        MyCatCafe shop1=new MyCatCafe(200,cats1,customers);
        MyCatCafe shop2=new MyCatCafe(0,cats2,customers);
        System.out.println("**********************买猫啦**********************");
        try {
            System.out.print("1:");
            shop1.buyCat(new OrangeCat("橘猫3",4,'F',true),cats1);
            shop1.buyCat(new BlackCat("黑猫3",6,'M'),cats1);
        }catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.print("2:");
            shop2.buyCat(new OrangeCat("橘猫4",4,'F',true),cats2);

        }catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
        System.out.println("**********************接客啦**********************");
        try {

                System.out.print("1:");
                shop1.service(c1);
                shop1.service(c2);

        }catch (CatNotFoundException e){
            System.out.println(e.getMessage());
        }


        try {

                System.out.print("2:");
                shop2.service(c1);

        }catch (CatNotFoundException e){
            System.out.println(e.getMessage());
        }

        System.out.println("**********************歇业啦**********************");
        System.out.print("1:");
        shop1.isClosed();
        System.out.print("2:");
        shop2.isClosed();


    }
}
