package assertions;

public class AssetTest {
    public static void main(String[] args) {
        int [] arr = {-1,2,3};
        System.out.println(sum(arr));
    }

    public static int sum(int[] arr) {
        assert arr.length>0 && arr[0]>0 : "Number is negative";
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }
}