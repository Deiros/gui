import javax.swing.*;
import java.awt.*;

public class Main {
    public static String initData;


    public static void main(String[] args) {
        //создание графического окна + запуск по центру экрана
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int sizeWidth = 400;
        int sizeHeight = 300;
        int locationX = (screenSize.width - sizeWidth) / 2;
        int locationY = (screenSize.height - sizeHeight) / 2;
        MainWindow mainWindow = new MainWindow();
        mainWindow.setBounds(locationX, locationY, sizeWidth, sizeHeight);

        //запуск приложения
        mainWindow.setVisible(true);
        ////////////////////////////

 }
}