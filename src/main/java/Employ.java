

public record Employ (String surname, String name, String patronymic,
                     String position, String email, String telephone, int salary,
                     int age) {


    public void displayingInformationAboutAnEmployee() {
        System.out.println("=====Информация о сотруднике =====");
        System.out.println("ФИО: " + surname + " " + name + " " + patronymic);
        System.out.println("Должность: " + position);
        System.out.println("Электронная почта: " + email);
        System.out.println("Номер телефона: " + telephone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println("===============================");
    }

    public int getAge() {
        return age;
    }

}

