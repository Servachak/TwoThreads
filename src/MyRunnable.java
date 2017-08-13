/**
 * Created by adavi on 13.08.2017.
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
/**---------------- В методі run() створюємо цикл який буде виводити на екран 10 раз імя того потоку який працює------------**/
        for (int i = 0; i < 10; i++){

            String threadName = Thread.currentThread().getName();
            System.out.println("Зараз працює " + threadName);
        }
    }
}
