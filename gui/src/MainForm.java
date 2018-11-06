import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    private JPanel panel;
    private JButton ВыполнитьButton;
    private JTextField textField1;
    private JLabel ViewOutData;
    private JComboBox comboBoxTask;
    private JTextArea conditionTask;

    public MainForm() {
        super("My program");   //заголовок приложения
        this.getContentPane().add(panel);
        setSize(new Dimension(380, 300));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // "убить" процесс при закрытии приложения

        this.ВыполнитьButton.addActionListener(new MyButtonListener());

        //устанавливаем форматирование описания задачи
        conditionTask.setColumns(40);
        conditionTask.setLineWrap(true);
        conditionTask.setWrapStyleWord(true);

        //"включаем" комбобокс + реализуем смену описания при выборе задачи
        this.comboBoxTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int taskNumber = (int) comboBoxTask.getSelectedIndex();
                if (taskNumber == 0)
                    conditionTask.setText("Эта программа позволяет разложить число на разряды. Пример: 1234 = 1000 + 200 + 30 + 4");
                if (taskNumber == 1) conditionTask.setText("Тут будет что-то про SQL");
            }
        });
    }

    private class MyButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Main.initData = textField1.getText();
            int taskNumber = (int) comboBoxTask.getSelectedIndex();
            if (taskNumber == 0) {
                FirstTask.MainFirstTask();
            }
            if (taskNumber == 1) {
                SecondTask.MainSecondTask();
            }
            updateViewOutData(taskNumber);
        }
    }

    private void updateViewOutData(int taskNumber) {

        if (taskNumber == 0) {
            ViewOutData.setText(FirstTask.outData);
        }

        if (taskNumber == 1) {
            ViewOutData.setText(SecondTask.outData);
        }
    }


}
