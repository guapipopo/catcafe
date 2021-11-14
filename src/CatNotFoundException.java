public class CatNotFoundException extends RuntimeException{
    static  final long serialVersionUID = -70348971907457669L;

    public CatNotFoundException() {
    }
    public  CatNotFoundException(String meg){
        super(meg);
    }
}
