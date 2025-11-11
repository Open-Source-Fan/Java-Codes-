//Exp 8 part3 Exception inherits from MySecondLevelException
public class MyThirdLevelException extends MySecondLevelException {
    public MyThirdLevelException(String msg) {
        super(msg);
    }
}
