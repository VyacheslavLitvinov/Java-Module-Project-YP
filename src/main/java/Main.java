import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String answer = "Да";
        Calculator calc = new Calculator();
        Formatter form  = new Formatter();


        System.out.println("На скольких человек необходимо разделить счёт?");
        int people = Formatter.formIntInput();
        calc.peopleDecision(people);

        while (!answer.equalsIgnoreCase("Завершить")){
            System.out.println("Введите название товара");
            String productName = scanner.nextLine();
            calc.productCounter(productName);

            System.out.println("Введите сумму");
            float userPrice = Formatter.formDoubleInput();
            calc.priceCounter(userPrice);

            System.out.println("Товар " + productName + " успешно добавлен.\n" +
                    "Добавить еще один товар?");
            answer = scanner.nextLine();
        }

        if (answer.equalsIgnoreCase("Завершить")){
            form.convertTextPrice(calc.price);
            form.convertTextProd(calc.counterProd);
            form.roundFloat((float) calc.price);
            System.out.println("Всего добавлено " + calc.counterProd + form.convertProd + ": \n" +
                    calc.products +
                    "На сумму " + form.convertFloat + form.convertRub);
            form.convertTextPrice(calc.price/ calc.people);
            form.roundFloat((float) (calc.price/calc.people));
            System.out.println("Выходит " + form.convertFloat + form.convertRub + " с каждого человека ");
        }


    }

}