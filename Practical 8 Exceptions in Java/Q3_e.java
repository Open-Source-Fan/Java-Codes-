//Exp 8 part 5 Class B inherits from A
//this is another sub-part of q3 part d 
public class B extends A {
    // Override method to throw second-level exception
    @Override
    public void show() throws MySecondLevelException {
        throw new MySecondLevelException("Exception from class B (Second level)");
    }
}
