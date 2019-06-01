package comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[3];
        users[0] = new User("Ilkin", 21);
        users[1] = new User("Alan", 37);
        users[2] = new User("Nargiz", 18);
        Arrays.sort(users);
        System.out.println(Arrays.toString(users));

    }
}
