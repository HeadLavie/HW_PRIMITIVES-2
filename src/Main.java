// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    int x = 100;

    int y = 1100;

    int bonus;

    int amount = x+y;

    if (y<1000) {

        bonus = 0;
    } else {
        bonus = y / 100;
    }

    System.out.println("Итоговый бонус: " + bonus);
    System.out.println("Счет:" + amount);
    }
}