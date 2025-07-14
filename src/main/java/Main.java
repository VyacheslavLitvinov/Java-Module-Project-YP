import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String answer = "Да";
        Calculator calc = new Calculator();
        Formatter form  = new Formatter();
        Product prod = new Product();

        calc.peopleDecision();

        while (!answer.equalsIgnoreCase("Завершить")){
            System.out.println("Введите название товара");
            String inp = scanner.nextLine();
            String productName = Formatter.form(inp);
            prod.productCounter(productName);

            float userPrice = Formatter.formDoubleInput();
            while (userPrice < 0 || userPrice == 0){
                System.out.println("Треубется ввести сумму больше нуля.");
                userPrice = Formatter.formDoubleInput();
            }
            prod.priceCounter(userPrice);

            System.out.println("Товар " + productName + " успешно добавлен.\n" +
                    "Добавить еще один товар?");
            answer = scanner.nextLine();
        }

        if (answer.equalsIgnoreCase("Завершить")){
            form.convertTextPrice(prod.price);
            form.convertTextProd(prod.counterProd);
            form.roundFloat(prod.price);
            System.out.println("Всего добавлено " + prod.counterProd + form.convertProd + ": \n" +
                    prod.name +
                    "На сумму " + form.convertFloat + form.convertRub + ".");
            form.convertTextPrice(prod.price/ calc.people);
            form.roundFloat(prod.price/calc.people);
            System.out.println("Выходит " + form.convertFloat + form.convertRub + " с каждого человека.");
        }


    }

}