import java.util.Scanner;
public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Расскажите о вашем друге\nКак зовут вашего друга: ");
        String name = scanner.nextLine();
        System.out.print("Сколько лет вашему другу: ");
        int age = scanner.nextInt();
        System.out.println("Моему другу " + name + " на данный момент " + age + " лет");
        scanner.close();
    }
}
