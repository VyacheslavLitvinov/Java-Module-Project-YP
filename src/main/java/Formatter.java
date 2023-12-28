import java.util.Scanner;

public class Formatter {
//equalsIgnoreCase()
private static final Scanner scanner = new Scanner(System.in);
    String convertRub = "";
    String convertProd = "";
    String convertFloat = "";

    //Метод определяет окончание рубля по целочисленному значению
    public void convertTextPrice(double rub){
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

    //Метод валидирует введенное значение, если это не int
    public static int formIntInput() {

        while(!scanner.hasNextInt()) {
            System.out.println("Введите валидное число!");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

    //Метод валидирует введенное значение, если это не double
    public static float formDoubleInput() {

        while(!scanner.hasNextFloat()) {
            System.out.println("Введите валидное число!");
            scanner.next();
        }
        return scanner.nextFloat();
    }

    //Метод форматирует float значение до дух знаков после запятой
    public void roundFloat(double f) {

        convertFloat = String.format("%.2f", f);
    }



}
