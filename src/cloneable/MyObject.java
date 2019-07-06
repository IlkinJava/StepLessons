package cloneable;

public class MyObject implements Cloneable {
    int i;

    @Override
    protected MyObject clone() throws CloneNotSupportedException {
        return (MyObject) super.clone();
    }

    //    public static void main(String[] args) {
//        MyObject myObject = new MyObject();
//        myObject.i = 1;
//        MyObject myObject1 = myObject;
//        myObject1.i = 2;
//        System.out.println(myObject.i);  //output 2
//    }
    public static void main(String[] args) throws CloneNotSupportedException {
        MyObject myObject = new MyObject();
        myObject.i = 1;
        MyObject myObject1 = myObject.clone();
        myObject1.i = 2;
        System.out.println(myObject.i); //output 1
    }
}
