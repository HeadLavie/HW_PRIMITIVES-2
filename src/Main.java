// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int reward = 100;

        int added_rubles = 1100;

        int bonus;

        int amount = reward + added_rubles;

        if (added_rubles < 1000) {

            bonus = 0;
        } else {
            bonus = added_rubles / 100;
        }

        int final_amount = amount + bonus;

        System.out.println("Итоговый бонус: " + bonus);
        System.out.println("Счет:" + final_amount);
    }
}