public class User {

    private static int age;
    String name;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        User robert = new User("Robert", 46);
        User paula = new User("Paula", 35);
        User roxan = new User("Roksana", 26);
        User kate = new User("Kasia", 28);
        User michael = new User("Michał", 41);

        User[] users = {robert, paula, roxan, kate, michael};

        int result;
        result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + getAge(users);
            System.out.println(result);
        }
    }

    public static int getAge(User[] users) {
        return age;
    }

    public String getName() {
        return name;
    }
}