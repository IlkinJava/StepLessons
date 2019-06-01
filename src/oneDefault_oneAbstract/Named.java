package oneDefault_oneAbstract;

public interface Named {
    default String getName() {
        return "oneDefault_oneAbstract.Named Interface";
    }
}