import java.util.Scanner;

public class Calculator {
    private static final Scanner scanner = new Scanner(System.in);
    double price = 0;
    int people = 0;
    String products = "";
    int counterProd = 0;

    //Метод валидирующий кол-во людей
    public void peopleDecision(int userPeople) {
        while (userPeople <= 1){
            if (userPeople < 0){
                System.out.println("Введено некорректное значение\n" +
                        "Введите больше одного человека");
            } else if (userPeople == 1) {
                System.out.println("В этом случае нет смысла ничего считать и делить\n" +
                        "Введите больше одного человека");
            } if (userPeople == 0) {
                System.out.println("Кол-во гостей не может быть равно 0\n" +
                        "Введите больше одного человека");
            }
            userPeople = scanner.nextInt();
        }
        people = userPeople;
    }

    //Метод-счетчик товаров
    public void productCounter(String userProduct){
        products += userProduct + "\n";
        counterProd += 1;
    }

    //Метод-счетчик суммы
    public void priceCounter(double userPrice){
        price += userPrice;
    }


}
