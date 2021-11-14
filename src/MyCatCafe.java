import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class MyCatCafe implements CatCafe {
    double balance;
    List<Cat> catList;
    List<Customer> customersList;
    int rua;

    public MyCatCafe(double balance, List<Cat> catList, List<Customer> customersList) {
        this.balance = balance;
        this.catList = catList;
        this.customersList = customersList;

    }

    private void getCatMsg(Cat cat){
        if(cat instanceof OrangeCat){
            System.out.print("恭喜你成功rua到了");
            System.out.println(cat);
        }

        if(cat instanceof BlackCat){
            System.out.print("恭喜你成功rua到了");
            System.out.println(cat);
        }
    }

    @Override
    public void buyCat(Cat cat,List cat1) {
        if (cat instanceof OrangeCat) {
            if (balance >= cat.price) {
                System.out.println("恭喜你你的宠物店成功买到了一只橘猫！！！！");
                balance -= cat.price;
                cat1.add(cat);
            } else {
                throw new InsufficientBalanceException("钱不够买橘猫啦！！！");
            }
        }

        if (cat instanceof BlackCat) {
            if (balance >= cat.price) {
                System.out.println("恭喜你，你的宠物店成功买到了一只黑猫！！！！");
                balance -= cat.price;
                cat1.add(cat);
            } else {
                throw new InsufficientBalanceException("钱不够买黑猫啦！！！");
            }

        }
    }
    @Override
    public void service(Customer customer) {
         customersList.add(customer);
        if (catList.size() == 0) {
            throw new CatNotFoundException("没猫可摸啦，下次再来吧！！！");
        }
        Random random = new Random();
        System.out.println("恭喜" + customer.cunstomName + "成功rua到猫啦！！！！");
        for (int i = 0; i < customer.ruaTimes; i++) {
            Cat cat = catList.get(random.nextInt(catList.size() - 1));
            System.out.println("rua的猫是" + cat);
            balance += 15;
        }

    }

    @Override
    public void isClosed() {
        for (int i=0;i<customersList.size();i++){
            if(customersList.get(i).arrive.isEqual( LocalDate.now())){
                System.out.println("今天来的顾客有"+customersList.get(i));
                if (catList.size()!=0){
                    rua+=customersList.get(i).ruaTimes;

                }
            }
        }

        System.out.println("你的宠物店今天赚了"+rua*15+"元啦，可以买新猫啦!!!");
    }
}
