public class Product {
    String name = "";
    Float price = 0.0F;
    int counterProd = 0;

    //Метод-счетчик товаров
    public void productCounter(String userProduct){
        name += userProduct + "\n";
        counterProd += 1;
    }

    //Метод-счетчик суммы
    public void priceCounter(float userPrice){
        price += userPrice;
    }
}