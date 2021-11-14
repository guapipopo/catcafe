public class OrangeCat extends Cat {
    protected boolean isFat;

    public OrangeCat(String catName, int catAge, char sex,boolean isFat) {
        super(catName, catAge, sex, 200);
        this.isFat=isFat;

    }



    @Override
    public String toString() {
        return "OrangeCat{" +
                "catName='" + catName + '\'' +
                ", catAge=" + catAge +
                ", sex=" + sex +
                ", price=" + price +
                ", isFat=" + isFat +
                '}';
    }
}
