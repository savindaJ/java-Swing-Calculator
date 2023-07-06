package lk.ijse.calculator.obj;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    private JPanel buttonPanel;
    private JPanel displayPanel;
    private JPanel namePanel;
    private JPanel downPanel;
    private JPanel lblPanel;
    private JTextField txt1;
    private JTextField txt2;
    private JLabel lblName;


    private String operator;
    private String numberOne;
    private String numberTwo;
    private double num1;
    private double num2;
    private double result;

    private JButton[] buttons =  new JButton[18];

    Calculator(){
        setNumbers();
    }

    private void setNumbers() {
        for (int i = 0; i < 10; i++) {
            buttons[i]=new JButton(i+"");
            buttons[i].addActionListener(this);
        }


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
