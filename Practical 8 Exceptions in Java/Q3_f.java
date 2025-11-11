// Exp8 part6 Class C inherits from B
public class C extends B {
    // Override method to throw third-level exception
    @Override
    public void show() throws MyThirdLevelException {
        throw new MyThirdLevelException("Exception from class C (Third level)");
    }
}
