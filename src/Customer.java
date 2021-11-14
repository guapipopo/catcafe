import java.time.LocalDate;

public class Customer {
    String cunstomName;
    int ruaTimes;
    LocalDate arrive;
    String phoneNum;

    public Customer(String cunstomName, int ruaTimes, LocalDate arrive, String phoneNum) {
        this.cunstomName = cunstomName;
        this.ruaTimes = ruaTimes;
        this.arrive = arrive;
        this.phoneNum = phoneNum;

        if(!phoneNum.matches("^1(3\\d|4[5-9]|5[0-35-9]|6[567]|7[0-8]|8\\d|9[0-35-9])\\d{8}$")){
            System.out.println(cunstomName+"手机格式错误！！");

        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cunstomName='" + cunstomName + '\'' +
                ", ruaTimes=" + ruaTimes +
                ", arrive=" + arrive +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
