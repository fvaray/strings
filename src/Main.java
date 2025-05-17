// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        //int age = scanner.nextInt();
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println(fullName);

        System.out.println("Задача 2");
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println(fullNameUpperCase);

        System.out.println("Задача 3");
        fullName = "Иванов Семён Семёнович";
        System.out.println(fullName);
        String fullNameReplace = fullName.replace('ё', 'е');
        System.out.println(fullNameReplace);
    }
}