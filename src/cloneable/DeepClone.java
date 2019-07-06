package cloneable;

public class DeepClone {

    public static void main(String[] args) throws CloneNotSupportedException {
        Test test = new Test();
        test.t = 1;
        NewObject newObject = new NewObject();
        newObject.j = 3;
        test.newObject = newObject;
        Test test1 = test.clone();
        test1.t = 2;
        test1.newObject.j = 4;
        System.out.println(test.t);
        System.out.println(test.newObject.j); //output 3
    }
}

class Test implements Cloneable {
    int t;
    NewObject newObject;

    @Override
    protected Test clone() throws CloneNotSupportedException {
        Test t = (Test) super.clone();
        t.newObject = newObject.clone();
        return t;
    }
}

class NewObject implements Cloneable {
    int j;

    @Override
    protected NewObject clone() throws CloneNotSupportedException {
        return (NewObject) super.clone();
    }
}
