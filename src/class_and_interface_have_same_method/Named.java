package class_and_interface_have_same_method;

public interface Named {
    default int getCount() {
        return 8;
    }
}
