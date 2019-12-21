public class User {

    String name;
    private int age;

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
            User user = users[i];
            result = result + user.getAge();
        }
        System.out.println(result);

        int average;
        average = result / users.length;
        System.out.println(average);

        for (int i = 0; i < users.length; i++) {
            User user = users[i];
            if (user.age < average) {
                System.out.println(user.name);
            }
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}