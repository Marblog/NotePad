import javax.swing.*;

/**
 * @author 马杰
 * @date 2018.11.21
 */
public class Main {
    public static void main(String[] args) {
        SplashWindow.star();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Notepad().setVisible(true);
    }
}
