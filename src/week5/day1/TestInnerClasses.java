package week5.day1;

public class TestInnerClasses {

    public static void main(String[] args) {

        InnerClasses.StaticNested staticNested = new InnerClasses.StaticNested();
        staticNested.method();

        InnerClasses innerClasses = new InnerClasses();
        InnerClasses.Inner inner = innerClasses.getInner();
        InnerClasses.Inner inner2 = innerClasses.getInner();
        InnerClasses.Inner inner3 = innerClasses.getInner();
        InnerClasses.Inner inner4 = innerClasses.getInner();
        InnerClasses.Inner inner5 = innerClasses.getInner();
        inner.method();
        inner = null;



    }

}
