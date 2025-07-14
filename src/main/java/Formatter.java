import java.util.Scanner;

public class Formatter {

    String convertRub = "";
    String convertProd = "";
    String convertFloat = "";

    //Метод определяет окончание рубля по целочисленному значению
    public void convertTextPrice(float rub){
        int lastNum = (int) (rub % 10);
        int twoLastNum = (int) (rub % 100);

        if (lastNum == 1 && twoLastNum != 11) {
            convertRub = " рубль";
        } else if (1 < lastNum && lastNum <= 4) {
            convertRub = " рубля";
        } else if (10 <= twoLastNum && twoLastNum <= 20){
            convertRub = " рублей";
        } else {
            convertRub = " рублей";
        }

    }

    //Метод определяет окончание товара по целочисленному значению
    public void convertTextProd(int prod){
        prod = prod % 10;

        if (prod == 1) {
            convertProd = " товар";
        } else if (1 < prod && prod < 5) {
            convertProd = " товара";
        } else {
            convertProd = " товаров";
        }

    }

    //Метод валидирует введенное значение по сумме товара
    public static float formDoubleInput() {
        double input = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println("Введите сумму товара:");
            String userInput = Main.scanner.nextLine();
            if (userInput.length() == 0) {
                System.out.println("Значение не может быть пустым.");
            } else {
                try {
                    input = Double.parseDouble(userInput.replaceAll(",", "."));
                    valid = true;
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод.");
                }
            }
        }
        return (float) input;
    }

    //Метод форматирует float значение до дух знаков после запятой
    public void roundFloat(float f) {
        convertFloat = String.format("%.2f", f);
    }

    //Метод валидирует пустые значения или занчения из пробелов
    public static String form(String input) {
        input = input.trim();

        if (!input.isEmpty()){
            return input;
        } else {
            while (input.isEmpty()) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Значение не может быть пустым!");
                input = scanner.nextLine().trim();
            }
        }
        return input;
    }

}
