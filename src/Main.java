public class Main {
    public static void main(String[] args) {

        int price = 740;  // стоимость билета
        int mileBonus = 20;  // количество рублей за 1 милю
        int wallet = price / 20; // итоговое количество миль за покупку

        System.out.println("Итоговый бонус:" + wallet);

    }
}