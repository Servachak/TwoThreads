/**
 * Created by adavi on 13.08.2017.
 */
public class Main {

    public static void main(String[] args) {

        MyRunnable runner = new MyRunnable();

        /**-------------- Створюємо два потоки --------------**/
        Thread alpha = new Thread(runner);
        Thread betta = new Thread(runner);

        /**-------------- Даюмо їм імена -------------------**/
        alpha.setName(" Альфа");
        betta.setName(" Бетта");

        /**-------------- Запускаємо потоки ------------------**/
        alpha.start();
        betta.start();
    }
}
