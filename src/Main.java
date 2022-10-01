import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        String firstName = "Ivan"; // Задача 1
        String secondName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + secondName;
        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println("ФИО для заполнения отчёта - " + fullName.toUpperCase()); //Задача 2

        System.out.println("Данные сотрудника для административного отдела - " + fullName.replace(" ", "; ")); //Задача 3

        String firstName1 = "Семён"; // Задача 4
        String secondName1 = "Семёнович";
        String lastName1 = "Иванов";
        String fullName1 = lastName1 + " " + firstName1 + " " + secondName1;
        fullName1 = fullName1.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName1);

        String fullName2 = "Ivanov Ivan Ivanovich"; //Задача 5 (но ведь проще решить через split...)
        int length = fullName2.length();
        int indexDel = fullName2.indexOf(' ');
        int indexDel1 = fullName2.lastIndexOf(' ');
           String lastName2 = fullName2.substring(0, indexDel);
           String firstName2 = fullName2.substring(indexDel, indexDel1);
           String secondName2 = fullName2.substring(indexDel1, length);
        System.out.println("Имя сотрудника - " + firstName2);
        System.out.println("Фамилия сотрудника - " + lastName2);
        System.out.println("Отчество сотрудника - " + secondName2);

        String fullName3 = "ivanov ivan ivanovich"; //Задача 6
            String[] fullNameMassive = fullName3.split(" ");
            String lastName3 = fullNameMassive[0].substring(0, 1).toUpperCase() + fullNameMassive[0].substring(1);
            String firstName3 = fullNameMassive[1].substring(0, 1).toUpperCase() + fullNameMassive[1].substring(1);
            String secondName3 = fullNameMassive[2].substring(0, 1).toUpperCase() + fullNameMassive[2].substring(1);
            String fullNameToUpperCase = lastName3 + " " + firstName3 + " " + secondName3;
        System.out.println("Правильное написание ФИО - " + fullNameToUpperCase);


    }
}