public class Lesson5 { public static void main(String[] args) {

    Employ[] employeesProductionAndTechnicalDepartment = new Employ[5]; // Массив сотрудников ПТО

    employeesProductionAndTechnicalDepartment[0] = new Employ("Рыжов", "Алексей",
            "Сергеевич", "Главный инженер", "bsdaemon@sovesti.net",
            "+7(985)985-95-85", 200000, 39);
    employeesProductionAndTechnicalDepartment[1] = new Employ("Боднар", "Светлана",
            "Степановна", "Тестировщик", "algol@sovesti.net",
            "+7(985)613-13-13 ", 50000, 33);
    employeesProductionAndTechnicalDepartment[2] = new Employ("Уйманова", "Мария",
            "Олеговна", "Главный бухгалтер", "maria@sovesti.net",
            "+7(903)894-83-43", 50000, 45);
    employeesProductionAndTechnicalDepartment[3] = new Employ("Михайлов", "Александр",
            "Константинович", "Инженер сетей", "misha@sovesti.net",
            "+7(921)845-54-78", 70000, 41);
    employeesProductionAndTechnicalDepartment[4] = new Employ("Глухов", "Андрей",
            "Валерьевич", "Инженер", "gluhovA@sovesti.net",
            "+7(913)723-56-21", 50000, 30);


    for (Employ employ : employeesProductionAndTechnicalDepartment) {
        if (employ.getAge() > 40) {
            employ.displayingInformationAboutAnEmployee();
        }
    }
}
}