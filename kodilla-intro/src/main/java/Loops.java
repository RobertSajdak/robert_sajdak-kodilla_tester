public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        String[] names = new String[]{"Paulina", "Robert", "Roksana"};
        int numberOfElements = names.length;
        System.out.println(names.length);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public int sumNumbers(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }
}