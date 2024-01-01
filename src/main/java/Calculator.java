public class Calculator {
    int people = 0;

    //Метод валидирующий кол-во людей
    public void peopleDecision() {
        System.out.println("На скольких человек необходимо разделить счёт?\nВведите количество людей: ");
        int userPeople = 0;
        do {
            String input = Main.scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Вы не ввели значение.\nВведите количество людей:");
                continue;
            }
            try {
                userPeople = Integer.parseInt(input);
                if (userPeople <= 1) {
                    switch (userPeople) {
                        case 0:
                            System.out.println("Количество гостей не может быть равно 0.\nВведите больше одного человека:");
                            break;
                        case 1:
                            System.out.println("В этом случае нет смысла ничего считать и делить.\nВведите больше одного человека:");
                            break;
                        default:
                            System.out.println("Введено некорректное значение.\nВведите больше одного человека:");
                            break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Введено некорректное значение.\nВведите больше одного человека:");
                userPeople = -1;
            }
        } while (userPeople <= 1);

        System.out.println("Количество людей: " + userPeople);
        people = userPeople;
    }
}
