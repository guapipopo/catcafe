public class InsufficientBalanceException extends RuntimeException{
    static  final long serialVersionUID = -703489719074576691L;

    public InsufficientBalanceException() {
    }

    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}
