public abstract class Cat {
    protected String catName;
    protected int catAge;
    protected  char sex;
    protected double price;

    public Cat(String catName, int catAge, char sex, double price) {
        this.catName = catName;
        this.catAge = catAge;
        this.sex = sex;
        this.price = price;
    }



    @Override
    public abstract String toString() ;


}
